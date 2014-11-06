import javax.swing.*;

/**
 * Created by Denis on 05.11.2014.
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Form f = new Form();
            }
        });
    }
}
