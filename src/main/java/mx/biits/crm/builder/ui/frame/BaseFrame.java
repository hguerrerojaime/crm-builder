package mx.biits.crm.builder.ui.frame;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.biits.crm.builder.ui.common.ShowConsoleFrameAction;
import mx.biits.crm.builder.ui.utils.WindowUtils;

public class BaseFrame extends JFrame implements InitializingBean {
	private final Action action = new CloseAction();
	
	@Autowired
	private ShowConsoleFrameAction showConsoleFrameAction;
	
	private JMenuBar menuBar;
	private JLabel lblStatus;
	public BaseFrame() {
		
		//WindowUtils.centreWindow(this);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				BaseFrame.this.onClose(e);
			}
			
		});
		
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

	public void afterPropertiesSet() throws Exception {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.setAction(action);
		mnFile.add(mntmClose);
		
		JPanel pnlBottom = new JPanel();
		getContentPane().add(pnlBottom, BorderLayout.SOUTH);
		pnlBottom.setLayout(new BorderLayout(0, 0));
		
		JToolBar tbStatus = new JToolBar();
		pnlBottom.add(tbStatus, BorderLayout.CENTER);
		tbStatus.setFloatable(false);
		
		lblStatus = new JLabel("Status");
		tbStatus.add(lblStatus);
		tbStatus.addSeparator();
		
		JToolBar tbControls = new JToolBar();
		tbControls.setFloatable(false);
		pnlBottom.add(tbControls, BorderLayout.EAST);
		
		JButton btnShowConsole = new JButton("Show Console");
		btnShowConsole.setAction(showConsoleFrameAction);
		tbControls.add(btnShowConsole);
		
	}
}
