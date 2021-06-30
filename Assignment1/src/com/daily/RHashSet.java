package com.daily;
import java.util.*;
public class RHashSet {
public static void main(String[] args) {
	Entry.Main(null);
	Scanner scr= new Scanner(System.in);
	System.out.println(Entry.addition);
	System.out.println("Enter a data to be removed");
	String name= scr.next();
	Entry.Main(null);
	Entry.addition.remove(name);
	scr.close();
}
}
