package gui;

import javax.swing.JFrame;
import manager.Thingmanager;


public class WindowFrame extends JFrame{
	
	Thingmanager thingmanager;
	MenuSelection menuselection;
	ThingAdder thingadder;
	ThingViewer thingviewer;
	
	public WindowFrame(Thingmanager thingmanager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.thingmanager = thingmanager;
		menuselection = new MenuSelection(this);
		thingadder = new ThingAdder(this);
		thingviewer = new ThingViewer(this, this.thingmanager);
		
		this.add(menuselection);
		
		this.setVisible(true);
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
