package com.aslgroup.model.faceds;

import java.util.List;

import com.aslgroup.view.data.entity.PhoneNumber;

public interface IBlockCall {
	
	/*
	 * Get all blocked number list from db.
	 * @return List of all blocked numbers.
	 */
	public List getBlockedCallList();
	
	/*
	 * Update a phone number.
	 * Update can be done on the number as well as on the block properties.
	 * 
	 */
	public boolean updateNumber(PhoneNumber numberEntity);
	/*
	 * Delete a number depending on the phone number id.
	 * @return True for successful delete.
	 */
	public boolean deleteNumber(String id);
	/*
	 * Erease un-necessary number form db.
	 * Clean can be called my a service
	 */
	public boolean clean();

}
