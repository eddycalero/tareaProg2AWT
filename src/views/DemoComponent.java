package views;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;

import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.Model;
import views.components.panels.BorderPanel;

public class DemoComponent extends WFrame {

	/**
	 * @author David_Moody
	 */
	private static final long serialVersionUID = 6982807738850826694L;
	private Label label;
	private TextField textField1, textField2, TextField3;
	private Checkbox checkbox4, checkbox5, checkbox6;
	private BorderPanel panel2;
	private CheckboxGroup grupo1;
	private Canvas canvas1;
	private Button button1;
	private Button button2;
	private MainFrame a;

	public DemoComponent(MainFrame a) {
		super(a);
		initComponents();
	}

	@Override
	public void initComponents() {
		setLayout(null);
		setTitle("Componentes");
		setSize(500, 500);

		LabelTexto("Primer Numero", 20, 50, 100, 32);
		LabelTexto("Segundo Numero", 20, 85, 100, 32);
		LabelTexto("Respuesta", 20, 120, 100, 32);

		textField1 = new TextField();
		
		textField1.setBounds(120, 50, 250, 35);
		
		
		add(textField1);
		

		textField2 = new TextField();
		textField2.setBounds(120, 85, 250, 35);
		add(textField2);
		
		TextField3 = new TextField();
		TextField3.setBounds(120, 150, 250, 35);
		add(TextField3);

		panel2 = new BorderPanel();
		panel2.setBorderVisible(true);
		panel2.setBounds(375, 155, 100, 90);
		panel2.setBackground(Color.WHITE);
		add(panel2);

		grupo1 = new CheckboxGroup();
		checkbox4 = new Checkbox("suma", grupo1, true);
		checkbox5 = new Checkbox("resta", grupo1, true);
		checkbox6 = new Checkbox("divicion", grupo1, true);
		panel2.add(checkbox4);
		panel2.add(checkbox5);
		panel2.add(checkbox6);



		button1 = new Button("CALCULAR");
		button1.setBounds(20, 310, 100, 32);
		add(button1);
		
		button2 = new Button("BORRAR");
		button2.setBounds(370, 310, 100, 32);
		add(button2);

		button1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Model u = new  Model(); 
			    if(checkbox4.getState() == true) {
			    	double r = 0;
			    	double a = Double.parseDouble(textField1.getText());
			    	double b = Double.parseDouble(textField2.getText());
			    	TextField3.setText(String.valueOf(u.suma(a, b,r)));
			    
			    }
				if(checkbox5.getState() == true) {
					double r = 0;
			    	double a = Double.parseDouble(textField1.getText());
			    	double b = Double.parseDouble(textField2.getText());
			    	TextField3.setText(String.valueOf(u.resta(a, b, r)));
		    		
		    	}
				if(checkbox6.getState() == true) {
					double r = 0;
			    	double a = Double.parseDouble(textField1.getText());
			    	double b = Double.parseDouble(textField2.getText());
			    	TextField3.setText(String.valueOf( u.divicion(a, b, r)));
		    		
		    	}
		}
		}); 
		
		button2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			TextField3.setText("");
			}
		});
		
	
		
	}

	public void LabelTexto(String m, int x, int y, int width, int height) {
		label = new Label(m);
		label.setBounds(x, y, width, height);
		add(label);
	}
}
