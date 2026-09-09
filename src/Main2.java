public class Main2 {
    static void main() {
        Student s1 = new Student();
        s1.setStudentDetails(1,"Yuvraj",10,20,30);
        s1.calculateTotal();
        Student stud[] = new Student [5];
        stud[0]=s1;
        Student s2 = new Student();
        s2.setStudentDetails(2,"raj",20,30,40);
        s2.calculateTotal();
        stud[1] = s2;
        Student s3 = new Student();
        s3.setStudentDetails(3,"vraj",50,60,70);
        s3.calculateTotal();
        stud[2] = s3;
        Student s4 = new Student();
        s4.setStudentDetails(4,"viraj",70,80,90);
        s4.calculateTotal();
        stud[3] = s4;
        Student s5 = new Student();
        s5.setStudentDetails(5,"karanraj",80,90,100);
        s5.calculateTotal();
        stud[4] = s5;
        Student top3 [] = s1.getTop3(stud);
        for(int i = 0 ; i < top3.length ; i++){
            System.out.println(top3[i].studName);
        }
    }
}

