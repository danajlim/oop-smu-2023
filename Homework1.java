import java.util.Scanner;

class Homework1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i=1;
        int sum=0;
        while (i<6){
            System.out.println("정수를 입력하세요: ");
            int a=sc.nextInt();
        sum=sum+a;
        System.out.printf("현재까지 입력된 정수의 합은 %d 입니다\n",sum);
        i++;}
    }

}