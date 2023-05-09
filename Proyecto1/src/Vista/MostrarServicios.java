package Vista;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;

public class MostrarServicios extends JPanel {

	private JTextArea textArea;
	
	public MostrarServicios() {
		
		textArea = new JTextArea();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(57, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(120, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	public JTextArea darTextArea()
	{
		return textArea;
	}
}
