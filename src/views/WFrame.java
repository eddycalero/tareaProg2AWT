package views;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import misc.event.ForminterFace;

public class WFrame extends Frame implements ForminterFace {

	private static final long serialVersionUID = -1325657196337114804L;
	Frame parentFrame;

	public WFrame(Frame parentFrame) {
		this.parentFrame = parentFrame;
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				
			}
		});
	}


	@Override
	public void initComponents() {

	}

	@Override
	public void clear() {

	}

	@Override
	public void showForm() {
		if (parentFrame != null) {
			parentFrame.setSize(500, 300);
			parentFrame.setVisible(true);
			setVisible(true);
			setLocationRelativeTo(null);
			toFront();
		}
	}
}