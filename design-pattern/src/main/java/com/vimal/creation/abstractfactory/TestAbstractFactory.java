package com.vimal.creation.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		AccountAbstractFactory factory = AccountFactoryProducer.getAccountFactory("REGULAR");
		factory.accountCreator("CHECKING");
		
		AccountAbstractFactory irafactory = AccountFactoryProducer.getAccountFactory("IRA");
		irafactory.accountCreator("ROTH");
	}
}
