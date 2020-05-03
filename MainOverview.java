
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainOverview extends JFrame implements ActionListener {

    /**
     *
     */
    ArrayList<Patient> paitentL = new ArrayList<Patient>();
    private static final long serialVersionUID = 1L;
    JPanel p = new JPanel();
    JButton bSubmit = new JButton("Submit");
    JButton bReset = new JButton("Reset")
    JTextField tName = new JTextField("Name Here", 20);
    JTextField tAge = new JTextField("Age Here", 5);
    JTextArea ta = new JTextArea("How does this look?", 2, 20);
    JLabel l = new JLabel("Lable");
    String choises[] = {"COVID-19", "condition 1", "condition 2"}
    JComboBox<String> cb = new JComboBox<>(choises);



    public static void main(String[] args) 
    {


        new MainOverview();

    }

    public MainOverview(){
        super("GUI");
        setSize(400,300);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p.add(bSubmit);
        p.add(bReset);
        p.add(tName);
        p.add(tAge);
        p.add(ta);
        p.add(l);
        p.add(cb);
        add(p);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Submit")){
            String n = tName.getText();
            int a = Integer.parseInt(tAge.getText());
            String c = cb.getSelectedItem().toString();
            paitentL.add(new Patient(n, a, c));
        }
        else if (e.getActionCommand().equals("Reset")){
            
        }

    }
    
}