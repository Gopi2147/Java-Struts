package com.daily;
import java.util.*;
public class LHashSet extends Entry {
	static int count=0;
//	static Entry entry= new Entry();
public static void main(String[] args) {
//	LinkedHashSet<String> addition= new LinkedHashSet<String>();
	Scanner scr= new Scanner(System.in);
//	Entry entry= new Entry();
//	System.out.println("To add data Press 1");
//	System.out.println("To stop Press 0");
	while(true) {
		System.out.println("To add data Press 1 or To Stop Press 0");
		count = scr.nextInt();
		if(count<=0) break;
		System.out.println("Enter Data: ");
//		Entry entry= new Entry();
//		entry.setName(scr.next());
		String sr= scr.next();
		Entry.Main(sr);		
	}

for(String x: Entry.addition) {
	System.out.println(x);
}
scr.close();
}
}
