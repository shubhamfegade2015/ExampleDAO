package com.quinnox.springhotelmanagement.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PaymentDto implements Serializable{

	private int paymentId;
	
	private int roomId;
	
	private String userName;
	
	private long phoneNumber;

	private int roomCost;
	
	private long cardNumber;
		
	private long cvv;
	
	
	
}
