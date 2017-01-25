package mx.biits.crm.builder.ui.common;

import org.springframework.stereotype.Component;

import mx.biits.crm.builder.ui.action.JFrameAwareAction;

@Component
public class ShowConsoleFrameAction extends JFrameAwareAction<ConsoleFrame> {

	public ShowConsoleFrameAction() {
		super(ConsoleFrame.class);
	}

	@Override
	public String getName() {
		return "Show Console";
	}

	@Override
	public String getShortDescription() {
		return "Dispĺay the Application Console";
	}

	@Override
	public String getSmallIconName() {
		return "monitor_lightning.png";
	}
	
}
