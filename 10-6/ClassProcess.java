package com.Training;
interface Task{
	void activity();
}
abstract class Alphabet{
	protected int sno;
	protected String type;
	
	Alphabet(int sno, String type){
		this.sno= sno;
		this.type=type;
	}
	
	public abstract void m();
	public abstract void n();
}

class A extends Alphabet implements Task{
	A(int sno, String type){
		super(sno, type);
	}
	public void m() {
		System.out.println(sno);
	}
	public void n() {
		System.out.println("A is a "+type);
	}
	public void activity() {
		System.out.println("Activity Done by A");
	}
}
class B extends Alphabet implements Task{
	B(int sno, String type){
		super(sno, type);
	}
	public void m() {
		System.out.println(sno);
	}
	public void n() {
		System.out.println("B is a "+ type);
	}
	public void activity() {
		System.out.println("Activity Done by B");
	}
}
class C extends Alphabet implements Task{
	C(int sno, String type){
		super(sno, type);
	}
	public void m() {
		System.out.println(sno);
	}
	public void n() {
		System.out.println("C is a "+type);
	}
	public void activity() {
		System.out.println("Activity Done by C");
	}
}
class D extends Alphabet implements Task{
	D(int sno, String type){
		super(sno, type);
	}
	public void m() {
		System.out.println(sno);
	}
	public void n() {
		System.out.println("D is a "+type);
	}
	public void activity() {
		System.out.println("Activity Done by D");
	}
}
class Process{
	public static void process(Task t) {
		t.activity();
	}
}
public class ClassProcess {
	final static int a=9;
	public static void process(Alphabet a) {
		a.m();
		a.n();
	}
	public static void main(String[] args) {
	
		Process.process(new A(1, "Character"));
		Process.process(new B(2, "Character"));
		Process.process(new C(3, "Character"));
		Process.process(new D(4, "Character"));
		System.out.println("-----------------------------");
		ClassProcess.process(new A(1, "Character"));
		ClassProcess.process(new B(2, "Character"));
		ClassProcess.process(new C(3, "Character"));
		ClassProcess.process(new D(4, "Character"));
	}
}
