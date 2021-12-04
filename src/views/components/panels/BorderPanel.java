package views.components.panels;

import java.awt.*;

public class BorderPanel extends Panel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean drawBorder = true;
	private int borderOffset = 2;
	
	public void setBorderVisible(boolean b) {
		
		if(b != drawBorder) {
			drawBorder = b;
			repaint();
		}
	}
	
	public boolean isBorderVisible() {
		return drawBorder;
	}
	
	public void setBorderOffset(int i) {
		borderOffset = i;
		repaint();
	}
	
	public int getBorderOffset() {
		return borderOffset;
	}
	
	protected Rectangle getBorderBounds() {
		int x = borderOffset;
		int y = borderOffset;
		int width = getSize().width - borderOffset * 2;
		int height = getSize().height - borderOffset * 2;
		Rectangle bounds = new Rectangle(x, y, width, height);
		return bounds;
	}
	
	public void update(Graphics g ) {
		paint (g);
	}
	
	public void paint(Graphics g) {
		g.setColor( getBackground());
		g.fillRect (0, 0, getSize().width, getSize().height);
		g.setColor (getForeground());
		Rectangle border = getBorderBounds();
		g.drawRect(border.x, border.y, border.width, border.height);
	    
	}
}
