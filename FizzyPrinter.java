public class FizzyPrinter{
    public String printFizzy(int n,boolean upper) {
        
        String result = "";

       
        if (n % 3 == 0) result += "Fizz";
        if (n % 5 == 0) result += "Buzz";
        if (n % 7 == 0) result += "Bang";

       
        if (result.isEmpty()) {
            result = "Boom";
        }
       if(upper==true){
        result=result.toUpperCase();
        return result;

       }

        return result;
    }
}
