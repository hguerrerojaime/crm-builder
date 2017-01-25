package mx.biits.crm.builder.ui.action;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

public abstract class UIAction extends AbstractAction {
	
	public UIAction() {
		putValue(SMALL_ICON, new ImageIcon(UIAction.class.getResource("/icons/"+getSmallIconName())));
		putValue(NAME, getName());
		putValue(SHORT_DESCRIPTION, getShortDescription());
	}

	public abstract String getName();
	public abstract String getShortDescription();
	public abstract String getSmallIconName();

}
