package ifsc.poo;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Navio {
    private int tamanho;
    private int x;
    private int y;
    private int grade;
    private boolean vertical; 

    public Navio(int tamanho, int x, int y, String orientacao, int grade) {
        this.tamanho = tamanho;
        this.x = x;
        this.y = y;
        this.grade = grade;
        this.vertical = orientacao.equals("vertical");
    }

    public void desenhar(Draw draw) {
        //acertar centro inicial
        double xCentro = (grade == 1 ? 70 : 570) + (40 * x); 
        double yCentro = (grade == 1 ? 120 : 620) + (40 * y);
        for (int i = 0; i < tamanho; i++) {
            draw.setPenColor(Draw.BOOK_RED);
            draw.filledSquare(xCentro, yCentro, 20); //desenha o quadrado   

             if (vertical) {
                yCentro += 40; // Se for vertical, desce
            } else {
                xCentro += 40; // Se for horizontal, vai para a direita
            }
        }
        draw.setPenColor();
    }
}