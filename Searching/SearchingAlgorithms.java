import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SearchingAlgorithms {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no. of values: ");
        int n=scan.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter the values : ");
        for(int i=0;i<n;i++){
            numbers[i]= scan.nextInt();
        }

        System.out.println("Enter the value you wanted to search:");
        int x=scan.nextInt();

        SearchingAlgorithms sal=new SearchingAlgorithms();
        System.out.println("Give your preference: " );
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search" );

        int choice=scan.nextInt();
        switch (choice) {
            case 1:
                sal.linearSearch(numbers, x);
                break;
            case 2:
                sal.binarySearch(numbers, x);
                break;
            default:
                System.out.println("You have give wrong choice, Try again!!!");
                break;
        }


    }
    //Linear Search
    public static void linearSearch(int[] numbers,int x){
        System.out.println("Linear Search");
        System.out.println("-----------------");
        long startTimeForLS=System.nanoTime();
        int noOfComparisons=0;
        int valueFound=0;
        for(int i=0;i<numbers.length;i++) {
            noOfComparisons++;
            if (numbers[i] == x) {
                valueFound = i;
                break;
            } else {
                valueFound = -1;
            }

        }

        if(valueFound!=-1) {
            System.out.println("The value " + x + " is found in the given list at index : " + valueFound);

        }
        else{
            System.out.println("Nah!! The value " + x + " is not found in the given list.");
        }
        System.out.println("Number of comparisons is " + noOfComparisons);
        long endTimeForLS=System.nanoTime();
        long timeForLS= endTimeForLS-startTimeForLS;
        System.out.println("The time taken to find the given element : " + timeForLS + " nano secs");
    }

    //Binary Search
    public static void binarySearch(int[] numbers,int x){
        System.out.println("Binary Search");
        System.out.println("-----------------");
        long startTimeForBS=System.nanoTime();
        Arrays.sort(numbers);
        int start=0;
        int end=numbers.length-1;
        int noOfComparisons=0;
        int valueFound=0;

        while (start<=end){
            int mid=start+(end-start)/2;
            noOfComparisons++;

            if(numbers[mid]==x){
                valueFound=mid;
                break;
            }
            if(numbers[mid]>x){
                valueFound=-1;
                end=mid-1;
            }
            else{
                valueFound=-1;
                start=mid+1;
            }
        }


        long endTimeForBS=System.nanoTime();
        if(valueFound!=-1) {
            System.out.println("The value " + x + " is found in the given list at index : " + valueFound);

        }
        else{
            System.out.println("Nah!! The value " + x + " is not found in the given list.");
        }

        long timeForBS= endTimeForBS-startTimeForBS;
        System.out.println("The time taken to find the given element : " + timeForBS + " nano secs");
        System.out.println("Number of comparisons is " + noOfComparisons);

    }

}
