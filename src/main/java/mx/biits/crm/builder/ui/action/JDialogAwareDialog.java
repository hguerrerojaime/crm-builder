package mx.biits.crm.builder.ui.action;

import java.awt.event.ActionEvent;

import javax.swing.JDialog;

public abstract class JDialogAwareDialog<T extends JDialog> extends WindowAwareAction<T> {

	public JDialogAwareDialog(Class<T> windowClass) {
		super(windowClass);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		getWindow().setModal(true);
	}

}
