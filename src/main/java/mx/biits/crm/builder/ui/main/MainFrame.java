package mx.biits.crm.builder.ui.main;

import java.awt.AWTEvent;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import org.springframework.stereotype.Component;

import mx.biits.crm.builder.ui.frame.BaseFrame;
import mx.biits.crm.builder.ui.utils.WindowUtils;

import javax.swing.JMenuBar;
import javax.swing.plaf.metal.MetalBorders.ToolBarBorder;

@Component
public class MainFrame extends BaseFrame {
	
	ToolbarPanel tbPanel;
	
	public MainFrame() {
		super();
		
		setSize(800, 600);
		
		tbPanel = new ToolbarPanel();
		
		getContentPane().add(BorderLayout.NORTH, tbPanel);
	}

	@Override
	protected void onClose(AWTEvent e) {
		System.exit(0);
	}
	
	

}
