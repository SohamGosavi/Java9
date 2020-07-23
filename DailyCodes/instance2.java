class Football{

}

class Cricket{

     public static void main(String [] args){
     
           Cricket t20= new Cricket();
           Cricket test=new Cricket();
           Football fmatch= new Football();
           
       System.out.println(t20 instanceof Object);
       System.out.println(fmatch instanceof Object);     // As Object is parent class so it give true value
    }
}



//We can not use class name for  getting instanceof.
//We can only use obj or refreance of that obj.

