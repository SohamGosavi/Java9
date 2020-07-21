/*Write a code which will contain 2 numbers. Use the following operators on it.
1. less than (<)
2. greater than (>)
3. less than or equal to (<=)
4. greater than or equal to (>=)
5. equivalent (==)
6. not equivalent (!=)
*/

class Operators{

            int x = 20;
            int y = 50;
            Boolean ans ;
            
            void Operations(){
            
                  System.out.println( "ans =" + (x<y));
                  System.out.println( "ans =" + (x>y));
                  System.out.println( "ans =" + (x<=y));
                  System.out.println( "ans =" + (x>=y));
                  System.out.println( "ans =" + (x==y));
                  System.out.println( "ans =" + (x!=y));
         
            }   

             public static void main(String[] args ){
             
               Operators  obj = new  Operators();
               obj.Operations();
             
             
             
             }




}
