/*Write a Java code considering your favorite sports/games i.e. either indoor or outdoor (if
more than one game, make one class for each game) which must have at least one static variable,
instance variable, static method and one instance method.*/

class Badminton{

        static int totalplayer= 2;
        int points;
        
        static  void  players(){
        
              System.out.println("P. V. Sindhu");
              System.out.println("Srikanth Kidambi");
        }

       void   points(){
       
             System.out.println("P. V. Sindhu points=" +points);
             System.out.println("Srikanth Kidambi points=" +points);
             
       
       
       
       }
 
        public static void main(String [] args){
        
             Badminton obj = new Badminton();
             obj.players();
             int points=++obj.points;
             obj.points();             
             
        }



}
