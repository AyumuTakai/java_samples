package omikuji;

import java.util.Random;

/*
 * 確率の異なるおみくじ その1
 * 大吉、中吉、小吉、凶をランダムに出力します
 * 中吉、小吉が出やすいおみくじです
 */
public class Omikuji02 {
    public static void main(String[] args) {
        String[] omikuji = { "大吉", "中吉", "中吉", "小吉", "小吉", "凶" };
        Random rand = new Random();
        System.out.println(omikuji[rand.nextInt(omikuji.length)]);
    }
}
