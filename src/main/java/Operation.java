
public class Operation {
    public static int add (int a, int b) {
        return a+b;
    }
    public static int subtract (int a, int b)
    {
        return a-b;
    }
    public static int multiply  (int a, int b)
    {
        return a*b;
    }
    public static int divide (int a, int b)
    {
        return a/b;
    }

    public static int solve(int a, int b, String oper) {
        int result=0;
        switch(oper) {
            case "+": result= add(a, b);
                break;
            case "-": result= subtract(a, b);
                break;
            case "*": result= multiply(a, b);
                break;
            case "/": result= divide(a, b);
                break;
        }
        return result;
    }
    public static void checkOper(String oper) {
        if ((oper=="+")^(oper=="-")^(oper=="*")^(oper=="/")) throw new RuntimeException("Некорректная форма ввода");
    }
}



