package convert;

import java.util.Scanner;

/*
 * 🦡 たぬき暗号解読器
 * "たじゃたばた"を入力すると"じゃば"を出力する、
 * 子供のころに遊んだたぬき暗号を解読するプログラムです。
 */
public class TanukiDecrypt {
    public static void main(String[] args) {
        System.out.print("🦡 たぬき暗号文を入力してください:");
        Scanner scanner = new Scanner(System.in);
        String cipheText = scanner.nextLine();
        scanner.close();
        String plainText = cipheText.replaceAll("た", "");
        System.out.println(plainText);
    }
}
