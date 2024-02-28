import java.util.Scanner;
class student1{
    public 
        student1(){
            System.out.println("Hi! constructer has been created");
        }
        String fullName;
        int rollNum;
        double semPerentage;
        String collegeName;
        int collegeCode;
}
class student{
    public static void main(String[] args){
        Scanner op=new Scanner(System.in);
        student1 virat=new student1();
        System.out.println("Enter your name :");
        virat.fullName=op.next();
        System.out.println("Enter your rollnumber :");
        virat.rollNum=op.nextInt();
        System.out.println("Enter your sempercantage :");
        virat.semPerentage=op.nextInt();
        System.out.println("Enter your collegename :");
        virat.collegeName=op.next();
        System.out.println("Enter your collegecode :");
        virat.collegeCode=op.nextInt();
        System.out.println("Name : "+virat.fullName+"\nRoll number : "+virat.rollNum+"\nSempercentage : "+virat.semPerentage+"\nCollegename : "+virat.collegeName+"\nCollegecode : "+virat.collegeCode);

    }
}
