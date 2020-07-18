/*Write a Java Program with a class of name dominos with two instance
variable 'price' and 'quantity', declare one static variable named 'total' and static
method bill() . Create two objects of class named as pizza and fires assign some value
for instance variable of class and calculate the total bill & print the total cost.*/


class Dominos {

          int price = 0;
          int quantity =0;
   static int total = 0;
   
          static void bill(){
          
             System.out.println("Total Bill =" + total);
          
          }  
          
       public static void main(String[]  args){
       
             Dominos fries = new Dominos();
             fries.price = 120 ;
             fries.quantity =  2;
          
             Dominos pizza = new Dominos();
             pizza.price= 500;
             pizza.quantity = 2;
             
             Dominos.total = fries.price  + pizza.price ;
             Dominos.bill();
                 
       
       
       
       
       }    



}

