import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * Created by Denis on 06.11.2014.
 */
public class Form extends JFrame {
    final Vector<String> obj = new Vector<String>();
    private JPanel rootPanel;
    private JTextField textField;
    private JButton buttonView;
    private JButton buttonAddToList;
    private JLabel lableText;
    private JLabel lableList;
    private JList list;

    public Form() {
        super("Window with list");
        list.setListData(obj);
        setContentPane(rootPanel);
        pack();
        setLocationRelativeTo(null);
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
        if(!s.equals("")) {
            new TextView(textField.getText());
        }
        else {
            new TextView("Input text at text field!");
        }
    }

    private void onAddToList(){
        if(checkText(textField.getText())) {
            obj.add(textField.getText());
            list.setListData(obj);
        }
        else {
            new TextView("This text is in the list!");
        }
        textField.setText("");
    }

    private boolean checkText(String s){
        for(String str:obj)
            if(str.equals(s)){
                return false;
            }
        return true;
    }
}
