package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class App {

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        draw.setCanvasSize(1000, 600);

        draw.setXscale(0, 1000);
        draw.setYscale(0, 600);

        Grade grade = new Grade(100, 100);
        grade.desenhar(draw);

        Navio navio1 = new Navio(4, 4, 6, "horizontal");
        navio1.desenhar(draw);

        draw.show();
        
    }
}
