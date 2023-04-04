package demo2package;

public class trycatchdemo {
    int divideNumber(int div, int num){
        try{
            int result = num/div;
            return result;
        }catch (Exception e){
System.out.println("Divided by zero");
        }
return  0;
    }
}
