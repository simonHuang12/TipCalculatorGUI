import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculatorGUI extends JFrame implements ActionListener, KeyListener {
    private JPanel panel1;
    private JTextArea tipTextArea;
    private JTextArea billTextArea;
    private JTextArea tipPercentTextArea;
    private JTextArea pplTextArea;
    private JTextArea totalTextArea;
    private JButton tipMinusButton;
    private JButton tipAddButton;
    private JButton pplMinusButton;
    private JButton pplAddButton;

    public CalculatorGUI(){
        createUIComponents();
    }
    private void createUIComponents(){
        //main things
        setContentPane(panel1);
        setTitle("Tip Calculator GUI");
        setSize(500, 500);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //listeners
        pplAddButton.addActionListener(this);
        pplMinusButton.addActionListener(this);
        tipAddButton.addActionListener(this);
        tipMinusButton.addActionListener(this);
        billTextArea.addKeyListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tipMinusButton){
            System.out.println("dog");
            tipPercentTextArea.append("dog");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
