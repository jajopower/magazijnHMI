import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class FrameHeader extends JFrame implements ActionListener{
    private JButton jb_noodstop = new JButton();
    private JMenuBar jmb_main = new JMenuBar();
    private JButton jb_home = new JButton("Home");
    private JButton jb_orders = new JButton("Orders");
    private JButton jb_producten = new JButton("Producten");
    private JButton jb_logboek = new JButton("Logboek");
    private JButton jb_settings = new JButton();


    public FrameHeader(){

        setTitle("JavaAplication/Home");
        setSize(1920, 1080);
        setLayout(new FlowLayout());

        jb_home.addActionListener(this);
        jmb_main.add(jb_home);
        jb_orders.addActionListener(this);
        jmb_main.add(jb_orders);
        jb_producten.addActionListener(this);
        jmb_main.add(jb_producten);
        jb_logboek.addActionListener(this);
        jmb_main.add(jb_logboek);

        jmb_main.add(Box.createHorizontalGlue());

        jmb_main.add(jb_settings);
        jmb_main.add(jb_noodstop);

        setJMenuBar(jmb_main);
        //voeg hieronder je paneel toe




        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb_home){
            System.out.println("test");
        }
    }
}
