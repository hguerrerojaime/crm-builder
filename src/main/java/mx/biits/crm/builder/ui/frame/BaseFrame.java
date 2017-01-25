package mx.biits.crm.builder.ui.frame;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.accessibility.Accessible;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import mx.biits.crm.builder.ui.utils.WindowUtils;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Point;

import javax.swing.JLabel;

public class BaseFrame extends JFrame {
	private final Action action = new CloseAction();
	private JMenuBar menuBar;
	private JLabel lblStatus;
	public BaseFrame() {
		
		WindowUtils.centreWindow(this);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.setAction(action);
		mnFile.add(mntmClose);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		getContentPane().add(toolBar, BorderLayout.SOUTH);
		
		lblStatus = new JLabel("Status");
		toolBar.add(lblStatus);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				BaseFrame.this.onClose(e);
			}
			
		});
		
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseExited(MouseEvent e) {
				Component c = SwingUtilities.getDeepestComponentAt(
						e.getComponent(), e.getX(), e.getY());
				
				if (c instanceof AbstractButton) {
					Action action =  ((AbstractButton) c).getAction();
					if (action != null) {
						String lblTxt = (String) action.getValue(Action.SHORT_DESCRIPTION);
						BaseFrame.this.getLblStatus().setText(lblTxt);
					}
				}
				
			}
			
		});
		
		pack();
	}

	private class CloseAction extends AbstractAction {
		public CloseAction() {
			putValue(NAME, "Close");
			putValue(SHORT_DESCRIPTION, "Close this Window");
		}
		public void actionPerformed(ActionEvent e) {
			BaseFrame.this.onClose(e);
		}
	}
	
	protected void onClose(AWTEvent e) {
		
	}
	
	protected JLabel getLblStatus() {
		return lblStatus;
	}
}
