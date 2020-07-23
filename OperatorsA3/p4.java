/*Write a java Program to check if the Bitwise operator ~(compliment) works with
operands with data type int, long, float, double and char.*/

class   Negations{
	    public static void main(String[] args) {
	     int num=6;
	     long lnum=7;
	     float fnum=21.5f;
	     double dnum=211.312;
	     char c='s';
		System.out.println(~num);
		System.out.println(~lnum);
		//System.out.println(~fnum);
		//System.out.println(~dnum);
		System.out.println(~c);
	}
}
