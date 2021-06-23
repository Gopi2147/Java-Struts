package com.Training;

import java.io.*;

public class SerialDemo extends Save{
	void disp() {
		System.out.println("Object Copy Made :)");
	}
public static void main(String[] args) {
	Save save= new SerialDemo();
	save.i=10;
	save.j=20;
	
	try {
	FileOutputStream fos= new FileOutputStream("C:\\Users\\BCP\\Documents\\Serialization.txt");
	ObjectOutputStream oos= new ObjectOutputStream(fos);
	oos.writeObject(save);
	save.disp();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
abstract class Save implements Serializable{
	 int i, j;
	 abstract void disp();
 }