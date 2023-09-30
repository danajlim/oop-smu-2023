import java.util.Scanner;
class Student{
    int student;
    String name;
    String major;
    int phone;
    void getMajor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        student = sc.nextInt();
        name = sc.next();
        major = sc.next();
        phone = sc.nextInt();
    }
    void setMajor(String d){
        String pp=Integer.toString(phone);
        String finalPhone=("0"+pp.substring(0,2)+"-"+pp.substring(2,6)+"-"+pp.substring(6));
        System.out.printf("%s번째 학생: %d %s %s %s\n",d,student,name,major,finalPhone);
    }
}

class Homework2{
    public static void main(String [] args){
        Student stu1= new Student();
        Student stu2= new Student();
        Student stu3= new Student();

        stu1.getMajor();
        stu2.getMajor();
        stu3.getMajor();

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        stu1.setMajor("첫");
        stu2.setMajor("두");
        stu3.setMajor("세");
    }
}