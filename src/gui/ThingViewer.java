package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.Thingmanager;
import thing.Thinginput;

public class ThingViewer extends JPanel {

	WindowFrame frame;
	
	Thingmanager thingmanager;
	
	public ThingViewer(WindowFrame frame, Thingmanager thingmanager) {
		this.frame =frame;
		this.thingmanager = thingmanager;
		
		System.out.println("***" + thingmanager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Kind");
		model.addColumn("When");
		model.addColumn("Many");
		model.addColumn("Much");
		
		for (int i=0; i<thingmanager.size(); i++) {
			Vector row = new Vector();
			Thinginput ti = thingmanager.get(i);
			row.add(ti.getThingkind());
			row.add(ti.getThingwhen());
			row.add(ti.getThingmany());
			row.add(ti.getThingmuch());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
