
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainOverview extends JFrame {

    JPanel p = new JPanel();
    JButton b = new JButton("hello");
    JTextField t = new JTextField("Hi", 20);
    JTextArea ta = new JTextArea("How does this look?", 2, 20);
    JLabel l = new JLabel("Lable");
    public static void main(String[] args) {
        new MainOverview();

    }

    public MainOverview(){
        super("GUI");
        setSize(400,300);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p.add(b);
        p.add(t);
        p.add(ta);
        p.add(l);
        add(p);

        setVisible(true);
    }
}