public class StudentDemo {
    static void main() {
        Student s1 = new  Student();
        s1.setStudentDetails(1,"Yuvraj",10,20,30);
        s1.calculateTotal();
        s1.displayStudentDetails();
    }
}

class Student{
    int rollNum;
    String studName;
    int mark1,mark2,mark3,totalMarks;
    void setStudentDetails(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    void calculateTotal() {
        this.totalMarks = mark1 + mark2 + mark3;
    }
    void displayStudentDetails(){
        System.out.println("Student Name: " + studName);
        System.out.println("Student Roll No: " + rollNum);
        System.out.println("Total Marks: " + totalMarks);
    }
}