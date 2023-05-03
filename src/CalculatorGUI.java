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
    private JButton billMinusButton;
    private JButton billAddButton;
    private TipCalculator calc;

    public CalculatorGUI(){
        createUIComponents();
        calc = new TipCalculator(0, 0, 1);
        billTextArea.setText("0");
        tipPercentTextArea.setText("0");
        pplTextArea.setText("0");
    }
    private void createUIComponents(){
        //main things
        setContentPane(panel1);
        setTitle("Tip Calculator GUI");
        setSize(500, 500);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //listeners
        pplAddButton.addActionListener(this);
        pplMinusButton.addActionListener(this);
        tipAddButton.addActionListener(this);
        tipMinusButton.addActionListener(this);
        billAddButton.addActionListener(this);
        billMinusButton.addActionListener(this);
        billTextArea.addKeyListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;

            try {
                if (button.equals(billAddButton)) {
                    double newBill = Double.parseDouble(billTextArea.getText()) + 1;
                    calc.setBill(newBill);
                    billTextArea.setText("" + newBill);
                } else if (button.equals(billMinusButton)) {
                    double newBill = Double.parseDouble(billTextArea.getText()) - 1;
                    calc.setBill(newBill);
                    billTextArea.setText("" + newBill);
                } else if (button.equals(tipAddButton)) {
                    int newTip = Integer.parseInt(tipPercentTextArea.getText()) + 1;
                    calc.setTipPercentage(newTip);
                    tipPercentTextArea.setText("" + newTip);
                } else if (button.equals(tipMinusButton)) {
                    int newTip = Integer.parseInt(tipPercentTextArea.getText()) - 1;
                    calc.setTipPercentage(newTip);
                    tipPercentTextArea.setText("" + newTip);
                } else if (button.equals(pplAddButton)) {
                    int newPeople = Integer.parseInt(pplTextArea.getText()) + 1;
                    calc.setNumberOfPeople(newPeople);
                    pplTextArea.setText("" + newPeople);
                } else if (button.equals(pplMinusButton)) {
                    int newPeople = Integer.parseInt(pplTextArea.getText()) - 1;
                    calc.setNumberOfPeople(newPeople);
                    pplTextArea.setText("" + newPeople);
                }
            } catch (Exception er) {
                System.out.println("error");
                throw er;
            }

            tipTextArea.setText("" + calc.getTip());
            totalTextArea.setText("" + calc.getBill());
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
