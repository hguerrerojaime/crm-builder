package mx.biits.crm.builder.ui.common;

import javax.swing.JDialog;
import javax.swing.JFrame;

import org.springframework.stereotype.Component;
import java.awt.Window.Type;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@Component
public class ConsoleFrame extends JFrame {
	private JTextField txtCommandInput;
	public ConsoleFrame() {
		setTitle("Developer Console");
		setSize(600,300);
		setType(Type.UTILITY);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		getContentPane().add(textArea, BorderLayout.CENTER);
		
		txtCommandInput = new JTextField();
		getContentPane().add(txtCommandInput, BorderLayout.SOUTH);
		txtCommandInput.setColumns(10);
	}

}
