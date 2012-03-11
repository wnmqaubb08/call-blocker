package com.aslgroup.view.data.action;

import java.util.ArrayList;

public interface Action {
	
	public String getActionId();
	public boolean setActionListener(String actoinListener,ArrayList parameter);
	public boolean setStyle(String styleName,String value);
	public boolean setValue(Object value);

}
