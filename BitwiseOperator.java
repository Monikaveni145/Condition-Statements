package tamilnadu.operator;

public class BitwiseOperator {
	 
public static void main(String[] args) {
	BitwiseOperator bw = new BitwiseOperator();
	bw.or();
	bw.and();
	bw.complement();
	bw.xor();
	bw.Shift();
}
	private void or() {
	// TODO Auto-generated method stub
	 int a=10;  
	 int b=5;  
	 int c=20;  
	 System.out.println(a>b||a<c);//true || true = true  
	 System.out.println(a>b|a<c);//true | true = true  
	 //|| vs |  
	 System.out.println(a>b||a++<c);//true || true = true  
	 System.out.println(a);//10 because second condition is not checked  
	 System.out.println(a>b|a++<c);//true | true = true  
	 System.out.println(a);//11 because second condition is checked  
		
}
	public void and() {
	 int a=10;  
     int b=5;  
	 int c=20;  
	 System.out.println(a<b&&a<c);//false && true = false  
	 System.out.println(a<b&a<c);//false & true = false  
		}

	public void xor() {
	int number1 = 12, number2 = 25, result;
    // bitwise XOR between 12 and 25
	result = number1 ^ number2;
	System.out.println(result);    // prints 21
		}
		
	public void complement(){
	int number = 35, result;
	// bitwise complement of 35
	result = ~number;
	System.out.println(result);    // prints -36

		}
	public void Shift(){
			//left shift
	System.out.println(10<<2);//10*2^2=10*4=40  
    System.out.println(10<<3);//10*2^3=10*8=80  
    System.out.println(20<<2);//20*2^2=20*4=80  
	System.out.println(15<<4);//15*2^4=15*16=240 
			//right shift
	System.out.println(10>>2);//10/2^2=10/4=2  
	System.out.println(20>>2);//20/2^2=20/4=5  
	System.out.println(20>>3);//20/2^3=20/8=2 
			//unsigned right shift
			 //For positive number, >> and >>> works same  
	System.out.println(20>>2);  //5
	System.out.println(20>>>2);  //5
		    //For negative number, >>> changes parity bit (MSB) to 0  
	System.out.println(-20>>2);  //-5
	System.out.println(-20>>>2);  //1073741819
		}
	}
