package Vista;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;

public class CrearHabitacion extends JPanel {
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public CrearHabitacion() {
		setBackground(new Color(128, 0, 0));
		
		JLabel Id = new JLabel("Id:");
		Id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		
		JLabel lblBalcn = new JLabel("Balcón:");
		lblBalcn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblVista = new JLabel("Vista:");
		lblVista.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblTipoCama = new JLabel("Cama:");
		lblTipoCama.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblUbicacin = new JLabel("Ubicación:");
		lblUbicacin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(10);
		
		JLabel lblCocina = new JLabel("Cocina:");
		lblCocina.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "true", "false"}));
		
		JComboBox comboBox_1 = new JComboBox();
		
		JComboBox comboBox_1_1 = new JComboBox();
		
		JComboBox comboBox_1_2 = new JComboBox();
		
		JButton btnNewButton = new JButton("Guardar Habitación");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addComponent(Id, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUbicacin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(85)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblBalcn, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(57)
							.addComponent(comboBox_1_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblCocina, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblVista, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addComponent(comboBox_1_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTipoCama, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblCantidad, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(189)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(52)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(Id, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblUbicacin, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBalcn, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
						.addComponent(comboBox_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCocina, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblVista, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(2)
									.addComponent(lblTipoCama, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblCantidad, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(80)
					.addComponent(btnNewButton))
		);
		setLayout(groupLayout);

	}
}
