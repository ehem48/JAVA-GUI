import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI1 extends JFrame {
    private JPanel JPanel;
    private JTextField textFieldA;
    private JButton konwertujButton;
    private JButton wyjścieButton;
    private JLabel JLabelWynik;

    public static void main(String[] args) {
        GUI1 swingApp=new GUI1();
        swingApp.setVisible(true);

    }
    double temp, wynik;

    public GUI1(){
        super("Mój kalkulator");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width=500, height=250;
        this.setSize(width, height);




        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp=Double.parseDouble(textFieldA.getText());
                wynik=1.8*temp+32;
                JLabelWynik.setText("Temperatura: "+temp+"°C"+" po przekonwertowaniu wynosi: "+wynik+" °F");
            }
        });
    }


}
