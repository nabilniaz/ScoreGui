import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

import javax.swing.JLabel; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JTextField; 
import javax.swing.JButton;
public class ScoreGui implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel output;
	private JTextField textfield1;
	private JTextField textfield2;
	public JTextField textfield3;
	public JTextField textfield4;
	private JButton button;
	private JPanel panelLayout;
	public ScoreGui() {
		
		frame = new JFrame();
		frame = new JFrame("Weighted score calculator");
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		/**
		panel = new JPanel();
		panel.setBackground(Color.RED);
		frame.add(panel);**/
		
		panelLayout= new JPanel();
		panelLayout.setBackground(Color.RED);
		
		frame.add(panelLayout);
		frame.setVisible(true);
		frame.setSize(500,300);
		
				
		JLabel label1 = new JLabel("Enter your test 1 percent score which is 20% of your grade.");
		panelLayout.add(label1);
		textfield1 = new JTextField(20);
		panelLayout.add(textfield1);
		
		JLabel label2 = new JLabel("Enter your test 2 percent score which is 30% of your grade.");
		panelLayout.add(label2);		
		textfield2= new JTextField(20);
		panelLayout.add(textfield2);
		
		JLabel label3 = new JLabel("Enter your test 3 percent score which is 30% of your grade.");
		panelLayout.add(label3);
		textfield3=new JTextField(20);
		panelLayout.add(textfield3);
		
		JLabel label4 = new JLabel("Enter your test 4 percent score which is 20% of your grade.");
		panelLayout.add(label4);
		textfield4 = new JTextField(20);
		panelLayout.add(textfield4);
		
		button = new JButton("Calculate average");
		button.addActionListener(this);
		panelLayout.add(button);
		output = new JLabel();
		output.setText("Your score is");

		panelLayout.add(output);}



		
		public void actionPerformed(ActionEvent e){
			double num1= Double.parseDouble(textfield1.getText());
			double num2 = Double.parseDouble(textfield2.getText());
			double num3 = Double.parseDouble(textfield3.getText());
			double num4 = Double.parseDouble(textfield4.getText());
			double score = ((.80*num1+.70*num2+.70*num3+.80*num4))/(num1+num2+num3+num4);
			output.setText(String.valueOf(score));
		}
	
	
		
	
}

