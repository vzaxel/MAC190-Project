import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WelcomePage extends BankAccount implements ActionListener {

    String menu = """
            What would you like to do?
            1 - CHECK BALANCE
            2 - DEPOSIT
            3 - WITHDRAW
            4 - EXIT""";
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");
    JTextArea menuLabel = new JTextArea(menu);
    JLabel choiceLabel = new JLabel("Choice:");
    JTextField choiceField = new JTextField();
    JLabel warning = new JLabel("Invalid Option");

    JButton enterButton = new JButton("Enter");

    WelcomePage(String userID) {

        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setText("Hello " + userID);
        menuLabel.setBounds(0, 40, 350, 150);
        menuLabel.setFont(new Font(null, Font.PLAIN, 20));
        warning.setBounds(0,300,200,35);
        warning.setFont(new Font(null, Font.PLAIN,25));
        warning.setVisible(false);
        choiceLabel.setBounds(10, 200, 50, 25);
        choiceField.setBounds(90, 200, 75, 25);
        enterButton.setBounds(90, 225, 75, 25);
        enterButton.setFocusable(false);
        enterButton.addActionListener(this);

        frame.add(welcomeLabel);
        frame.add(menuLabel);
        frame.add(choiceLabel);
        frame.add(choiceField);
        frame.add(enterButton);
        frame.add(warning);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterButton) {
            String Option = choiceField.getText();
            do {
                int actionsPerformed=0;
                if (Option.equals("1") && actionsPerformed < 1) {
                    Balanceavail balanceavail = new Balanceavail();
                    actionsPerformed=1;
                    frame.dispose();
                    break;
                }
                else if (Option.equals("2") && actionsPerformed < 1) {
                    Deposit deposit = new Deposit();
                    actionsPerformed=1;
                    break;
                }
                else if (Option.equals("3") && actionsPerformed < 1) {
                    Withdraw withdraw = new Withdraw();
                    actionsPerformed =1;
                    break;
                }
                else
                    warning.setVisible(true);
            }while(!Option.equals("4"));
        }
    }
}
