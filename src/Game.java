import java.util.Scanner;
import java.util.Random;
public class Game {


    public static void main(String[]args){
        String[] arr = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String secret = arr[r.nextInt(arr.length)];
        String guess="";
        while(!guess.equals(secret)){
            System.out.println("Введите слово: ");
            guess = sc.nextLine();
            if(guess.equals(secret))System.out.println("Верно");
            else{
                String tmp="";
                for(int i=0;i<15;i++){
                    if(i<guess.length() && i<secret.length() && guess.charAt(i)==secret.charAt(i)){
                        tmp+=secret.charAt(i);
                    }
                    else{
                        tmp+="#";
                    }
                }
                System.out.println(tmp);
            }
        }

    }
}
