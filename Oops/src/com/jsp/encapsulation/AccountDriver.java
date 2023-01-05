package com.jsp.encapsulation;

import java.util.Scanner;

public class AccountDriver {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter deposit amount: ");
	double dep=sc.nextDouble();
	SavingAccount sa= new SavingAccount();
	sa.deposit(dep);
	System.out.println("Enter withdraw amount: ");
	double withd=sc.nextDouble();
	sa.withdraw(withd);
	
	
}
}
