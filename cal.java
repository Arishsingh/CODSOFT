//STUDENT GRADE CALCULATOR
import java.util.*;
public class cal{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF SUBJECTS");
    int Subjects = sc.nextInt();
    int total = 0;
    for(int i=0;i<Subjects;i++){
int marks = sc.nextInt();//marks of subjects
total+= marks;
    }
    int Max = Subjects*100;

    double  avg =  total/(double)Subjects;
    String grade;
    if(avg>=90){
        grade ="A";
    }
    else if (avg >= 80){
        grade ="B";
    }
    else if(avg >= 70){
        grade ="C";
    }
    else if(avg >= 60){
        grade ="D";
    }
    else if(avg >= 50){
        grade ="E";
    }
    else if(avg >= 40){
        grade ="Grace";
    }
    else {
        grade ="F";
    }

System.out.println("total marks " +  total + " out of "+ Max);

System.out.println("average of the marks");
System.out.println(avg);
System.out.println(" grade of the student");
System.out.println(grade);


    }

}

