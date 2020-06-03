package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ThingViewer extends JPanel {

	WindowFrame frame;
	
	public ThingViewer(WindowFrame frame) {
		this.frame =frame;

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Kind");
		model.addColumn("When");
		model.addColumn("Many");
		model.addColumn("Much");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
