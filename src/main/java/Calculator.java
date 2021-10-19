

import java.util.Scanner;
import java.util.List;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String expr= scan.nextLine();
        String[] words= expr.split(" ");
        if(words.length!=3) throw new RuntimeException("Некорректная форма ввода");
        String num1=words[0];
        String oper=words[1];
        String num2=words[2];
        Operation.checkOper(oper);

        try {
            int num11= Integer.parseInt(num1);
            int num22= Integer.parseInt(num2);
            if((num11<1||num11>10)||(num22<1||num22>10)){ throw new RuntimeException();}
            else {int result= Operation.solve(num11, num22, oper);
                System.out.printf("Результат равен %d", result);}
        }
        catch (Exception ex) {
            List<RomanNum> romanNumList= RomanNum.getValues();
            int num1Arab=0;
            int num2Arab=0;
            int i=0;
            while(i<10) {
                if (num1.equals(romanNumList.get(i).name())) {num1Arab=i+1;}
                if (num2.equals(romanNumList.get(i).name())) {num2Arab=i+1;}
                i++;
            }
            if (num1Arab==0||num2Arab==0) throw new RuntimeException("Некорректная форма ввода");
            int result= Operation.solve(num1Arab, num2Arab, oper);
            if (result<0) throw new RuntimeException("В римской системе счисления нет отрицательных чисел");
            if (result==0) throw new RuntimeException("В римской системе счисления нет нуля");
            String romanStringResult= RomanNum.getRomResult(result);
            System.out.printf("Результат равен %s",romanStringResult);

        }


    }
}
