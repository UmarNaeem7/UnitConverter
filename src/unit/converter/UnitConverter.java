package unit.converter;

import java.net.MalformedURLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class UnitConverter {

    public static void main(String[] args) throws MalformedURLException, UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (Exception e) {
        }
        
        GUI app = new GUI();
        app.setVisible(true);
    }
    
}
