/* Write a Java program for following operations and explain the error if any.
1.num=188 result = num>>>4
2.num=255 result1 = num<<<3
2. num = -108 result =num>>>23
3. num=-123 result1 = num<<<15*/


class Lrshift{

        int  num=188;
        int  num1=-108;
        int  num2= 255;
        int num3=-123;
        int result;
      
        void rightshift(){
                  
         
              
          System.out.println( (result= num>>>4));
          System.out.println( (result= num1>>>23));
        }       
        
        void leftshift(){
        
          
         // System.out.println( (result= num<<<3));    //error
	 // System.out.println( (result= num1<<15)); //error
         
        }

        public static void main(String [] args){
        
           Lrshift obj = new Lrshift();
           obj.leftshift();
           obj.rightshift();        
        }

}
