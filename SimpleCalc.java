import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalc {
    static  int a,b,c;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(600,500);
        frame.setLayout(null);

        JTextField tf = new JTextField();
        tf.setBounds(20,30,200,30);
        frame.add(tf);

        JTextField tf1 = new JTextField();
        tf1.setBounds(240,30,200,30);
        frame.add(tf1);

        JButton btn1 = new JButton("+");
        btn1.setBounds(120,100,100,30);
        frame.add(btn1);
        JButton btn2 = new JButton("-");
        btn2.setBounds(250,100,100,30);
        frame.add(btn2);

        JTextField tf3 = new JTextField();
        tf3.setBounds(170,160,150,30);
        frame.add(tf3);

         btn1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 a = Integer.parseInt(tf.getText());
                 tf.setText("");
                 b = Integer.parseInt(tf1.getText());
                 tf1.setText("");
                 c = a + b;
                 tf3.setText(Integer.toString(c));
             }
         });

         btn2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 a = Integer.parseInt(tf.getText());
                 tf.setText("");
                 b = Integer.parseInt(tf1.getText());
                 tf1.setText("");
                 c = a - b;
                 tf3.setText(Integer.toString(c));
             }
         });

         frame.setVisible(true);

     }
    }

