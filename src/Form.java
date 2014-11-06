import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Denis on 06.11.2014.
 */
public class Form extends JFrame {
    final DefaultListModel listModel = new DefaultListModel();
    private JPanel rootPanel;
    private JTextField textField;
    private JList list = new JList(listModel);
    private JButton buttonView;
    private JButton buttonAddToList;
    private JLabel lableText;
    private JLabel lableList;

    public Form() {
        super("Window with list");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        buttonView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onView();
            }
        });

        buttonAddToList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onAddToList();
            }
        });
    }

    private void onView(){
        String s = textField.getText();
        if(!s.equals(""))
            new TextView(textField.getText());
        else
            new TextView("Input text at text field!");
    }

    private void onAddToList(){
        listModel.addElement(textField.getText());
        textField.setText("");
    }
}
