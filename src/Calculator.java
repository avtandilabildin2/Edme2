import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число ,операцию и второе число разделяя пробелами");
        String input=sc.nextLine();
        try{

            System.out.println(calc(input));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static String calc(String input){
        input=input.trim();
        String[] arr = input.split(" ");
        int n1=0,n2=0;
        try {

            n1=Integer.parseInt(arr[0]);
            n2=Integer.parseInt(arr[2]);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        if(n1<1||n1>10||n2<1||n2>10){
            throw new IllegalArgumentException("Числа не должны быть больше 10 и меньше 1");
        }
        if(arr.length!=3){
            throw new IllegalArgumentException("Ошибка ввода, ввод должен содержать одно число ,операция и второе число разделенных пробелами");
        }
        if(arr[1].equals("+")){
            return "Ваш результат: "+(n1+n2);
        }
        else if(arr[1].equals("-")){
            return "Ваш результат: "+(n1-n2);
        }
        else if(arr[1].equals("*")){
            return "Ваш результат: "+(n1*n2);
        }
        else if(arr[1].equals("/")){
            return "Ваш результат: "+(n1/n2);
        }
        throw new  IllegalArgumentException("Нужно ввести какую то операцию + - / *")
    }
}
