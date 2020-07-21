 /*What will be the output of the statement if i=5, j=4
 (i++ >= j++) && (--j < i++)
 (--i < j--) || (j++ >= ++i)*/
 
 
class Logical{


        int i=5,j=4;
        Boolean z;
        void logicalAnd(){
 
               z = (i++ >= j++)  &&  (--j < i++);
               System.out.println("ans =" +z);
               System.out.println("ans =" +i);
               System.out.println("ans =" +j);
        }

        void logicalOr(){
        
               z=(--i < j--) || (j++ >= ++i);    
               System.out.println("ans =" +z);
               System.out.println("ans =" +i);
               System.out.println("ans =" +j);

        }
 
           public static void main(String[] args){
           
               Logical obj= new Logical();
               obj.logicalAnd();
               obj.logicalOr(); 
                   
           }

} 
 
 
 
