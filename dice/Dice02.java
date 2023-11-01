package dice;
import java.util.Random;
import java.util.Scanner;

/*
 * 振る回数を指定できるさいころ
 * 指定された回数、1から6までの整数をランダムに出力します
 */
class Dice02 {
    public static void main(String args[]) {
        System.out.print("何回さいころを振りますか?整数で入力してください:");
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        scanner.close();
        Random rand = new Random();
        for(int i= 0;i < times;i++) {
            // nextInt関数は0〜指定した数未満の整数を返すため、1から6の乱数を得るために+1する
            System.out.println(rand.nextInt(6)+1);
        }
    }
}