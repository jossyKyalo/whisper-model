package firstTrial;
import java.util.Scanner;

public class Marksheet {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of unit codes:");
		int size=in.nextInt();
		String[] units=new String[size];
		double[] scores=new double[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter unit "+(i+1)+":");
			units[i]=in.next();
			System.out.println("Now enter the mark for\t"+units[i]+":");
			scores[i]=in.nextDouble();
			
		}
		System.out.println("\t\t\tDepartment of Computer Science");
		System.out.println("\t\t\t\tEnd of Semester Results");
		System.out.println("------------------------------------------------------------------------------");
		String fullName="Kyalo Josephine Kathini";
		String regNO="C026-01-0935/2022";
		double sem=2.2;
		System.out.println("|Name:"+fullName+"\t|Roll_No:"+regNO+"\tSemester:"+sem);
		System.out.println("_______________________________________________________________________________");
		System.out.println("|Unit Code\t\t\t|Unit Name:\t\t\tScore");
		System.out.println("--------------------------------------------------------------------------------");
		double sum=scores[0]+scores[1]+scores[2]+scores[3];
		int total=(int)sum;
		double average=sum/size;
		System.out.println("|"+units[0]+"\t\t\t|Database\t\t\t|"+(int)scores[0]);
		System.out.println("");
		System.out.println("|"+units[1]+"\t\t\t|Systems\t\t\t|"+(int)scores[1]);
		System.out.println("");
		System.out.println("|"+units[2]+"\t\t\t|Algorithm\t\t\t|"+(int)scores[2]);
		System.out.println("");
		System.out.println("|"+units[3]+"\t\t\t|Statistics\t\t\t|"+(int)scores[3]);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("|Total\t\t\t\t\t\t\t\t|"+total);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("|Average\t\t\t\t\t\t\t|"+average);
		System.out.println("---------------------------------------------------------------------------------");
		char grade;		
		String recommendation;
		if (average>= 70) {
            grade = 'A';
            recommendation = "Recommend Pass";
        } else if (average >= 60) {
            grade = 'B';
            recommendation = "Recommend Pass";
        } else if (average>= 50) {
            grade = 'C';
            recommendation = "Recommend Pass";
        } else if (average>= 40) {
            grade = 'D';
            recommendation = "Recommend Pass";
        } else {
            grade = 'F';
            recommendation = "Recommend Fail";
        }
		System.out.println("|Grade\t\t\t\t\t\t\t\t|"+grade);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t  Recommendation|");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Grading Criteria\t\t\tOverall Grade(A-D)\t"+recommendation);
		System.out.println("70-100\t\tA");
		System.out.println("60-69\t\tB");
		System.out.println("50-59\t\tC");
		System.out.println("40-49\t\tD");
		System.out.println("Below 40\tF");
		System.out.println("------------------------------------------------------------------------------------");		
	}
}
