package com.aslgroup.view.data.entity;
/*
 * @Class Phone number entity
 * 
 * Phone number related information will be in this class.
 */

public class PhoneNumber {
	/*
	 * Id is for internal use of the number row.
	 * This is phone  number id
	 */
	private String id;
	/*
	 * Phone number to block.
	 */
	private String number;
	/*
	 * Name of the numbre holder. Name will be same as the number if 
	 * the name does not exist in the field
	 */
	private String name;
	/*
	 * True for block a number
	 */
	private boolean isSMSBlocked;
	/*
	 * True for block a sms.
	 */
	private boolean isCallBlock;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSMSBlocked() {
		return isSMSBlocked;
	}
	public void setSMSBlocked(boolean isSMSBlocked) {
		this.isSMSBlocked = isSMSBlocked;
	}
	public boolean isCallBlock() {
		return isCallBlock;
	}
	public void setCallBlock(boolean isCallBlock) {
		this.isCallBlock = isCallBlock;
	}
	
	

}
