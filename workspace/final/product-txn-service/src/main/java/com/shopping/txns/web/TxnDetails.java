package com.shopping.txns.web;

public class TxnDetails {
	String FromAccount;
	String ToAccount;
	String Amount;
	public String getFromAccount() {
		return FromAccount;
	}
	public void setFromAccount(String fromAccount) {
		FromAccount = fromAccount;
	}
	public String getToAccount() {
		return ToAccount;
	}
	public void setToAccount(String toAccount) {
		ToAccount = toAccount;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	@Override
	public String toString() {
		return "TxnDetails [FromAccount=" + FromAccount + ", ToAccount=" + ToAccount + ", Amount=" + Amount + "]";
	}
	
	
}
