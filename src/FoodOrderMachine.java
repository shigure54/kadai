import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderMachine {
    private JPanel root;
    private JLabel Title1;
    private JLabel Title2;
    private JButton tempButton;
    private JButton karaButton;
    private JButton gyouButton;
    private JButton udonButton;
    private JButton HBGButton;
    private JButton ramenButton;
    private JTextPane ReceivedInfo;
    private JButton checkOutButton;
    private JLabel pricebox;
    int totalprice = 0;


    public FoodOrderMachine() {
        tempButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order("Tempura",100);
                tempButton.setIcon(new ImageIcon(this.getClass().getResource("C:\\Users\\54728\\Desktop\\@DYP4)UR)YL_C548J75@6Z3.png")));
            }
        });
        karaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order("Karaage",200);
            }
        });
        gyouButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order("Gyouza",300);
            }
        });
        udonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order("Udon",400);
            }
        });
        HBGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order("Hamburger",500);
            }
        });
        ramenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order("Ramen",600);
            }
        });
        checkOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Thank you! The total price is " + totalprice + "yen");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FoodOrderMachine");
        frame.setContentPane(new FoodOrderMachine().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    void order(String food , int price) {
        int confirmation = JOptionPane.showConfirmDialog(null, "Would you like to order " + food + "?", "Order Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmation == 0) {
            String text = "Order for " + food + " received.";
            String currentText = ReceivedInfo.getText();;
            ReceivedInfo.setText(currentText + food + " "+ price + "yen" + "\n");
            JOptionPane.showMessageDialog(null, text);
            this.totalprice += price;
            pricebox.setText(this.totalprice + "yen");
        }

    }
}
