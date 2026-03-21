public class Lesson5 {

    public static int[] arrayCopy(int[] arr, int[] target){
        int[] ans = new int[target.length+arr.length];
        for(int i=0;i<target.length;i++)
            ans[i]=target[i];
        for(int i=0;i<arr.length;i++)
            ans[target.length+i]=arr[i];
        return ans;
    }

    public static void shakSort(int[] myarr){
        Boolean swap = true;
        int start =0;
        int end = myarr.length-1;
        while(swap){
            swap = false;
            for(int i = start; i<end; i++){
                if(myarr[i]>myarr[i+1]){
                    int temp = myarr[i];
                    myarr[i]=myarr[i+1];
                    myarr[i+1]=temp;
                    swap = true;
                }
            }
            if(!swap)break;
            end--;
            swap=false;
            for(int i = end; i>start;i--){
                if(myarr[i]<myarr[i-1]){
                    int temp = myarr[i];
                    myarr[i] = myarr[i-1];
                    myarr[i-1] =temp;
                    swap = true;
                }
            }
            start++;
        }
    }

    public static void main(String[] args){
        int[] myarr = {56,32,1,105,76,98,23,5};
        int[] target = {5,6,7};
        int[] arr = {1,2,3};
        int[] res = arrayCopy(arr,target);
        for(int i:res)
            System.out.print(i+" ");

        System.out.println(" ");
        shakSort(myarr);
        for(int i:myarr)
            System.out.print(i+" ");
    }
}
