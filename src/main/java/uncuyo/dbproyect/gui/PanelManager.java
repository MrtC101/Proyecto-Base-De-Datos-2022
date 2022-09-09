/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.gui;
import javax.swing.JPanel;
/**
 *
 * @author Martín 
 */
public class PanelManager {
    
    public static ViewPanel view = new ViewPanel();
    public static CreatePanel create = new CreatePanel();
    public static PredefinedSearch predSearch= new PredefinedSearch();
    public static UpdatePanel update = new UpdatePanel();
    public static DeregisterPanel deregister = new DeregisterPanel();
    
    public static void main(String args[]) {
        /* Create and display the form */
        Runnable obj = new Runnable() {
            public void run() {
                PanelManager.view.setVisible(true);
            }
        };
        java.awt.EventQueue.invokeLater(obj);
    }
}
