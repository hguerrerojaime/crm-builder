package mx.biits.crm.builder.ui.main;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import mx.biits.crm.builder.ui.user.NewUserAction;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class ToolbarPanel extends JPanel {
	private final NewUserAction newUserAction = new NewUserAction();
	
	

	/**
	 * Create the panel.
	 */
	public ToolbarPanel() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel pnlOrganization = new JPanel();
		JPanel pnlDataModel = new JPanel();
		JPanel pnlBusinessModel = new JPanel();
		
		tabbedPane.add("My Organization", pnlOrganization);
		pnlOrganization.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel pnlUsrGrpCred = new JPanel();
		pnlUsrGrpCred.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 1, true), "Users, Groups & Credentials", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlOrganization.add(pnlUsrGrpCred);
		pnlUsrGrpCred.setLayout(new GridLayout(0, 1, 0, 0));
		
		JToolBar tbUsers = new JToolBar();
		tbUsers.setFloatable(false);
		pnlUsrGrpCred.add(tbUsers);
		
		JButton btnNewUser = new JButton("");
		btnNewUser.setAction(newUserAction);
		tbUsers.add(btnNewUser);

		
		JButton btnListUsers = new JButton("");
		btnListUsers.setToolTipText("List Users");
		btnListUsers.setIcon(new ImageIcon(ToolbarPanel.class.getResource("/icons/user_go.png")));
		tbUsers.add(btnListUsers);
		
		JButton btnNewGroup = new JButton("");
		tbUsers.add(btnNewGroup);
		btnNewGroup.setToolTipText("New Group");
		btnNewGroup.setIcon(new ImageIcon(ToolbarPanel.class.getResource("/icons/group_add.png")));
		
		JButton btnListGroups = new JButton("");
		btnListGroups.setToolTipText("List Groups");
		btnListGroups.setIcon(new ImageIcon(ToolbarPanel.class.getResource("/icons/group_go.png")));
		tbUsers.add(btnListGroups);
		
		JButton btnNewCredential = new JButton("");
		btnNewCredential.setToolTipText("New Credential");
		btnNewCredential.setIcon(new ImageIcon(ToolbarPanel.class.getResource("/icons/vcard_add.png")));
		tbUsers.add(btnNewCredential);
		
		JButton btnListCredentials = new JButton("");
		btnListCredentials.setIcon(new ImageIcon(ToolbarPanel.class.getResource("/icons/vcard.png")));
		btnListCredentials.setToolTipText("List Credentials");
		tbUsers.add(btnListCredentials);
		
		JPanel pnlRegions = new JPanel();
		pnlRegions.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64)), "Regions", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlOrganization.add(pnlRegions);
		
		JPanel pnlApplications = new JPanel();
		pnlApplications.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64)), "Applications", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlOrganization.add(pnlApplications);
		tabbedPane.add("Data Model", pnlDataModel);
		tabbedPane.add("Business Model", pnlBusinessModel);
		
		
		add(tabbedPane);

	}
}
