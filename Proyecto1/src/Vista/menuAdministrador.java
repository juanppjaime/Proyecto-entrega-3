package Vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuAdministrador extends JPanel {

	private JButton btnCargarDatos;
	private JButton btnCrearHabitacion;
	JButton btnNivelDeOcupacin;
	
	public menuAdministrador(VentanaPrincipal ventana) {
		setBackground(Color.CYAN);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("ADMINISTRADOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel);
		
		btnCrearHabitacion = new JButton("Crear Nueva Habitación");
		btnCrearHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//ventana.nuevoPanel("crearHabitacion");
				
			}
		});
		btnCrearHabitacion.setForeground(Color.WHITE);
		btnCrearHabitacion.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCrearHabitacion.setBackground(new Color(75, 0, 130));
		btnCrearHabitacion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(btnCrearHabitacion);
		
		btnCargarDatos = new JButton("Cargar Datos");
		btnCargarDatos.setBackground(new Color(75, 0, 130));
		btnCargarDatos.setForeground(Color.WHITE);
		btnCargarDatos.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCargarDatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(btnCargarDatos);
		
		btnNivelDeOcupacin = new JButton("Nivel de ocupación del hotel");
		btnNivelDeOcupacin.setBackground(new Color(75, 0, 130));
		btnNivelDeOcupacin.setForeground(Color.WHITE);
		btnNivelDeOcupacin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNivelDeOcupacin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(btnNivelDeOcupacin);
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesión");
		btnCerrarSesin.setBackground(new Color(75, 0, 130));
		btnCerrarSesin.setForeground(Color.WHITE);
		btnCerrarSesin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCerrarSesin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(btnCerrarSesin);

	}
	
	public JButton getBotonAdmin()
	{
		return btnCrearHabitacion;
	}
	public JButton getBotonAdmin2()
	{
		return btnCargarDatos;
	}
	public JButton getBotonAdmin3()
	{
		return btnNivelDeOcupacin;
	}

}
