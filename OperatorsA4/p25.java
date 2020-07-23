/*5:Write a Java code containing all the operators taught (Arithmetic, Logical,
Bitwise). Code must contain 3 Classes and one Main Class, where each class should
contain at least 1 static and 1 non static methods. No operations should be
performed in main class Except Object Creation and Calling the methods.*/





class Arithmetic{

          int x=30;
          int y=60;
          int ans=0;
          int a,b,c,d,e;
           void operations(){
           
            a = (ans=x+y);
            b = (ans=x-y);
            c = (ans=x*y);
            d = (ans=x/y);
            e = (ans=x%y);           
           
          }
          
          void display(){
         
         System.out.println("ADD ="  +a);
          System.out.println("Sub ="  +b);
           System.out.println("Mulp ="  +a);
            System.out.println("Div  ="  +a);
             System.out.println("Modul ="  +a);
         
         
         }
}

class logical{

        int x=10;
        int y=30;
        boolean ans,ans1;
        
        
        void loperations(){
        
        ans=(x<y) || (x>y);
        ans1=(x>y) && (x<y);
        }
        
        void  ldisplay(){
      
          System.out.println("Logical OR"  +ans);
           System.out.println("Logical And"  +ans1);
     
      }
}

class Bitwise{

          int x=50;
          int y=70;
          int ans,ans1,ans2,ans3;
          
          void boperations(){
          
           ans= x|y;
           ans1=x&y;
           ans2=x^y;
           ans3=~x;
          
          }

      void bdisplay(){
      
      
       System.out.println("Bitwise OR =" +ans);
        System.out.println("Bitwise And="+ans1);
         System.out.println("Bitwise XOR= "+ans2);
          System.out.println("Bitwise Complement =" +ans3);
      
      }
}

class Run{


           public static void main(String [] args){
           
           Arithmetic obj = new Arithmetic();
           obj.operations();
           obj.display();
           
           logical obj2 =new logical();
           obj2.loperations();
           obj2.ldisplay();
           
           
           Bitwise obj3 =new Bitwise();
           obj3.boperations();
           obj3.bdisplay();
           
           
           
           
           
           } 











}



