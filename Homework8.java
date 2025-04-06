import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class LoginSystem {
    public static void main(String[] args) {
        Map<String, String> userCredentials = new HashMap<>();
        userCredentials.put("myId", "myPass");
        userCredentials.put("myId2", "myPass2");
        userCredentials.put("myId3", "myPass3");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String inputId = sc.nextLine();

            if (!userCredentials.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password: ");
            String inputPassword = sc.nextLine();

            if (!userCredentials.get(inputId).equals(inputPassword)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }

    }
}
