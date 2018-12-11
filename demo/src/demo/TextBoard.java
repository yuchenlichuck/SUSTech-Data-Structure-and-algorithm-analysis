package demo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.util.ArrayList;

class Scribbling {
    String what;
    int    xpos;
    int    ypos;
    double angle;
    Font   font;
    Color  col;
    Color  bgCol;
}

class WritePanel extends JPanel {
    //private Graphics2D g;
    private ArrayList<Scribbling> text = new ArrayList<Scribbling>();

    private void doWriting (Graphics g) {
        Graphics2D      g2d = (Graphics2D) g;
        Font            font = getFont();
        Color           col = g.getColor();
        double          angle = 0;
        AffineTransform orig = g2d.getTransform();

        for (Scribbling s: text) {
            if (s.angle != angle) {
                g2d.setTransform(orig);
                g2d.rotate( s.angle * Math.PI / 180.0);
                angle = s.angle;
            }
            if (s.font != null && !s.font.equals(font)) {
                g2d.setFont( s.font);
                font = g2d.getFont();
            }
            if (!s.col.equals(col)) {
                col = new Color( s.col.getRGB());
                g2d.setColor(col);
            }
            TextLayout layout = new TextLayout( 
                s.what, font, g2d.getFontRenderContext()
            );
            if (s.bgCol != null) {
                Rectangle2D bounds = layout.getBounds();
                bounds.setRect( 
                    bounds.getX() + s.xpos,
                    bounds.getY() + s.ypos,
                    bounds.getWidth(),
                    bounds.getHeight()
                );
                Color preColor = g2d.getColor();
                g2d.setColor( s.bgCol);
                g2d.fill( bounds);
                g2d.setColor( preColor);
            }    
            layout.draw( g2d, s.xpos, s.ypos) ;
  
            // g2d.drawString(s.what, s.xpos, s.ypos);
        }
    }

    public void addText (
        String what, int xpos, int ypos, double angle, 
        Font font, Color col, Color bgCol
    ) {
        Scribbling s = new Scribbling();
        s.what = what;
        s.xpos = xpos;
        s.ypos = ypos;
        s.angle = angle;
        s.font = font;
        s.col = col;
        s.bgCol = bgCol;
        text.add(s);
    }

    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent( g);
        doWriting(g);
    }
}

/**
 *    Textboard is in fact a full graphical application that displays
 *    text in a graphical Window
 */
public class TextBoard extends JFrame {
    private WritePanel board;
    private double     currentAngle;
    private Color      currentColor;
    private Font       currentFont;

    /**
     *    Only constructor.
     *
     *    @param width  Width of the window in pixels
     *    @param height Height of the window in pixels
     *    @param col    Background color
     */
    public TextBoard (int width, int height, Color col) {

        board = new WritePanel();
        // Put the WritePanel into the main window
        add( board);
        // Set its background color
        board.setOpaque( true);
        board.setBackground( col);
        // Initial settings
        currentAngle = 0;
        currentColor = Color.BLACK;
        currentFont = getFont();
        // Geometry of the main window
        setSize( width, height);
        setLocationRelativeTo( null);
        // When users close the window, we quit the application
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        setVisible( false);
    }

    /**
     *  Get a Rectangle bounds for a String s when write in font at (x,y)
     *
     *  @param s     The text to write
     *  @param font  Font to use to write the text
     *  @param x     Horizontal position in pixels, from the left hand side
     *  @param y     Vertical position in pixels, from the top
     */
    public Rectangle2D getBounds (String s, Font font, double x, double y) {
        setVisible(true);
        Graphics2D g2d = ((Graphics2D)getGraphics());
        FontRenderContext frc = g2d.getFontRenderContext();
        TextLayout layout = new TextLayout( s, font, frc);
        Rectangle2D bounds = layout.getBounds();
        bounds.setRect( 
            bounds.getX() + x,
            bounds.getY() + y,
            bounds.getWidth(),
            bounds.getHeight()
        );
        setVisible(false);
        return bounds;
    }

