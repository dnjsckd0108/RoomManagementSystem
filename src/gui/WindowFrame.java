package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;
	ThingAdder thingadder;
	ThingViewer thingviewer;

	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.thingadder = new ThingAdder(this);
		this.thingviewer = new ThingViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ThingAdder getThingadder() {
		return thingadder;
	}

	public void setThingadder(ThingAdder thingadder) {
		this.thingadder = thingadder;
	}

	public ThingViewer getThingviewer() {
		return thingviewer;
	}

	public void setThingviewer(ThingViewer thingviewer) {
		this.thingviewer = thingviewer;
	}


}
