
public class Main {

    public static void printThreeWords() {
        System.out.println("Orange, Banana, Apple.");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -6;
        if((a+b) >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void  printColor(){
        int value = 5;
        if(value <= 0){
            System.out.println("Красный");
        }
        else if(value>=0 && value<100){
            System.out.println("Желтый");
        }
        else{
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 7;
        int b = 8;
        if(a>=b){System.out.println("a>=b");}
        else{System.out.println("a<b");}
    }
    public static boolean check(int a, int b){
        if((a+b)>=10 && (a+b)<20){
            return true;
        }
        return false;
    }
    public static void positiveOrNegative(int t){
        if(t>=0)System.out.println("положительное");
        else System.out.println("отрицательное");
    }
    public static Boolean checkPositiveOrNegative(int t){
        if(t>=0)return true;
        else return false;
    }

    public static void printString(String s, int k){
        for(int i=0;i<k;i++){
            System.out.println(s);
        }
    }

    public static Boolean isYear(int y){
        if(y%400==0)return true;
        else if(y%100==0){return false;}
        else return y%4==0;
    }
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        System.out.println(check(10,3));
        positiveOrNegative(8);
        System.out.println(checkPositiveOrNegative(3));
        printString("hi",4);
        int y = 2026;
        System.out.println(y + " високосный? " + isYear(y));

    }
}
