package Arrays;

import java.util.Arrays;

public class max_min_element {
    public static int  MaxELement(int[] arr){
        if(arr.length==0){
            System.out.println("Array is empty");
            return 0;
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
//
                max=arr[i];

            }
        }
        return max;




    }


    public static int secondMax(int arr[]){
        Arrays.sort(arr);
        int temp=arr[arr.length-2];
        return temp;

    }
    public static int secondMin(int arr[]){
        Arrays.sort(arr);
        int temp=arr[1];
        return temp;

    }
    public static  int MinElement(int arr[]){
        if(arr.length==0){
//            System.out.println("Array is empty");
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
             int arr[]={31,6,7,44,77,33};
//        int arr[]={};

        System.out.println("max:"+MaxELement(arr));
        System.out.println("---------------");
        System.out.println("min:"+MinElement(arr));
        System.out.println("secMax:"+secondMax(arr));
        System.out.println("secMin:"+secondMin(arr));


    }
}
