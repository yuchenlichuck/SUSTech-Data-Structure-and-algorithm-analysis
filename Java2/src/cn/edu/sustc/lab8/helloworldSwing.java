package cn.edu.sustc.lab8;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class helloworldSwing {
	
	private static void mylogin() { // TODO Auto-generated method stub ]
			JFrame frame = new JFrame("Login Example");
			frame.setSize(350, 200);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			JPanel panel = new JPanel();
			frame.add(panel);
			placeComponents(panel); 
			frame.setVisible(true); 
	}
	private static void placeComponents(JPanel panel) {
	// TODO Auto-generated method stub 
	panel.setLayout(null); 
	JLabel userLabel=new JLabel("user:");
	 
	//setBounds(r.x, r.y, r.width, r.height),
	userLabel.setBounds(10,20,80,25); 
	panel.add( userLabel); 
	JTextField userText=new JTextField(20);
	userText.setBounds(100,20,165,25); 
	panel.add( userText); 
	
	JLabel passwordLabel = new JLabel("password:");
	passwordLabel.setBounds(10,50,80,25);
	
	panel.add(passwordLabel); 
	
	JPasswordField passwordText=new JPasswordField();
	passwordText.setBounds(100,50,165,25); 
	panel.add(passwordText);
	JButton loginButton =new JButton("login"); 
	loginButton.setBounds(10,80,80,25); 
	panel.add(loginButton); 
	}
		private static void createAndShowGui() {
			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame frame =new  JFrame("Hello World");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel label = new JLabel("Hello World");
		
			frame.getContentPane().add(label); 
			frame.pack(); frame.setVisible(true); 
		}
	
		public static void main(String[] args) {
				javax.swing.SwingUtilities.invokeLater(new Runnable() { 
					
			@Override
			public void run() {
					// TODO Auto-generated method stub 
					createAndShowGui(); 
					mylogin();
			}  
});
	
	
}
}
