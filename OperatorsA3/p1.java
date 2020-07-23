/*Program 1: Write a Java Program to check if the Bitwise operators given below works on int, long,
char, float, and double data types
1. Bitwise AND (&)
2. Bitwise OR (|)
3. Bitwise XOR (^)
And also write down your conclusion in the comments.*/


class CheckBitwise{

             int x=5,y=10;
	     float f1=5.3f,f2=11.5f;
	     char c1='s',c2='p';
	     long l1=30000,l2=841150;
	     double d1=13.45034,d2=14.213333;


             void  bitwiseAnd(){
                 
                 System.out.println(x&y);
              // System.out.println(f1&f2);        // Bad operand(float)  for BitwiseAnd
                 System.out.println(c1&c2);
              // System.out.pritnln(d1&d2);        // Bad operand(double)  for BitwiseAnd
              }

            void  bitwiseOr(){
            
                  System.out.println(x|y);
                //System.out.println(f1|f2);      //  Bad operand(float) for BitwiseOR
                  System.out.println(c1|c2);
               // System.out.pritnln(d1|d2);      //  Bad operand(double)  for BitwiseOR
            }

            void  bitwiseXor(){
            
                  System.out.println(x^y);
               // System.out.println(f1^f2);      //   Bad operand(flaot)  for BitwiseXOR
                  System.out.println(c1^c2);
               // System.out.pritnln(d1^d2);      //   Bad operand(double)  for BitwiseXOR
            }
            
            public static void main(String [] args){
            
               CheckBitwise obj = new CheckBitwise();
               obj.bitwiseAnd();
               obj.bitwiseOr();
               obj.bitwiseXor();
            }
}
