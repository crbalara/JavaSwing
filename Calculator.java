import javax.swing.*;
import javax.swing.tree.VariableHeightLayoutCache;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    static int a,b,c,d;


    public static void main(String[] args) {
        JFrame fram = new JFrame("CalCulator");
        fram.setSize(650, 480);
        fram.setLayout(null);


        JPanel panel = new JPanel();
        panel.setBounds(60, 150, 500, 250);
        panel.setLayout(new GridLayout(5, 4));
        fram.add(panel);

        JTextField tf = new JTextField(16);
        tf.setBackground(Color.lightGray);
        tf.setFont(new Font("Arial",Font.BOLD,40));
        tf.setBounds(60, 50, 500, 60);
        fram.add(tf);

        String array[] = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "00", "/", "C", "%", "MOD", "="};
        for (int i = 0; i < array.length; i++) {
            JButton btn = new JButton();
            btn.setFont(new Font("Arial",Font.BOLD,40));
            btn.setText(array[i]);
            panel.add(btn);

                if (array[i].equals("+")) {
                    btn.setBackground(Color.magenta);
                }
                if (array[i].equals("-")) {
                    btn.setBackground(Color.magenta);
                }
                if (array[i].equals("*")) {
                    btn.setBackground(Color.magenta);
                }
                if (array[i].equals("/")) {
                    btn.setBackground(Color.magenta);
                }
                if (array[i].equals("=")) {
                    btn.setBackground(Color.cyan);
                }
                if (array[i].equals("%")) {
                    btn.setBackground(Color.magenta);
                }
                if (array[i].equals("MOD")) {
                    btn.setBackground(Color.magenta);
                }
                if (array[i].equals("C")) {
                    btn.setBackground(Color.magenta);
                }
            btn.addActionListener(e->{
                tf.setText(tf.getText()+btn.getText());
            });

            }
            fram.setVisible(true);
        }
    }