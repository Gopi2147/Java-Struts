package com.assignment;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

Scanner scr= new Scanner(System.in);
int count=0;

	System.out.println("Press 1 to add or 2 to delete or 3 to modify or 4 to display increment details");
	count= scr.nextInt();
	if(count==1) {Addition.addition();}
	if(count==2) {Deletion.delete();}
	if(count==3) {Modification.modify();}
	if(count==4) {SalaryDetails.salary();}
	
scr.close();
}
}
