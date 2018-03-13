package nl.arthurheidt.av.prog3.textEditor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EditorGUIPane extends JPanel implements ActionListener {
    /**
     * 
     */
    private static final long serialVersionUID = -5253946272658888048L;
    private BorderLayout layout;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private ButtonPanel buttonPane;
    private boolean fontState = false;
    
    public EditorGUIPane() {
	super();
	
	layout = new BorderLayout();
	this.setLayout(layout);
	
	textArea = new JTextArea();
	textArea.setLineWrap(true);
	
	scrollPane = new JScrollPane(textArea);
	scrollPane.setPreferredSize(new Dimension(200, 200));
	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	this.add(scrollPane, BorderLayout.CENTER);
	
	buttonPane = new ButtonPanel((ActionListener) this);
	this.add(buttonPane, BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource().equals(buttonPane.getComponent(0))) {
	    Font f;
	    if(fontState) {
		fontState = !fontState;
		f = new Font("Comic Sans", Font.BOLD, 15);
	    } else {
		fontState = !fontState;
		f = new Font("Calibri", Font.ITALIC, 12);
	    }
	    textArea.setFont(f);
	}
    }
}
