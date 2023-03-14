import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Practice Frame");
        frame.setLayout(null);
       // frame.setBounds(10,30,700,700);
        frame.setSize(900,800);
      /*  DefaultListModel<String> list1 = new DefaultListModel<String>();
        list1.addElement("A");
        list1.addElement("B");
        list1.addElement("C");
        list1.addElement("D");
        JList list = new JList<>(list1);
        list.setSize(200,180);
        list.setBounds(80,20,200,80);
        frame.add(list);*/

        JButton button = new JButton("Choose file");
        button.setBounds(700,610,100,80);
 //       frame.add(button);

        JFileChooser chooser = new JFileChooser();
        chooser.setBounds(80,120,590,550);
        var file = chooser.getSelectedFile();

        JTextField tf = new JTextField(" ");
        tf.setBounds(50,30,200,50);

        JTextField tf1 = new JTextField(" ");
        tf.setBounds(200,30,100,50);


        JTabbedPane tp = new JTabbedPane();
       // tp.setLayout(null);
        //tp.setSize(900,750);
        tp.setBounds(10,10,900,750);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);

        tp.addTab("First",null,panel);
        panel.add(chooser);
        tp.addTab("Second",null,panel1);
        panel1.add(tf);
        panel1.add(tf1);
        tp.addTab("Third",null,panel2);
        frame.add(tp);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.getText();
                frame.add(tp);

            }
        });

        frame.setVisible(true);

    }

}
