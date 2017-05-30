package com.full.contact.view;

import java.util.Scanner;

public class Menuview {
private Scanner sc;
public void WelcomeMessage(){
	System.out.println("Contact APP");
}
public int getchoiceandreturn(){
	int choice=0;
	
	
	do{
		System.out.println("Enter a choice");
	System.out.println("1.create contact");
	System.out.println("2.edit");
	System.out.println("3.quit");
	System.out.println("Choice: ");

	sc = new Scanner(System.in);
	choice = sc.nextInt();
	

} while (choice > 1 || choice < 0);

return choice;

}
}


