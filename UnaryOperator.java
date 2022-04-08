package tamilnadu.operator;

public class UnaryOperator {
public static void main(String[] args) {
	int a=10;  
	int b=10; 
	int c=-10;  
	boolean d=true;  
	boolean e=false; 
	int f=10;  
	System.out.println(f++);//10 (11)  
	System.out.println(++f);//12  
	System.out.println(f--);//12 (11)  
	System.out.println(--f);//10  
	System.out.println(a++ + ++a);//10+12=22  
	System.out.println(b++ + b++);//10+11=21 
	System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
	System.out.println(~c);//9 (positive of total minus, positive starts from 0)  
	System.out.println(!d);//false (opposite of boolean value)  
	System.out.println(!e);//true  
}
}
