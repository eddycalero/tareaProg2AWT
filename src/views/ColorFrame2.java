package views;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



import misc.event.ForminterFace;


public class ColorFrame2 extends Frame implements ForminterFace {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ColorFrame2() {
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				
              dispose();
}
		});
		
	}
		
	


	
	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showForm() {
		// TODO Auto-generated method stub
		setVisible(true);
		setSize(500, 400);
		
		setBackground(Color.BLUE);
		setLocationRelativeTo(null);
		toFront();
	}






	@Override
	public void initComponents() {
		// TODO Auto-generated method stub
		
	}



}
	

