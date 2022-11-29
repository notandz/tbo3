import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implementing ActionListener interface
public class Calculator implements ActionListener {
    //Creating variables for our calculations
    double number, answer;
    int calculation;

    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("*");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");

    Calculator() {
        prepareGUI();
        addComponents();
        frame.setVisible(true);
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(280, 450);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.gray);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.validate();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        //text field
        textField.setBounds(10, 50, 260, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        //button seven
        buttonSeven.setBounds(10, 110, 50, 50);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);
        buttonSeven.validate();

        //button eight
        buttonEight.setBounds(80, 110, 50, 50);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);
        buttonEight.validate();

        //button nine
        buttonNine.setBounds(150, 110, 50, 50);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.validate();
        frame.add(buttonNine);

        //button four
        buttonFour.setBounds(10, 170, 50, 50);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.validate();
        frame.add(buttonFour);

        //button five
        buttonFive.setBounds(80, 170, 50, 50);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.validate();
        frame.add(buttonFive);

        //button six
        buttonSix.setBounds(150, 170, 50, 50);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.validate();
        frame.add(buttonSix);

        //button one
        buttonOne.setBounds(10, 230, 50, 50);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.validate();
        frame.add(buttonOne);

        //button two
        buttonTwo.setBounds(80, 230, 50, 50);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.validate();
        frame.add(buttonTwo);

        //button three
        buttonThree.setBounds(150, 230, 50, 50);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.validate();
        frame.add(buttonThree);

        //button dot
        buttonDot.setBounds(150, 290, 50, 50);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.validate();
        frame.add(buttonDot);

        //button zero
        buttonZero.setBounds(10, 290, 130, 50);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.validate();
        frame.add(buttonZero);

        //button equal
        buttonEqual.setBounds(10, 350, 260, 50);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        buttonEqual.validate();
        frame.add(buttonEqual);

        //button div
        buttonDiv.setBounds(220, 110, 50, 50);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        buttonDiv.validate();
        frame.add(buttonDiv);

        //button mul
        buttonMul.setBounds(220, 230, 50, 50);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        buttonMul.validate();
        frame.add(buttonMul);

        //button minus
        buttonMinus.setBounds(220, 170, 50, 50);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        buttonMinus.validate();
        frame.add(buttonMinus);

        //button plus
        buttonPlus.setBounds(220, 290, 50, 50);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        buttonPlus.validate();
        frame.add(buttonPlus);
    }

    public void addActionEvent() {
        //Registering ActionListener to buttons
        buttonDiv.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }
    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }

        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == buttonEqual) {
            //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;

            }
        }


    }
}