/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdbconnector;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Mark
 */
public class GalaxyFrame extends JFrame{
    
    public GalaxyMapPanel galaxyPanel;// = new GameJPanel();
     public ButtonPanel buttonPanel;// = new GameJPanel();
    
    public GalaxyFrame(){
        super ("Gravity Test");
                getContentPane().setLayout(new BorderLayout());
                //galaxyPanel = new GalaxyMapPanel(0,0);
                buttonPanel = new ButtonPanel(21);
                getContentPane().add(buttonPanel,"Center");
                // galaxyPanel.createScreen();                                                                   //landPanel.setVisible(false);
		//getContentPane().add(skyPanel,"Center");
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (820, 800);
		setVisible(true);
    }
    
}