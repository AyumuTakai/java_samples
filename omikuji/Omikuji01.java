package omikuji;

import java.util.Random;

/*
 * 均等な確率のおみくじ
 * 大吉、中吉、小吉、凶をランダムに出力します
 */
public class Omikuji01 {
    public static void main(String[] args) {
        String[] omikuji = { "大吉", "中吉", "小吉", "凶" };
        Random rand = new Random();
        System.out.println(omikuji[rand.nextInt(omikuji.length)]);
    }
}
