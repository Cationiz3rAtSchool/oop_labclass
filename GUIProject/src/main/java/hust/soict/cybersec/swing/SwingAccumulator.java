package hust.soict.cybersec.swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingAccumulator
extends JFrame {
	private JTextField tfInput;
	private JTextField tfOutput;
	private int sum = 0;

	private class TFInputListener
	implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOutput.setText("" + sum);
		}
	}

	public SwingAccumulator() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2, 2));

		cp.add(new JLabel("Enter an integer: "));
		tfInput = new JTextField(10);
		tfInput.addActionListener(new TFInputListener());
		cp.add(tfInput);

		cp.add(new JLabel("The accumulated sum is: "));
		tfOutput = new JTextField(10);
		tfOutput.setEditable(false);
		cp.add(tfOutput);

		setTitle("AWT Accumulator");
		setSize(350, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingAccumulator();
	}
}
