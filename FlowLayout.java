import javax.swing.*;

public class FlowLayout {
    public static void main(String[] args) {

        JFrame frame = new JFrame("FlowLayout");
        frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));
        frame.setBounds(10,20,200,180);
        frame.setSize(400,250);
        frame.setVisible(true);

        JButton btn = new JButton("Start");
        frame.add(btn);
        JButton btn1 = new JButton("Stop");
        frame.add(btn1);
        JButton btn2 = new JButton("reStart");
        frame.add(btn2);
    }
}
