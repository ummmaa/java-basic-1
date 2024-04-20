import java.util.Scanner;

public class HowOldAreYou {
    private int age;

    public HowOldAreYou() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("あなたの年齢を入力してください");

            String ageStr = scanner.nextLine();

            if (ageStr.equals("e") || ageStr.equals(("q"))) {
                break;
            } else {
                age = Integer.valueOf(ageStr);

                if (age > 120) {
                    System.out.println("無効な数字です。");
                    continue;
                } else if (age < 0) {
                    System.out.println("無効な数字です。");
                    continue;
                }

                int birthYear = 2024 - age;

                if (birthYear >= 2019) {
                    birthYear -= 2018;
                    System.out.println("あなたの誕生年は令和" + birthYear + "年です");
                }

                else if (birthYear >= 1989 && birthYear < 2019) {
                    birthYear -= 1988;
                    System.out.println("あなたの誕生年は平成" + birthYear + "年です");
                }

                else if (birthYear >= 1926 && birthYear < 1989) {
                    birthYear -= 1925;
                    System.out.println("あなたの誕生年は昭和" + birthYear + "年です");
                }

                else if (birthYear >= 1912 && birthYear < 1926) {
                    birthYear -= 1911;
                    System.out.println("あなたの誕生年は大正" + birthYear + "年です");
                }

                else {
                    birthYear -= 1867;
                    System.out.println("あなたの誕生年は明治" + birthYear + "年です");
                }
            }
        }

        scanner.close();

    }

    public static void main(String args[]){
        HowOldAreYou hoay = new HowOldAreYou();
    }

}
