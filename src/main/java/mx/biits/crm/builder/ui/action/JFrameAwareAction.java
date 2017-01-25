package mx.biits.crm.builder.ui.action;

import javax.swing.JFrame;

public abstract class JFrameAwareAction<T extends JFrame> extends WindowAwareAction<T> {

	public JFrameAwareAction(Class<T> windowClass) {
		super(windowClass);
	}

}
