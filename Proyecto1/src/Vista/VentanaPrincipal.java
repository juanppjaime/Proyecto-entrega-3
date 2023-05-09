
package Vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Hotel;
import Logica.Servicio;
import Logica.Usuario;

import java.awt.BorderLayout;
import javax.swing.JLabel;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel leftPanel;
	private JPanel rightPanel;
	private MenuRecepcionista menuRecepcionista = new MenuRecepcionista();
	private menuAdministrador menuAdministrador = new menuAdministrador(this);
	private MenuEmpleado menuEmpleado = new MenuEmpleado();
	private JButton btnCrearHabitacion = menuAdministrador.getBotonAdmin();
	private JButton btnCargarDatos = menuAdministrador.getBotonAdmin2();
	private JButton btnConsultarMenu = menuEmpleado.getBotonEmp();
	private JButton btnConsultarInventario = menuRecepcionista.getBotonRecep();
	private JButton btnConsultarReservas = menuRecepcionista.getBotonRecep2();
	private JButton btnConsultarReservasHab = menuRecepcionista.getBotonRecep3();
	private JButton btnRealizarReserva = menuRecepcionista.getBotonRecep5();
	private CrearHabitacion crearHabitacion = new CrearHabitacion();
	private CargarDatos cargarDatos = new CargarDatos();
	private RealizarReserva realizarReserva = new RealizarReserva();
	private MostrarServicios mostrarServicios = new MostrarServicios();
	private static Hotel hotel = new Hotel();
	private Login login = new Login();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario user=null;
					VentanaPrincipal frame = new VentanaPrincipal(user);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal(Usuario user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		leftPanel = new JPanel();
		contentPane.add(leftPanel, BorderLayout.WEST);

		rightPanel = new JPanel();
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
		splitPane.setDividerLocation(300); // Establecer la posición inicial de la barra divisoria

		contentPane.add(splitPane);
		
		btnCrearHabitacion.addActionListener(this);
		btnConsultarMenu.addActionListener(this);
		btnConsultarReservas.addActionListener(this);
		btnCargarDatos.addActionListener(this);
		btnConsultarReservasHab.addActionListener(this);
		btnRealizarReserva.addActionListener(this);

		if(user.getRol().equals("administrador")) {
			leftPanel.removeAll();
			leftPanel.add(menuAdministrador);
			menuAdministrador.setSize(300, 600);
			menuAdministrador.setVisible(true);
		} else if(user.getRol().equals("recepcionista")) {
			leftPanel.removeAll();
			leftPanel.add(menuRecepcionista);
			menuRecepcionista.setSize(300, 600);
			menuRecepcionista.setVisible(true);
		} else if(user.getRol().equals("empleado")) {
			leftPanel.removeAll();
			leftPanel.add(menuEmpleado);
			menuEmpleado.setSize(300, 600);
			menuEmpleado.setVisible(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrearHabitacion) {
			
			rightPanel.removeAll();
			rightPanel.add(crearHabitacion);
			rightPanel.repaint();
			rightPanel.revalidate();
		}
		if (e.getSource() == btnConsultarMenu) 
		{
			rightPanel.removeAll();
			rightPanel.add(mostrarServicios);
			JTextArea texto = mostrarServicios.darTextArea();
			
			ArrayList<Servicio> servicios = login.darServicios();;
			
			
				
				texto.append("\n--------------------");
				texto.append("Código producto: " + servicios.get(3).getCodigo());
				texto.append("Producto: " + servicios.get(3).getProducto());
				texto.append("Horario: " +servicios.get(3).getHoraInicial()+ " - " + servicios.get(3).getHoraFinal());
				texto.append("Precio: "+servicios.get(3).getPrecio());
			
			texto.append("\n--------------------");
			
			rightPanel.repaint();
			rightPanel.revalidate();
		}
		
		if (e.getSource() == btnCargarDatos) 
		{
			rightPanel.removeAll();
			rightPanel.add(cargarDatos);
			rightPanel.repaint();
			rightPanel.revalidate(); // Agregamos este método para actualizar el panel
		}
		if (e.getSource() == btnConsultarReservas) {
			
			rightPanel.removeAll();
		
			rightPanel.repaint();
			rightPanel.revalidate(); // Agregamos este método para actualizar el panel
		}
		if (e.getSource() == btnRealizarReserva) {

			rightPanel.removeAll();
			rightPanel.add(realizarReserva);
			rightPanel.repaint();
			rightPanel.revalidate();
	}
	}
}


