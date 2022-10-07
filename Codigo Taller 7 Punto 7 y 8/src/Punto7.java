 import java.util.Scanner;
public class Punto7 {
 public static void main(String[] args) { Scanner in = new Scanner(System.in); double[] scores = new
double[5]; double total = 0; double avg = 0;

 for(int i = 0; i < 5; i++){
 System.out.println("Enter a test score:");
 scores[i] = in.nextDouble(); total+=scores[i];
 }
 avg = total / 5;
 System.out.println("The average for those test scores is: " + avg);
 }
}



