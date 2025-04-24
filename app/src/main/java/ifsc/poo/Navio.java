package ifsc.poo;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Navio {
    private int tamanho;
    private int x;
    private int y;
    private boolean vertical; 

    public Navio(int tamanho, int x, int y, String orientacao) {
        this.tamanho = tamanho;
        this.x = x;
        this.y = y;
        this.vertical = orientacao.equals("vertical");
    }

    public void desenhar(Draw draw) {
        //acertar centro inicial
        double xCentro = (40 * x) + 120; 
        double yCentro = (40 * y) + 120;
        for (int i = 0; i < tamanho; i++) {
            draw.setPenColor(Color.RED);
            draw.filledSquare(xCentro, yCentro, 20); //desenha o quadrado   

             if (vertical) {
                yCentro += 40; // Se for vertical, desce
            } else {
                xCentro += 40; // Se for horizontal, vai para a direita
            }
        }
    }
}