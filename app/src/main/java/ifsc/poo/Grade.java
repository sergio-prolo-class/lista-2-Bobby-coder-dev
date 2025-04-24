package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int linhas;
    private int colunas;
    private double x;
    private double y;
    private double larguraCelula;
    private double alturaCelula;

    public Grade(int x, int y) {
        this.linhas = 10;
        this.colunas = 10;

        this.larguraCelula = 40;
        this.alturaCelula = 40;

        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw draw){
        //linhas horizontais
        for (int i = 0; i <= linhas; i++) {
            double yAtual = y + i * alturaCelula; // para ir subindo as linhas
            if (i != linhas) draw.text(x - 20, yAtual + 20, String.format("%c", 'A' + i)); // Cordenadas horizontais
            draw.line(x, yAtual, x + colunas * larguraCelula, yAtual);
        }

        //linhas verticais
        for (int i = 0; i <= colunas; i++) {
            double xAtual = x + i * larguraCelula; // para ir para a direita 
            if (i != linhas) draw.text(xAtual + 20, y - 20, String.valueOf(i)); // Cordenadas verticais
            draw.line(xAtual, y, xAtual, y + linhas * alturaCelula);
        }
    }
} 