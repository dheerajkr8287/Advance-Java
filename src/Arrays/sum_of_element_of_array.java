package Arrays;

public class sum_of_element_of_array {
    public static  int sumArray(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp=temp+arr[i];
        }
        return  temp;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(sumArray(arr));
    }
}
