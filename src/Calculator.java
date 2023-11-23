import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textFirstValue;
	private JTextField textSecondValue;
	private JTextField textSum;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
	   setTitle("Simple Calculator");
	   getContentPane().setLayout(null);
	   
	   JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
	   lblNewJgoodiesLabel.setBounds(0, 0, 450, 16);
	   getContentPane().add(lblNewJgoodiesLabel);
	   
	   JLabel lblNewLabel = new JLabel("New label");
	   lblNewLabel.setBounds(67, 208, 61, 16);
	   getContentPane().add(lblNewLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sum = new JLabel("Sum is:");
		sum.setHorizontalAlignment(SwingConstants.RIGHT);
		sum.setBounds(6, 67, 92, 16);
		contentPane.add(sum);
		
		JLabel firstValue = new JLabel("First Value");
		firstValue.setHorizontalAlignment(SwingConstants.RIGHT);
		firstValue.setBounds(6, 11, 92, 16);
		contentPane.add(firstValue);
		
		JLabel secondValue = new JLabel("Second Value");
		secondValue.setHorizontalAlignment(SwingConstants.RIGHT);
		secondValue.setBounds(5, 39, 93, 16);
		contentPane.add(secondValue);
		
		textFirstValue = new JTextField();
		textFirstValue.setBounds(110, 6, 130, 26);
		contentPane.add(textFirstValue);
		textFirstValue.setColumns(10);
		
		textSecondValue = new JTextField();
		textSecondValue.setBounds(110, 34, 130, 26);
		contentPane.add(textSecondValue);
		textSecondValue.setColumns(10);
		
		textSum = new JTextField();
		textSum.setBounds(110, 62, 130, 26);
		contentPane.add(textSum);
		textSum.setColumns(10);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			   double sumValue = (Double.parseDouble(textFirstValue.getText()) 
			         + Double.parseDouble(textSecondValue.getText()));
			   
			   String sum = String.valueOf(sumValue);
			   
			   textSum.setText(sum);
			}
		});
		calculateButton.setBounds(56, 95, 117, 29);
		contentPane.add(calculateButton);
	}
}
