package mx.biits.crm.builder.ui.action;

import java.awt.Window;
import java.awt.event.ActionEvent;

import mx.biits.crm.builder.utils.SpringUtils;

public abstract class WindowAwareAction<T extends Window> extends UIAction {
	
	private Class<T> windowClass;
	
	public WindowAwareAction(Class<T> windowClass) {
		this.windowClass = windowClass;
	}
	

	public void actionPerformed(ActionEvent e) {
		Window w = getWindow();
		w.setVisible(true);
	}

	public T getWindow() {
		return SpringUtils.getBean(windowClass);
		
	}

}
