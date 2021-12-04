package views;


import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import misc.event.ForminterFace;


public class MainFrame extends Frame implements ForminterFace{
	/**
	 * @author David_Moody
	 */
	private static final long serialVersionUID = -2483114542263271239L;
	private Button button1, button2;
	private MainFrame intance;
	public MainFrame() {
		initComponents();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				
			}
		});
	}
	@Override
	public void initComponents() {
		setLayout(null);
		setSize(500,800);
		setResizable(false);
		
		intance = this;
		button1 = new Button("CALCULADORA");
		button1.setBounds(80,50,100,32);
		add(button1);
		
		

		button2 = new Button("PAINT");
		button2.setBounds(250,50,100,32);
		add(button2);
		
		button1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				DemoComponent cf = new DemoComponent(intance);
				cf.showForm();
			}
		});
		
		button2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				TestFrame cf = new TestFrame(intance);
				cf.showForm();
				
			}
		});
	}
	@Override
	public void showForm() {
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(500,400);
		toFront();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}

