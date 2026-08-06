package Ventana2;

import javax.swing.*;
import java.awt.*;

public class Ventana2 extends JFrame {

	public Ventana2() {

		this.setLayout(new GridLayout(1,2));
		this.setTitle("Registrar usuario");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel1.setLayout(new GridLayout(5, 2));
		panel2.setLayout(new FlowLayout());
		panel3.setLayout(new GridLayout(2, 1));
		JLabel etiq1 = new JLabel("Nombre");
		JLabel etiq2 = new JLabel("Apellido");
		JLabel etiq3 = new JLabel("Cedula");
		JLabel etiq4 = new JLabel("Edad");
		JLabel etiq5 = new JLabel("Rol");
		JButton bot1 = new JButton("Registrar");
		JTextField text1 = new JTextField(12);
		JTextField text2 = new JTextField(12);
		JTextField text3 = new JTextField(8);
		JTextField text4 = new JTextField(3);
		String[] rol = { "Alumno", "Profesor", "Adscripto" };
		JComboBox box1 = new JComboBox(rol);
		
		panel1.add(etiq1);
		panel1.add(text1);
		panel1.add(etiq2);
		panel1.add(text2);
		panel1.add(etiq3);
		panel1.add(text3);
		panel1.add(etiq4);
		panel1.add(text4);
		panel1.add(etiq5);
		panel1.add(box1);
		panel2.add(bot1);
		
		panel3.add(panel1);
		panel3.add(panel2);
		
		this.add(panel3);
		
		
	}
}
