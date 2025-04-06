import java.util.Scanner;

class MinMax{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //배열의 크기를 입력받을 정수 개수로 지정
        System.out.println("몇개의 수를 입력할 예정인가요? ");
        int num=sc.nextInt();
        int[] arr= new int[num];

        //정수를 입력받아 배열에 저장
        System.out.println("수를 입력하세요: ");
        for (int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }

        //최소값과 최대값을 저장할 두 변수의 값들을 배열의 0번째 요소로 초기화
        int min=arr[0];
        int max=arr[0];

        //최소값 구하기
        for (int j=0;j<num;j++) {
            if (min >= arr[j])
                min = arr[j];
        }

        //최대값 구하기
         for (int k=0;k<num;k++){
             if (max<=arr[k])
                 max=arr[k];

         }

        System.out.println("최대값: " +max);
        System.out.println("최소값: " +min);
    }
}