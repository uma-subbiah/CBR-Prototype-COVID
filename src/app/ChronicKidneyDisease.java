package app;

import app.view.MainWindow;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ChronicKidneyDisease 
{

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            try
            {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
            catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {}
            
            MainWindow mainWindow = new MainWindow();
            mainWindow.setVisible(true);
        });
    }
    
}
