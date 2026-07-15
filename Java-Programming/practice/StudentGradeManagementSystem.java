import java.util.ArrayList;
import java.util.Scanner;


class Student {

    int id;
    String name;
    int mark1, mark2, mark3;


    public Student(int id, String name, int mark1, int mark2, int mark3) {

        this.id=id;
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }


    int total() {

        return mark1+mark2+mark3;
    }


    double average() {

        return total()/3.0;
    }


    String grade() {

        double avg=average();


        if(avg>=75)
            return "A";

        else if(avg>=65)
            return "B";

        else if(avg>=50)
            return "C";

        else if(avg>=35)
            return "D";

        else
            return "F";
    }


    void display() {

        System.out.println("\nID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Total: "+total());
        System.out.println("Average: "+average());
        System.out.println("Grade: "+grade());
    }
}



public class StudentGradeManagementSystem {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        ArrayList<Student> students=new ArrayList<>();


        while(true) {


            System.out.println("\n===== Grade Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Results");
            System.out.println("3. Highest Mark");
            System.out.println("4. Exit");


            int choice=sc.nextInt();



            switch(choice) {


                case 1:

                    System.out.print("ID: ");
                    int id=sc.nextInt();

                    sc.nextLine();

                    System.out.print("Name: ");
                    String name=sc.nextLine();


                    System.out.print("Subject 1: ");
                    int m1=sc.nextInt();

                    System.out.print("Subject 2: ");
                    int m2=sc.nextInt();

                    System.out.print("Subject 3: ");
                    int m3=sc.nextInt();


                    students.add(new Student(id,name,m1,m2,m3));

                    break;



                case 2:

                    for(Student s:students)
                        s.display();

                    break;



                case 3:

                    Student top=null;

                    for(Student s:students) {

                        if(top==null || s.total()>top.total())
                            top=s;
                    }


                    System.out.println("Highest Scorer:");
                    top.display();

                    break;



                case 4:

                    sc.close();
                    return;
            }
        }
    }
}