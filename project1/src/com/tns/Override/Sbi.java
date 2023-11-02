package com.tns.Override;


	public class Sbi extends Rbi {
		public float getRateofInterest() {
			System.out.println(super.getRateofInterest());
			return 6.7f;
		}
	}


