import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class MainForm {

	private JFrame frmLabaKoshylVlad;
	private JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					MainForm window = new MainForm();
					window.frmLabaKoshylVlad.setVisible(true);					
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainForm() {
		initialize();
	}

	
	private void initialize() {
		frmLabaKoshylVlad = new JFrame();
		
		frmLabaKoshylVlad.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0){
				int x, y;
				
				x = frmLabaKoshylVlad.getWidth();
				y = frmLabaKoshylVlad.getHeight();
				
				int result = x + y;
				
				textField.setText(Integer.toString(result));
			}
		});
		
		frmLabaKoshylVlad.setTitle("Laba7 Koshyl Vlad 631p");
		frmLabaKoshylVlad.setBounds(100, 100, 200, 125);
		frmLabaKoshylVlad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblAB = new JLabel("A + B = ");
		lblAB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmLabaKoshylVlad.getContentPane().add(lblAB, BorderLayout.NORTH);
		
		textField = new JTextField();
		frmLabaKoshylVlad.getContentPane().add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
	}

}
