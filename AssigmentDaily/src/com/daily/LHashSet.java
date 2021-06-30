package com.daily;
import java.util.*;


public class LHashSet extends Entry {
	


	@Override
	public String toString() {
		return getId() + "," + getName();
	}
public static void main(String[] args) {
	LinkedHashSet<Entry> lhs= new LinkedHashSet<Entry>();

Scanner scr= new Scanner(System.in);
while(true) {
	System.out.println("Press 1 to add or Press 2 to remove or Press 0 to stop: ");
	int count= scr.nextInt();
	if(count==0) {
		System.out.println("program terminated successfully");
		break;}
	if(count==1) {
		Entry entry= new Entry();
		System.out.println("Enter emp ID: ");

		entry.setId(scr.nextInt());
		System.out.println("Enter Employee Name: ");
		entry.setName(scr.next());
		lhs.add(entry);
		System.out.println("Data added successfully");

	}
	if(count==2) {	
		System.out.println("Enter emp ID to be removed: ");
		Entry entry = new Entry();
		entry.setId(scr.nextInt());
		System.out.println("Name?: ");
		entry.setName(scr.next());

		lhs.remove(entry);
		System.out.println("Data Removed successfully");

	}
}

for(Entry x: lhs) {
	System.out.println(x);
}
scr.close();
}
}