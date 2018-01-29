package UI;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import UI.Panel;;

public class TFrame extends JFrame {
	
	//Frame Constructor
	public TFrame() {
        setSize(640, 840);
        setTitle("Tetris");
        addWindowListener(new WindowAdapter() {
      	  public void windowClosing(WindowEvent e) {
      	    int confirmed = JOptionPane.showConfirmDialog(null, 
      	        "Are you sure you want to exit the game?", "Exit Program Message Box",
      	        JOptionPane.YES_NO_OPTION);
      	    if (confirmed == JOptionPane.YES_OPTION) {
      	      dispose();
      	    }
      	  }
      	});
        
        statusbar = new JLabel("Score: 0");
        statusbar.setFont(new Font (Font.DIALOG, Font.BOLD, 28));
        add(statusbar,BorderLayout.SOUTH);
        
        
        Panel panel = new Panel(this);
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
                "Arial", Font.LAYOUT_LEFT_TO_RIGHT, 18)));  
        
        JOptionPane.showMessageDialog(panel,
        		"Welcome to Tetris \n "
        		+ "Instructions for the game\n"
        		+ " You have to eliminate rows of blocks\n"
        		+ " by fitting them in the empty spaces\n"
        		+ " More blocks eliminated, more points\n"
        		+ " you will get.\n"
        		+ " Keys : \n"
        		+ " Navigation:\n"
        		+ " 1. Left : LEFT\n"
        		+ " 2. Right: RIGHT\n"
        		+ " Rotation: UP\n"
        		+ " Drop down: DOWN\n"
        		+ " Speed Up Drop: <D> or <d> \n"
        		+ " Pause: Press <P>");
        add(panel);
        panel.start();
	 }
	
	public JLabel getStatusBar() {
	       return statusbar;
	   }

	//Variable Declaration.
	private static final long serialVersionUID = 1L;
	JLabel statusbar,score;
}
