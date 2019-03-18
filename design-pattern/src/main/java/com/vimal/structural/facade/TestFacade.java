package com.vimal.structural.facade;

public class TestFacade {

	public static void main(String[] args) {
		BalanceFacade balanceFacade = new BalanceFacade();
		
		balanceFacade.getCheckingBalance();
		balanceFacade.getIraBalance();
		balanceFacade.getRothBalance();
		balanceFacade.getSavingsBalance();
	}

}
