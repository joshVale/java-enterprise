public class Lesson2 {

    public static void changeZerotoOne(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = 1 - arr[i];
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void printArr(){
        int[] num = new int[100];
        for(int i = 0; i < 100; i++){
            num[i] = i + 1;
        }
        for(int j : num){
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] giveArr(int[] num){
        for(int i = 0; i < num.length; i++){
            if(num[i] < 6) num[i] *= 2;
        }
        return num;
    }

    public static void fillDiagonals(int[][] arrays){
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                if(i == j || i + j == arrays.length - 1){
                    arrays[i][j] = 1;
                }
            }
        }

        for(int[] row : arrays){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[] ArrValue(int len, int initialValue){
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void minMax(int[] num){
        int min = num[0];
        int max = num[0];

        for(int i = 1; i < num.length; i++){
            if(num[i] > max) max = num[i];
            if(num[i] < min) min = num[i];
        }

        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }

    public static boolean checkBalance(int[] arr){
        if(arr.length == 0) return false;

        int sum = 0;
        for(int i : arr) sum += i;

        int leftSum = 0;
        for(int i = 0; i < arr.length; i++){
            leftSum += arr[i];
            if(leftSum == sum - leftSum) return true;
        }
        return false;
    }
}