/*Program 5 : Write 2 classes as Pune, Mumbai. Add the following things :
class Pune : static variable : int covidActiveCases
instance variable : int totalCases
static method : noCorona
instance method : lockdown,noLockdown
class Mumbai : static variable : int covidActiveCases
instance variable : int totalCases
static method : noCorona
instance method : lockdown ,noLockdown
Increment both the variables in non static method. Call non static methods twice, display the output
and observe the changes.*/


class Pune{
    
       static int activeCases = 30000;
       int totalCases = 40000;
       
       static void noCorona(){
       
       System.out.println("*******Go Corona Go*******");
       }       
        
       void lockdown(){
       activeCases++;
       totalCases++;
       System.out.println("Active Cases : " + activeCases);
       System.out.println("Total Cases : " + totalCases);
       
       }
  
        void noLockdown(){
       activeCases++;
       totalCases++;
       System.out.println("Active Cases : " + activeCases);
       System.out.println("Total Cases : " + totalCases);
       
       }

}


class Mumbai{

          static int activeCases = 100000;  
          int totalCases = 200000;
         
          static void noCorona(){
                      
          System.out.println("Pray for Mumbai");
          }
                          
          void lockdown(){
          activeCases++;
          totalCases++;
          System.out.println("Active Cases : " + activeCases);
          System.out.println("Total Cases : " + totalCases);
         }
         
         void noLockdown(){
          activeCases++;
          totalCases++;
          System.out.println("Active Cases : " + activeCases);
          System.out.println("Total Cases : " + totalCases);
         }
}


class Run{


               public static void main(String[] args){
               System.out.println("PUNE :");
          
               Pune p1 = new Pune();
               p1.noCorona();
	 	p1.lockdown();
		p1.noLockdown();
		Pune p2 = new Pune();
		p2.lockdown();
		p2.noLockdown();
		
		System.out.println("MUMBAI :");
		Mumbai m1 = new Mumbai();
		m1.noCorona();
		m1.lockdown();
		m1.noLockdown();
		Mumbai m2 = new Mumbai();
		m2.lockdown();
		m2.noLockdown();
              }
}

