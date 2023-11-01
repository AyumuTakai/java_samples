package dice;

import java.util.Random;
import java.util.Scanner;

/*
 * 振る回数を指定でき、合計も表示するさいころ
 * 指定された回数、1から6までの整数をランダムに出力します
 * 最後に合計値を出力します。
 */
class Dice03 {
    public static void main(String args[]) {
        System.out.print("何回さいころを振りますか?整数で入力してください:");
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        int sum = 0;
        scanner.close();
        Random rand = new Random();
        for (int i = 0; i < times; i++) {
            // nextInt関数は0〜指定した数未満の整数を返すため、1から6の乱数を得るために+1する
            int num = rand.nextInt(6) + 1;
            System.out.println(num);
            sum += num;
        }
        System.out.println(times + "回さいころを振った合計は" + sum);
    }
}