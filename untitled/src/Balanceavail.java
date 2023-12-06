import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Balanceavail extends BankAccount implements ActionListener {
    JFrame depframe = new JFrame();
    JLabel label = new JLabel("Your current balance is $" +balance);
    JButton ok =  new JButton("OK");

    Balanceavail() {
        label.setBounds(0, 0, 350, 50);
        label.setFont(new Font(null, Font.PLAIN, 20));
        ok.setBounds(100,100,100,25);
        ok.setFocusable(false);
        ok.addActionListener(this);
        depframe.add(label);
        depframe.add(ok);
        depframe.setSize(420, 420);
        depframe.setLayout(null);
        depframe.setVisible(true);
        depframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ok)
        {
            depframe.dispose();
        }
    }
}
