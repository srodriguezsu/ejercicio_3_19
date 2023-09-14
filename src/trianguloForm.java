import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trianguloForm extends JFrame {
    protected JPanel panTriangulo;
    private JLabel tagLado;
    private JLabel tagTitle;
    private JLabel tagPerimetro;
    private JLabel outPerimetro;
    private JLabel tagAltura;
    private JSpinner inLado;
    private JLabel outAltura;
    private JLabel tagArea;
    private JLabel outArea;
    private JButton evaluarButton;
    TrianguloEquilatero triangulo1 = new TrianguloEquilatero(0);
public trianguloForm() {
    inLado.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            triangulo1.setLado(Double.parseDouble(inLado.getValue().toString()));
            outAltura.setText(String.valueOf(triangulo1.getAltura()));
            outArea.setText(String.valueOf(triangulo1.getArea()));
            outPerimetro.setText(String.valueOf(triangulo1.getPerimetro()));
        }
    });
    evaluarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            triangulo1.setLado(Double.parseDouble(inLado.getValue().toString()));
            outAltura.setText(String.valueOf(triangulo1.getAltura()));
            outArea.setText(String.valueOf(triangulo1.getArea()));
            outPerimetro.setText(String.valueOf(triangulo1.getPerimetro()));
        }
    });
}
}
