import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class GUI extends JFrame {
    private JPanel JPanel;
    private JButton closeButton;
    private JButton witajButton;
    private JLabel textLabel;
    private JLabel dateLabel;
    private JButton klikButton;
    private JPanel JPanelLabel;
    private JPanel JPanelData;

    public static void main(String[] args) {
        GUI swingApp=new GUI();
        swingApp.setVisible(true);
    }

    public GUI(){
        super("Konwerter");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width=450, height=250;
        this.setSize(width, height);

        witajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=JOptionPane.showInputDialog("Podaj imie: ");
                JOptionPane.showMessageDialog(null, "Witaj  "+text);
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        klikButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setText("To jest tekst po zmianie: ");
                dateLabel.setText(new Date().toString());
            }
        });
    }
}
