package omikuji;

import java.util.Random;

/*
 * 確率の異なるおみくじ その2
 * 大吉、中吉、小吉、凶をランダムに出力します
 * 確率を1パーセント単位で設定できます
 */
public class Omikuji03 {
    public static void main(String[] args) {
        Omikuji[] omikuji_list = {
                new Omikuji("大吉", 20),
                new Omikuji("中吉", 40),
                new Omikuji("小吉", 30),
                new Omikuji("凶", 10),
        };
        Random rand = new Random();
        int index = rand.nextInt(100) + 1;
        int rate_sum = 0;
        for (Omikuji omikuji : omikuji_list) {
            rate_sum += omikuji.rate;
            if (index <= rate_sum) {
                System.out.println(omikuji.name);
                break;
            }
        }
    }
}

class Omikuji {
    String name;
    int rate;

    public Omikuji(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }
}
