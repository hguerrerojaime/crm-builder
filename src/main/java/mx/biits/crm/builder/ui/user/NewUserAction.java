package mx.biits.crm.builder.ui.user;

import mx.biits.crm.builder.ui.action.JFrameAwareAction;

public class NewUserAction extends JFrameAwareAction<NewUserFrame> {
	
	public NewUserAction() {
		super(NewUserFrame.class);

	}

	@Override
	public String getName() {
		return "New User";
	}

	@Override
	public String getShortDescription() {
		return "Create New User";
	}

	@Override
	public String getSmallIconName() {
		return "user_add.png";
	}

}
