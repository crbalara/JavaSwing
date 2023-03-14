import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleFrame {

    public static void main(String[] args) {

        JFrame jf1 = new JFrame("Server Frame");
        JLabel label = new JLabel();
        JFrame jf2 = new JFrame("Client Frame");

        JButton btn1 = new JButton();
        JButton btn2 = new JButton();


        jf1.setSize(200,200);
        jf1.setLayout(null);
        jf1.setBounds(20,30,200,145);

        btn1.setText("ON");
        btn1.setBounds(10,20,60,25);
        btn2.setText("OFF");
        btn2.setBounds(60,20,60,25);

        jf1.add(btn1);
       // jf1.add(btn2);


        jf2.setSize(600,450);
        jf2.setLayout(null);
        jf2.setBounds(10,30,400,400);


        label.setBounds(40,60,300,350);
        label.setIcon(new ImageIcon("C:\\Users\\91876\\Desktop\\png-transparent-light-bulb-illustration-incandescent-light-bulb-lamp-bulb-candle-product-light-thumbnail.png"));
        jf2.add(label);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn1.getText() == "ON") {
                    btn1.setText("OFF");
                    label.setIcon(new ImageIcon("C:\\Users\\91876\\Desktop\\png-clipart-creative-bulb-lightbulb-energy-saving-lamps-thumbnail.png"));
                } else {
                    btn1.setText("ON");
                    label.setIcon(new ImageIcon("C:\\Users\\91876\\Desktop\\png-transparent-light-bulb-illustration-incandescent-light-bulb-lamp-bulb-candle-product-light-thumbnail.png"));


                }
            }
        });



      /*  btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    label.setIcon(new ImageIcon("C:\\Users\\91876\\Desktop\\png-transparent-light-bulb-illustration-incandescent-light-bulb-lamp-bulb-candle-product-light-thumbnail.png"));

            }
        });*/

        jf1.setVisible(true);
        jf2.setVisible(true);


    }
}
