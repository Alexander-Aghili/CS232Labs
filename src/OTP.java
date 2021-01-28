import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Alexander Aghili

public class OTP extends JFrame implements ActionListener {

	
	private JButton new_OTP;
	private JLabel resultLabel;
	
	public OTP() {
		new_OTP = new JButton("Refresh");
		resultLabel = new JLabel("Your OTP Code");
		new_OTP.addActionListener(this); // do action on click
		
		setLayout(new BorderLayout());
		resultLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(new_OTP, BorderLayout.SOUTH);
		this.add(resultLabel, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(250, 100);
		this.setVisible(true);
		this.setSize(600, 350);
		
	}
	
	
	private static char[] generate(int len) {
		String numbers  = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rndNumbers = new Random();
		char[] otp = new char[len];
		//Takes random number from the numbers string and adds it to the character array
		for (int i = 0; i < len; i++) {
			otp[i] = numbers.charAt(rndNumbers.nextInt(numbers.length()));
		}
		
		return otp;
	}
	
	public static void main(String[] args) {
		new OTP();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int len = 10;
		resultLabel.setText(String.valueOf(OTP.generate(len)));
		
	}

}
