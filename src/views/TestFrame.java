package views;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestFrame extends WFrame {

	private static final long serialVersionUID = -6032430865887405023L;
	
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	

	public TestFrame(MainFrame parentFrame) {
		super(parentFrame);
		initComponents();
	}

	@Override
	public void initComponents() {
		setLayout(null);
		setTitle("Componentes");
		setSize(500, 400);

		button1 = new Button("Azul");
		button1.setBounds(20, 50, 100, 32);
		add(button1);
		
		button2 = new Button("Azul y Blanco");
		button2.setBounds(200, 50, 100, 32);
		add(button2);
		
		button3 = new Button("Verde");
		button3.setBounds(20, 180, 100, 32);
		add(button3);
		
		button4 = new Button("Fucsia");
		button4.setBounds(200, 180, 100, 32);
		add(button4);

		button1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			ColorFrame t = new ColorFrame();
		
	 	
			t.showForm();
		   
			}
		});
		
		button2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			ColorFrame2 t = new ColorFrame2();
		
	 	
			t.showForm();
		   
			}
		});
		
		button3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			ColorFrame3 t = new ColorFrame3();
		
	 	
			t.showForm();
		   
			}
		});
		
		button4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			ColorFrame4 t = new ColorFrame4();
		
	 	
			t.showForm();
		   
			}
		});
		
	}
}
