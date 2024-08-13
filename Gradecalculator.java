import java.util.Scanner;
public class Gradecalculator 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of subjects: ");
int nSubjects = scanner.nextInt();
int[] marks = new int[nSubjects];
System.out.println("Enter the marks for each subject (out of 100):");
for (int i = 0; i < nSubjects; i++) 
{
System.out.print("Subject " + (i + 1) + ": ");
marks[i] = scanner.nextInt();
}
int totalMarks = 0;
for (int mark : marks) 
{
totalMarks += mark;
}
double avgPercentage = (double) totalMarks / nSubjects;
String grade = calculateGrade(avgPercentage);
System.out.println("\nResults");
System.out.println("Total Marks: " + totalMarks);
System.out.println("Average Percentage: " + String.format("%.2f", avgPercentage) + "%");
System.out.println("Grade: " + grade);
}
private static String calculateGrade(double avgPercentage) 
{
if (avgPercentage >= 90) 
{
return "A+";
} 
else if (avgPercentage >= 80) 
{
return "A";
} 
else if (avgPercentage >= 70) 
{
return "B";
} 
else if (avgPercentage >= 60) 
{
return "C";
} 
else if (avgPercentage >= 50) 
{
return "D";
} 
else 
{
return "F";
}
}
}