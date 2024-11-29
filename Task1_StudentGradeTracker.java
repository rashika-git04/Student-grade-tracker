import java.util.Scanner;

public class Task1_StudentGradeTracker {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int[] marks =  getMarks();
        int highest = high(marks);
        int lowest = low(marks);
        int average = average(marks);

        System.out.println("Highest marks is: " + highest);
        System.out.println("Lowest marks is: " + lowest);
        System.out.println("Average marks are: " + average);

    }

    static int[] getMarks(){
        int numSub, numCheck;
        int[] marks = new int[0];
        System.out.printf("Enter no of subjects: ");
        numSub = input.nextInt();
        if (numSub == 0){
            System.out.printf("Number of subjects must be greater than 1");
        }
        if (numSub > 0){
            marks = new int[numSub];
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of " + (i+1) + " subject: ");
            numCheck =  input.nextInt();
            if (numCheck < 0 || numCheck > 100){
                System.out.println("Invalid number");
            } else {
                marks[i] = numCheck;
            }

        }
        return marks;
    }

    static int high(int[] arr){
        int highest;
        highest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest){
                highest = arr[i];
            }
        }
        return highest;
    }

    static int low(int[] arr){
        int lowest;
        lowest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest){
                lowest = arr[i];
            }
        }
        return lowest;
    }

    static int average(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/ arr.length;
    }
}




