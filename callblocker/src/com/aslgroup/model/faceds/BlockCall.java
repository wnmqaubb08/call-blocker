package com.aslgroup.model.faceds;

import java.util.List;

import com.aslgroup.view.data.entity.PhoneNumber;

/*
 * class BlockCall - All functions related to the call blocking are gather in BlockCall class
 */

public class BlockCall implements IBlockCall {
	/*
	 * (non-Javadoc)
	 * @see com.aslgroup.model.faceds.IBlockCall#getBlockedCallList()
	 */
	public List getBlockedCallList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.aslgroup.model.faceds.IBlockCall#updateNumber(com.aslgroup.view.data.entity.PhoneNumber)
	 */

	public boolean updateNumber(PhoneNumber numberEntity) {
		// TODO Auto-generated method stub
		return false;
	}
	/*
	 * (non-Javadoc)
	 * @see com.aslgroup.model.faceds.IBlockCall#deleteNumber(java.lang.String)
	 */
	public boolean deleteNumber(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	/*
	 * (non-Javadoc)
	 * @see com.aslgroup.model.faceds.IBlockCall#clean()
	 */

	public boolean clean() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