    // Overloaded methods to write text
    /**
     *  Write text to the screen
     *  <p>
     *  The text can be written at any position, it can be
     *  rotated, the font and color can be changed. Every piece
     *  of text is added to a list, and only written when the
     *  window is drawn.
     *
     *  @param what  The text to write
     *  @param xpos  Horizontal position in pixels, from the left hand side
     *  @param ypos  Vertical position in pixels, from the top
     *  @param angle Rotation angle in degrees
     *  @param font  Font to use to write the text
     *  @param col   Text color
     *  @param bgCol Background color
     */

    public void write (
        String what, int xpos, int ypos, double angle, 
        Font font, Color col, Color bgCol
    ) {
        if (currentAngle != angle) {
            currentAngle = angle;
        }
        if (currentFont != null && !currentFont.equals(font)) {
            currentFont = font;
        }
        if (!currentColor.equals(col)) {
            currentColor = new Color(col.getRGB());
        }
        board.addText( what, xpos, ypos, angle, font, col, bgCol);
    }

    public void write (
        String what, int xpos, int ypos, double angle, Font f, Color c
    ) {
        write( what, xpos, ypos, angle, f, c, null);
    }

    public void write (
        String what, int xpos, int ypos, Font f, Color c, Color bg
    ) {
        write( what, xpos, ypos, 0.0, f, c, bg);
    }

    /**
     *  Write text to the screen
     *  <p>
     *  Use the last set angle (0 by default), font and color
     *  (black by default). 
     *
     *  @param what  The text to write
     *  @param xpos  Horizontal position in pixels, from the left hand side
     *  @param ypos  Vertical position in pixels, from the top
     */
    public void write (String what, int xpos, int ypos) { 
        write( what, xpos, ypos, currentAngle, currentFont, currentColor);
    }

    /**
     *  Write text to the screen
     *  <p>
     *  Use the last set font and color (black by default), set the angle.
     *
     *  @param what  The text to write
     *  @param xpos  Horizontal position in pixels, from the left hand side
     *  @param ypos  Vertical position in pixels, from the top
     *  @param angle Rotation angle in degrees
     */
    public void write (String what, int xpos, int ypos, double angle) {
        write( what, xpos, ypos, angle, currentFont, currentColor);
    }

    /**
     *  Write text to the screen
     *  <p>
     *  Use the last set font, set angle and color.
     *
     *  @param what  The text to write
     *  @param xpos  Horizontal position in pixels, from the left hand side
     *  @param ypos  Vertical position in pixels, from the top
     *  @param angle Rotation angle in degrees
     *  @param col   Text color
     */
    public void write (
        String what, int xpos, int ypos, double angle, Color c
    ) {
        write(what, xpos, ypos, angle, currentFont, c);
    }

    /**
     *  Write text to the screen
     *  <p>
     *  Use the last set angle(0 by default) and font, set the color. 
     *
     *  @param what  The text to write
     *  @param xpos  Horizontal position in pixels, from the left hand side
     *  @param ypos  Vertical position in pixels, from the top
     *  @param col   Text color
     */
    public void write (String what, int xpos, int ypos, Color c) {
        write( what, xpos, ypos, currentAngle, currentFont, c);
    }

    /**
     *  Write text to the screen
     *  <p>
     *  Use the last set angle (0 by default), set font and color.
     *
     *  @param what  The text to write
     *  @param xpos  Horizontal position in pixels, from the left hand side
     *  @param ypos  Vertical position in pixels, from the top
     *  @param font  Font to use to write the text
     *  @param col   Text color
     */
    public void write (
        String what, int xpos, int ypos, Font f, Color c
    ) {
        write(what, xpos, ypos, currentAngle, f, c);
    }

    /**
     *    Show the window
     */
    public void display () {
        this.setVisible( true);
    }
}

