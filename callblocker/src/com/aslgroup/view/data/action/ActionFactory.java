package com.aslgroup.view.data.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ActionFactory {
	private String libPath;
	private Map<String,Action> actionList;
	private static ActionFactory sSelf;
	private ActionFactory(){
		actionList = new HashMap<String, Action>();
		init();
	}
	private void init(){
		this.libPath = "com.aslgroup.view.data.action";
	}
	
	public ActionFactory getInstance(){return sSelf==null? sSelf = new ActionFactory():sSelf;}
	public boolean cleanFactory(){return false;}
	/*
	 * Returns action if it was created previously otherwise it create the action
	 * an save it in actionList and return the action.
	 * param actionName - action can be the action identifier
	 */
	public Action getAction(String actionName,Object value,Map actionListener, Map<String,ArrayList> paramerter,Map<String,String> style){
		Action action = null;
		String actionId = actionName;
		if(actionList.containsKey(actionName)) return actionList.get(actionId);
		actionId = null;
		Class actionClass = null;
		try {
			actionClass = Class.forName(libPath+"."+actionName);
			//Action need to creata from class
			//action = (Action)actionClass;
			action.setValue(value);
			setActionListener(action,actionListener,paramerter);
			setStyle(action,style);
			
			actionId = action.getActionId();
			actionList.put(actionId, action);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			actionId = null;
			actionClass = null;
		}
		
		return action;
	}
	
	/*
	 * set action listener with parameter
	 */
	protected void setActionListener(Action action,Map actionListener,
			Map<String, ArrayList> paramerter) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * setStyle
	 * 
	 */
	
	protected void setStyle(Action action,Map style){
		
	}
}
