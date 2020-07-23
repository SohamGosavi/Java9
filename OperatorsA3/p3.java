/* What will be the output of the following statement if num1=10, num2= 5:
(num1++ | num2)&((++num2)^num1)
and also write the precedence of the operators you came across till now(on paper or notebook or
text file).*/


class Precedence{

	public static void main(String[] args) {
	    
	    int num1=10,num2=5;
	    int num,mum;
	    System.out.println((num1++ | num2)&((++num2)^num1));
	}
}
