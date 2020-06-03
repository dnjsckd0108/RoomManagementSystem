package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ThingAdder extends JPanel{

	WindowFrame frame;
	
	public ThingAdder(WindowFrame frame) {
		this.frame =frame;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel lableKind = new JLabel("Kind: ", JLabel.TRAILING);
		JTextField filedKind = new JTextField(10);
		lableKind.setLabelFor(filedKind);
		panel.add(lableKind);
		panel.add(filedKind);
		
		JLabel lableWhen = new JLabel("When: ", JLabel.TRAILING);
		JTextField filedWhen = new JTextField(10);
		lableWhen.setLabelFor(filedWhen);
		panel.add(lableWhen);
		panel.add(filedWhen);
		
		JLabel lableMany = new JLabel("Many: ", JLabel.TRAILING);
		JTextField filedMany = new JTextField(10);
		lableMany.setLabelFor(filedMany);
		panel.add(lableMany);
		panel.add(filedMany);
		
		JLabel lableMuch = new JLabel("Much: ", JLabel.TRAILING);
		JTextField filedMuch = new JTextField(10);
		lableMuch.setLabelFor(filedMuch);
		panel.add(lableMuch);
		panel.add(filedMuch);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancle"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
