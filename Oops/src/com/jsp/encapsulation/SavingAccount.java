package com.jsp.encapsulation;

public class SavingAccount {
	int acc_no;
	String ifsc;
	String name;
	double bal=20000;
	
public void displayDetails() {
	System.out.println(acc_no);
	System.out.println(ifsc);
	System.out.println(name);
	System.out.println(bal);
}
 
public void deposit(double dep) {
	bal=bal+dep;
	System.out.println(dep+" has been credited for your account");
	System.out.println("========================================");
}
public void withdraw(double withd) {
	if(withd<=bal) {
	bal=bal-withd;
	System.out.println(withd+" has beed debited from your account");
	System.out.println("=========================================");
	}else {
	System.out.println("insufficient balance");
	}
}

}
