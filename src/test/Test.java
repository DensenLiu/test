package test;

import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hello git");
		Account account = new Account("densen","12345", new Date());
		System.out.println(account);
	}

}
