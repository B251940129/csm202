package lab12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        JFrame frame = new JFrame("Calculator");
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        JTextField txt1 = new JTextField();
        JTextField txt2 = new JTextField();
        JTextField result = new JTextField();
        result.setEditable(false);

        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton mulBtn = new JButton("*");
        JButton divBtn = new JButton("/");

        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txt1.getText());
                    double b = Double.parseDouble(txt2.getText());

                    String op = e.getActionCommand();
                    double res = calc.calculate(a, b, op);

                    result.setText(String.valueOf(res));

                } catch (Exception ex) {
                    result.setText("Алдаа!");
                }
            }
        };

        addBtn.addActionListener(action);
        subBtn.addActionListener(action);
        mulBtn.addActionListener(action);
        divBtn.addActionListener(action);

        panel.add(new JLabel("1-р тоо:"));
        panel.add(txt1);

        panel.add(new JLabel("2-р тоо:"));
        panel.add(txt2);

        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(mulBtn);
        panel.add(divBtn);

        panel.add(new JLabel("Хариу:"));
        panel.add(result);

        frame.add(panel);
        frame.setVisible(true);
    }
}