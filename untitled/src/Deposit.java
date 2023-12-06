import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Deposit extends BankAccount implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("How much would you like to deposit?");
    JTextField response = new JTextField();
    JButton enterButton = new JButton("Enter");

    Deposit() {
        label.setBounds(0, 0, 350, 50);
        label.setFont(new Font(null, Font.PLAIN, 20));
        response.setBounds(100, 60, 200, 50);
        enterButton.setBounds(150, 150, 75, 25);
        enterButton.setFocusable(false);
        enterButton.addActionListener(this);

        frame.add(label);
        frame.add(response);
        frame.add(enterButton);

        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterButton) {
            String amt = response.getText();
            int amount = Integer.parseInt(amt);
            balance = balance + amount;
            frame.dispose();

        }
    }
}
