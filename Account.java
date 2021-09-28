package com.home;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Account
{
	private int id;
	private double balance;
	private double annualintrest;
	private LocalDate datecreated;

	public Account(int id, double balance,double annualintrest,LocalDate localDate)
	{
		this.id=id;
		this.balance=balance;
		this.annualintrest=annualintrest;
		this.datecreated=localDate;
		
	}
	public boolean withdraw(double withdrewAmount)
	
	{
		if(balance>withdrewAmount)
		{
			balance=balance-withdrewAmount;
			System.out.println("After withdrwel");
			System.out.println("ID=:"+getId()+" "+"Balance=:"+getBalance());		
		}
		else
			System.out.println("insufficent funds");
		return true;
	}
	public void deposit(double depositmoney)
	{
		balance=balance+depositmoney;
		//System.out.println(balance);
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getAnnualintrest()
	{
		return getAnnualintrest();
	}
	public void setAnnualintrest(double annualintrest) 
	{
		this.annualintrest = annualintrest;
	}
	public LocalDate getDatecreated() 
	{
		return datecreated;
	}
	public void setDatecreated(LocalDate datecreated)
	{
		this.datecreated = datecreated;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("enter ID,Balance,AnnualIntrest");
		int id=sc.nextInt();
		double balance=sc.nextDouble();
		double annualintrest=sc.nextDouble();
		Account account=new Account(id, balance, annualintrest);*/
		
		
		Account account=new Account(10,50000, 5000, LocalDate.of(2020, 1, 1));
		System.out.println("enter the amount to deposit");
		double deposit=sc.nextDouble();
		account.deposit(deposit);
		System.out.println("After Depositing money the total ammount is:");
		System.out.println("ID=:"+account.getId()+" "+"Balance=:"+account.getBalance());
		System.out.println("enter the amount to withdewl");
		double withdewel=sc.nextDouble();
		account.withdraw(withdewel);
	}
	
}