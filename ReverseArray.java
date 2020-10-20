import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        reverse(a, n);
    }
    static void reverse(int array[], int num) {
        int temp;
        int j=0,k=num-1;
        while(j<k) {
            temp = array[j];
            array[j] = array[k];
            array[k] = temp;
            j++;
            k--;
        }
        for(int l=0;l<num;l++) {
            System.out.println(array[l]+" ");
        } 
    }
}