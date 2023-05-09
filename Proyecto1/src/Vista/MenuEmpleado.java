package Vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JButton;

public class MenuEmpleado extends JPanel {

	JButton btnConsultarMenuY;
	
	public MenuEmpleado() {
		setBackground(new Color(135, 206, 235));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblEmpleado = new JLabel("EMPLEADO");
		lblEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblEmpleado);
		
		btnConsultarMenuY = new JButton("Consultar menu y servicios");
		btnConsultarMenuY.setForeground(Color.WHITE);
		btnConsultarMenuY.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConsultarMenuY.setBackground(new Color(75, 0, 130));
		add(btnConsultarMenuY);
		
		JButton btnRegistrarServicio = new JButton("Registrar Servicio");
		btnRegistrarServicio.setForeground(Color.WHITE);
		btnRegistrarServicio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegistrarServicio.setBackground(new Color(75, 0, 130));
		add(btnRegistrarServicio);
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesión");
		btnCerrarSesin.setForeground(Color.WHITE);
		btnCerrarSesin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCerrarSesin.setBackground(new Color(75, 0, 130));
		add(btnCerrarSesin);
		
	}
	
	public JButton getBotonEmp()
	{
		return btnConsultarMenuY;
	}

}
