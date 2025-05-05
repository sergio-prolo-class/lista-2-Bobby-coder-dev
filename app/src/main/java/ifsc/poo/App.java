package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class App {

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        draw.setCanvasSize(1000, 600);

        draw.setXscale(0, 1000);
        draw.setYscale(0, 600);

        Navio navios[] = new Navio[5];
        
        navios[0] = new Navio(4, 0, 0, "horizontal", 1);
        navios[0].desenhar(draw);
        navios[1] = new Navio(5, 3, 2, "vertical", 1);
        navios[1].desenhar(draw);
        navios[2] = new Navio(3, 5, 1, "vertical", 1);
        navios[2].desenhar(draw);
        navios[3] = new Navio(3, 7, 5, "vertical", 1);
        navios[3].desenhar(draw);
        navios[4] = new Navio(2, 1, 8, "horizontal", 1);
        navios[4].desenhar(draw);

        Grade grade = new Grade(50, 100);
        grade.desenhar(draw);
        Grade grade2 = new Grade(550, 100); //+400 por conta ja ter uma grade e mais 100 por espaçamento
        grade2.desenhar(draw);

        draw.show();
        
    }
}
