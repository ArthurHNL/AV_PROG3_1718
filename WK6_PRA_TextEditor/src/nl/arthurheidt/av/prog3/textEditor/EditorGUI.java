package nl.arthurheidt.av.prog3.textEditor;

import javax.swing.JFrame;

public class EditorGUI extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 4849428867276700214L;
    
    public EditorGUI() {
	super();
	this.setTitle("My Simple Text Editor");
	EditorGUIPane pane = new EditorGUIPane();
	this.setContentPane(pane);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
    }
    
    public void packAndShow() {
	this.pack();
	this.setVisible(true);
    }
    
    
}
