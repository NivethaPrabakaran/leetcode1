import java.util.Arrays;

public class Check {
    static void checkValue(int arr[], int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("["+i+" "+"]" +"+"+"["+" "+j+"]"+"="+" target"+" "+(i+j));
                }
        }
        }
    }
}
