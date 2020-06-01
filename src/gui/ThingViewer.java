package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ThingViewer extends JFrame {

	public ThingViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Kind");
		model.addColumn("When");
		model.addColumn("Many");
		model.addColumn("Much");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
