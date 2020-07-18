/*What will be output for following statement when a=10 and b=20 c = 50
a++ + --b + c-- ?*/


class UnaryOperator{

      public static void main(String[] args){

        int a=10,b=20,c=50;
        int z =0;
      
        z= a++ + --b + c--;
        System.out.println(z);     //79
        System.out.println(a);     //11
        System.out.println(b);     //19
        System.out.println(c);     //49
      
         
     }





}
