import javax.swing.*;
import java.awt.*;

public class JavaSwing {


    public static void main(String[] args) {
        JFrame frame = new JFrame("CCTNS");
        frame.setSize(260,180);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.ORANGE);

        JButton btn = new JButton();
        JButton btn2 = new JButton();
        JButton btn3 = new JButton("Back");
        JButton btn4 = new JButton("Need");
        JButton btn5 = new JButton("Last Page");
        frame.add(btn);
        frame.setLayout(new BorderLayout(10,20));
       frame.add(btn,BorderLayout.NORTH);
       btn.setText("Submit");
       btn.setBackground(Color.cyan);


        frame.add(btn2);
        frame.add(btn2,BorderLayout.SOUTH);
        btn2.setText("Try Again");
        btn2.setBackground(Color.cyan);

        frame.add(btn3);
        frame.add(btn3,BorderLayout.EAST);
        btn3.setBackground(Color.cyan);

        frame.add(btn4);
        frame.add(btn4,BorderLayout.WEST);
        btn4.setBackground(Color.cyan);

        frame.add(btn5);
        frame.add(btn5,BorderLayout.CENTER);
        btn5.setBackground(Color.blue);


    }

}
