import java.util.Scanner;
    public class student{
        public static void main(String[]args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number=");
            int num=scanner.nextInt();
            int[] marks=new int[num];
            int totalMarks=0;
            for(int i=0;i<num;i++)
            {
                System.out.println("enter marks for subject="+(i+1)+":");
                marks[i]=scanner.nextInt();
                totalMarks=totalMarks+marks[i];
            }
            double avgPercentage=(double)totalMarks/num;
            char grade;
            if(avgPercentage>=80)
            {
                grade='A';
            }
            else if(avgPercentage>=70)
            {
                grade='B';
            }
            else if(avgPercentage>=60)
            {
                grade='C';
            }
            else if(avgPercentage>=50)
            {
                grade='D';
            }
            else
            {
                grade='E';
            }
            System.out.println("Total marks="+totalMarks);
            System.out.println("Average Percentage="+avgPercentage);
            System.out.println("grade="+grade);
            scanner.close();
        }
        
    }