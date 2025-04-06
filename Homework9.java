import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

class LoginSystem {
    public static void main(String[] args) {
        Map<String, String> userCredentials = new HashMap<>();
        try {
            Scanner fileScanner = new Scanner(new File(".idea/db.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\s+");
                if (parts.length == 2) {
                    userCredentials.put(parts[0], parts[1]);
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("db.txt를 찾을수 없습니다.");
            System.exit(1);
        }

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

        sc.close();
    }
}

