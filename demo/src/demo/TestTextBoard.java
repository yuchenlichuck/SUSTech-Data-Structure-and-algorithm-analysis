package demo;
import java.awt.Font;
import java.awt.Color;
import java.awt.geom.Rectangle2D;

public class TestTextBoard {

    public static void main(String[] args) {
        Font font;

        TextBoard tb = new TextBoard(1000, 700, Color.RED);
        System.out.println("-- Initialized");
        font = new Font("SansSerif", Font.BOLD, 120);
        tb.write("Hello", 40, 500, font, Color.YELLOW);

        font = new Font("黑体", Font.PLAIN, 80);
        tb.write( "科技进步", 300, 100, font, Color.BLUE);
        tb.write( "中文测试", 400, 200, 0, font, Color.BLUE, Color.YELLOW );
        tb.write( "汉字测试", 400, 300, 0, font, Color.BLUE, Color.WHITE );

        Rectangle2D r = tb.getBounds( "中文测试", font, 400, 200);
        System.out.println( "中文测试" + r.toString() );
         
        r = tb.getBounds( "汉字测试", font, 400, 300);
        System.out.println( "汉字测试" + r.toString() );

        font = new Font("SansSerif", Font.BOLD, 40);
        tb.write("World", 150, 300, 10, font, new Color(211, 255, 241));
        tb.write("Tally ho", 500, 500);

        font = new Font("SansSerif", Font.BOLD, 60);
        tb.write("Awesome!", 500, 620, -10, font, Color.WHITE, Color.BLACK);
        
        System.out.println("-- Written");
        tb.display();
        System.out.println("-- Displayed (be patient, it's coming ...)");
    }

}
