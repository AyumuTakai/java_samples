package dice;
import java.util.Random;

/*
 * 単純なさいころ
 * 1から6までの整数をランダムに出力します
 */
class Dice01 {
    public static void main(String args[]) {
        Random rand = new Random();
        // nextInt関数は0〜指定した数未満の整数を返すため、1から6の乱数を得るために+1する
        System.out.println(rand.nextInt(6)+1);
    }
}