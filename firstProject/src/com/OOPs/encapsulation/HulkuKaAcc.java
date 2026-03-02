package com.OOPs.encapsulation;

public class HulkuKaAcc {
	private double bal = 4555.00;
	private short pin = 6599;

	public double getBal(short pin) {
		if(pin == this.pin) {
			return this.bal;
		}
		return -1;
	}

	public void setBalCredit(double amt) {
		this.bal += amt;
	}

	public void setBalDebit(double amt) {
		this.bal -= amt;
	}
}
