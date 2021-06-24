package com.Training;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person>{
	//private static final TreeSet<Person> Person = null;
	int i; String S;
	
	static String words;//words count
	
	Person(int i, String S){
		this.i=i; this.S=S;
	}//constructor to pass objects
	
	public String toString() {return i+")"+ S+ " ";}
	
	@Override
	public int compareTo(Person o) {return S.compareTo(o.S);}
	
 public static void main(String [] args) throws Exception {
	 
	 Set<Person> obj= new TreeSet<Person>();
	 
	 File inputFile= new File("C:\\Users\\BCP\\Documents\\Train.txt");//ip file loc
	 File outputFile = new File ("C:\\Users\\BCP\\Documents\\Test2.txt");//op file loc
	 FileReader read; FileWriter write;
	 
	 try {
		read= new FileReader(inputFile); 
		write= new FileWriter(outputFile);
		BufferedReader read2= new BufferedReader(read);
		BufferedWriter write2= new BufferedWriter(write);
        System.out.println("File was read successfully :)");
		
        /*
         * Storing all content of the file in the form of String array
         * */
		while((words=read2.readLine())!= null) {	
			String [] separate= words.split(",");
			Person person = new Person(Integer.parseInt(separate[0]), separate[1]);
			obj.add(person);
		}
		System.out.println(obj);
		
		/*
		 * Iterator method to read all content and write
		 * newLine()-moves cursor to next line
		 * flush()-push the content to destination file
		 * */
		for(Person sorted: obj) {
			write2.write(sorted.toString());
			write2.newLine();
		}
		write2.flush();
		Thread.sleep(2000);
		System.out.println("File Written successfully :)");
		System.out.println("Check your destination file");
		write2.close(); read2.close();		
	 }
	 catch(Exception ex) {
		String error= ex.getMessage();
		System.out.println(error);
	 }
 }
}
