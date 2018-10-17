import java.util.Arrays;
import java.util.Scanner;
//Sorting Algorithms with O(n^2) complexity
public class SortingAlgorithms {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no. of values: ");
        int n=scan.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter the values : ");
        for(int i=0;i<n;i++){
            numbers[i]= scan.nextInt();
        }
        System.out.println("Before Sorting:");

        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        bubbleSort(numbers);
        insertionSort(numbers);
        selectionSort(numbers);
    }
    //Bubble Sort
    public static void bubbleSort(int[] arr){
        System.out.println("Bubble Sorting: Compare with the next consecutive element");
        System.out.println("-----------------------");
        long startTimeForBS=System.nanoTime();
        int length=arr.length;
        int noComparisons=0,noSwaps=0;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                noComparisons++;
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    noSwaps++;
                }
            }
        }
        System.out.println("After Sorting:");
        for(int i=0;i<length;i++) {
            System.out.print(arr[i]+ " ");
        }
        long endTimeForBS=System.nanoTime();
        long timeForBS= endTimeForBS-startTimeForBS;
        System.out.println();
        System.out.println("The time taken to sort : " + timeForBS + " nano secs");
        System.out.println("No. of Comparisons taken:"+noComparisons);
        System.out.println("No. of Swaps taken:"+noSwaps);
        System.out.println("-----------------------");
        System.out.println();
    }

    //Insertion Sort
    public static void insertionSort(int[] arr) {
        System.out.println("Insertion Sorting: One element at a time builds a final sorting array, by comparing its previous values");
        System.out.println("-----------------------");
        long startTimeForIS = System.nanoTime();
        int length = arr.length;
        int noComparisons = 0;
        for(int i=1;i<length;++i){
            int key=arr[i];
            int j=i-1;
            noComparisons++;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=key;
        }
        System.out.println("After Sorting:");
        for(int i=0;i<length;i++) {
            System.out.print(arr[i]+ " ");
        }
        long endTimeForIS=System.nanoTime();
        long timeForIS= endTimeForIS-startTimeForIS;
        System.out.println();
        System.out.println("The time taken to sort : " + timeForIS + " nano secs");
        System.out.println("No. of Comparisons taken:"+noComparisons);
        System.out.println("-----------------------");
        System.out.println();
    }
    //Selection Sort
    public static void selectionSort(int[] arr){
        System.out.println("Selection Sorting: Take each element, swap with minimum element");
        System.out.println("-----------------------");
        long startTimeForSS=System.nanoTime();
        int length=arr.length;
        int noComparisons=0,noSwaps=0;

        for(int i=0;i<length-1;i++){
            int min=i;
            for(int j=i+1;j<length;j++){
                noComparisons++;
                if(arr[j]<arr[min]) {
                    min = j;
                    noSwaps++;
                }

            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

            }
        }
        System.out.println("After Sorting:");
        for(int i=0;i<length;i++) {
            System.out.print(arr[i]+ " ");
        }
        long endTimeForSS=System.nanoTime();
        long timeForSS= endTimeForSS-startTimeForSS;
        System.out.println();
        System.out.println("The time taken to sort : " + timeForSS + " nano secs");
        System.out.println("No. of Comparisons taken:"+noComparisons);
        System.out.println("No. of Swaps taken:"+noSwaps);
        System.out.println("-----------------------");
        System.out.println();
    }
}
