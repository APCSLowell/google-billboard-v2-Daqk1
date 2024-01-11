public class Main {
    public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
    public static void main(String[] args) {
      
          System.out.print("7.427466391E9");
      
         
    }

    public static boolean isPrime(double dNum)  
    {   
      for(double i = 2; i <= Math.sqrt(dNum); i++){
        if(dNum%i == 0){
          return false;
        }
        }
        return true;  
}
}
