package examCode2.taskException;

public class DivideByZero {
    public int divide(int a,int b){
        if(b==0){
            throw new DivideByZeroException("Divide by zero not allowed");
        }
        return a / b;
    }
}
