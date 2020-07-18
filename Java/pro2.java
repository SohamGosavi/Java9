/*Write a code to calculate following operation between two numbers
1) Addition
2) Subtraction
3) Multiplication
4) Division
5) Modulus
Every operation should carried out in a separate method*/

class Operations{

            int x = 50;
            int y = 20;
            int z =0;
            
            void calculate(){
             
             System.out.println("Additions =" + (z= x+ y) );
             System.out.println("Subs =" + (z=x-y) );
             System.out.println("Mulp =" + (z=x* y) ); 
             System.out.println("Div =" + (z= x/ y) );
             System.out.println("Modulus =" + (z=x % y) );
 
             
             
             
            }
              public static void main(String[] args ){
              
              Operations obj =new Operations();
              obj.calculate();
             
              }
}






