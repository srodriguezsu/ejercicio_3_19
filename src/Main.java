import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        trianguloForm window = new trianguloForm();
        window.setContentPane(window.panTriangulo);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(600,400);
        window.setVisible(true);
        window.setTitle("Triangulo Equilatero");
    }
}