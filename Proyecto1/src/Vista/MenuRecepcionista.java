package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JButton;

public class MenuRecepcionista extends JPanel{

	
	private JButton btnConsultarInventarioHabitaciones;
	private JButton btnConsultarTodasLas;
	private JButton btnConsultarLasReservas;
	private JButton btnConsultarDisponibilidadDe;
	private JButton btnRealizarReserva;
	private JButton btnGenerarFactura;
	private JButton btnCerrarSesin;
	
	public MenuRecepcionista() {
		setBackground(new Color(32, 178, 170));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblRecepcionista = new JLabel("RECEPCIONISTA");
		lblRecepcionista.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecepcionista.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblRecepcionista);
		
		btnConsultarInventarioHabitaciones = new JButton("Consultar inventario habitaciones");
		btnConsultarInventarioHabitaciones.setForeground(Color.WHITE);
		btnConsultarInventarioHabitaciones.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConsultarInventarioHabitaciones.setBackground(new Color(75, 0, 130));
		add(btnConsultarInventarioHabitaciones);
		
		btnConsultarTodasLas = new JButton("Consultar todas las reservas");
		btnConsultarTodasLas.setForeground(Color.WHITE);
		btnConsultarTodasLas.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConsultarTodasLas.setBackground(new Color(75, 0, 130));
		add(btnConsultarTodasLas);
		
		btnConsultarLasReservas = new JButton("Consultar las reservas de una habitación");
		btnConsultarLasReservas.setForeground(Color.WHITE);
		btnConsultarLasReservas.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConsultarLasReservas.setBackground(new Color(75, 0, 130));
		add(btnConsultarLasReservas);
		
		btnConsultarDisponibilidadDe = new JButton("Consultar disponibilidad de habitación por fecha");
		btnConsultarDisponibilidadDe.setForeground(Color.WHITE);
		btnConsultarDisponibilidadDe.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConsultarDisponibilidadDe.setBackground(new Color(75, 0, 130));
		add(btnConsultarDisponibilidadDe);
		
		btnRealizarReserva = new JButton("Realizar Reserva");
		btnRealizarReserva.setForeground(Color.WHITE);
		btnRealizarReserva.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRealizarReserva.setBackground(new Color(75, 0, 130));
		add(btnRealizarReserva);
		
		btnGenerarFactura = new JButton("Generar Factura");
		btnGenerarFactura.setForeground(Color.WHITE);
		btnGenerarFactura.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGenerarFactura.setBackground(new Color(75, 0, 130));
		add(btnGenerarFactura);
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesión");
		btnCerrarSesin.setForeground(Color.WHITE);
		btnCerrarSesin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCerrarSesin.setBackground(new Color(75, 0, 130));
		add(btnCerrarSesin);
		

	}
	
	public JButton getBotonRecep()
	{
		return btnConsultarInventarioHabitaciones;
	}
	public JButton getBotonRecep2()
	{
		return btnConsultarTodasLas;
	}
	public JButton getBotonRecep3()
	{
		return btnConsultarLasReservas;
	}
	public JButton getBotonRecep4()
	{
		return btnConsultarDisponibilidadDe;
	}
	public JButton getBotonRecep5()
	{
		return btnRealizarReserva;
	}
	public JButton getBotonRecep6()
	{
		return btnGenerarFactura;
	}
	public Component btnInventarioHabitaciones() 
		
		{
			JPanel panel = new JPanel();
			JLabel label = new JLabel("PruebaA");
			add(label);
			panel.setSize(300,300);
			panel.setVisible(true);
			return panel;
			
		}
		
	}

