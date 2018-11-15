import java.util.Scanner;


public class Assignmentq9 {

	public static void main(String[] args) {
		Assignmentq9 assignmentq9=new Assignmentq9();
		Scanner scanner=new Scanner(System.in);
		String name[] =new String[3];
		int marks1[]=new int[3];   
		int marks2[]=new int[3];
		int marks3[]=new int[3];
		int marks4[]=new int[3];
		int total1=0,total2=0,total3=0,average1,average2 ,average3,average;
		for(int i=0;i<3;i++)
     {
    	 
    	marks1[i]=scanner.nextInt();
    	total1=total1+marks1[i];
    	System.out.println("total marks is:"+total1);
    	average1=total1/3;
    	System.out.println("Average is:"+average1);
     }
		for(int j=0;j<3;j++)
		{
			marks2[j]=scanner.nextInt();	
			total2=total2+marks2[j];
			
			
			
		}
		System.out.println("total marks of student2:"+total2);
	average=total2/3;
		for(int k=0;k<3;k++)
		{
			marks3[k]=scanner.nextInt();	
			total3=total3+marks1[k];
			System.out.println("total marks is:"+total3);
			average3=total3/3;
			System.out.println("Average is:"+average3);
			
	    	
			}
	for(int l=0;l<3;l++){
	marks4[l]=marks1[l]+marks2[l]+marks3[l];
	System.out.println("total in individual marks:"+marks4[l]);
	average=marks4[l]/3;
	System.out.println("average in individual marks"+average);
	}
	}
}
