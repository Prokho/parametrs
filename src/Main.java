//пользователь вводит два числа, отличных от нуля. Нужно найти среднее число
// используеться цикл ваил и передача параметров. каждый параметр в отдельном методе


import java.util.Scanner;

public class Main {

    static int digitOne (){

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while(a==0){
            a = scanner.nextInt();
        }
        return a;

    }

    static int digitTwo(int a){

        int b = a;
        while(b==a){
          b=digitOne();
        }
        return b;
    }

    public static int devideFigure(int a, int b){

        int z = (a+b)/2;
        return z;
    }


    public static void main(String[] args) {
        int c=digitOne();
        int k=digitTwo(c);
        System.out.println(devideFigure(c, k));

    }


}
