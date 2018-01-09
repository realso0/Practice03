package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;
    

    //생성자 작성
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
    
    
    //필요한 메소드 작성
	public void deposit(int money) {
		balance+=money;
	}
	
	public void withdraw(int money) {
		if (balance<money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			balance-=money;
		}
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
}
