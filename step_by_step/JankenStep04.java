package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * じゃんけんゲーム step04
 * プレイヤーの手をキーボードから入力し、ランダムなコンピューターの手と勝負できるようにする
 * 不正な値が入力された場合の対策を行なう
 * 例外処理をおこなうか、条件分岐でおこなうかの使い分けが重要
 * 
 */
public class JankenStep04 {
    public static void main(String[] args) {
        //
        // 入力
        //
        InputStreamReader isr = new InputStreamReader(System.in);

        System.out.print("じゃ〜んけ〜ん (0:グー,1:チョキ,2:パー):");
        int player_hand = 0;
        try (BufferedReader br = new BufferedReader(isr)) {
            String player_hand_str = br.readLine();
            br.close();
            player_hand = Integer.parseInt(player_hand_str);
        } catch (IOException | NumberFormatException e) {
            player_hand = -1; // 整数に変換できない場合は-1
        }

        //
        // 処理
        //

        // コンピュータの手の選択
        Random random = new Random();
        int computer_hand = random.nextInt(3); // 0から2までの乱数を生成する

        // 入力値のチェック
        int result = 0;
        if (0 <= player_hand && player_hand <= 2 && 0 <= computer_hand && computer_hand <= 2) {
            // 勝敗判定
            // player_handとcomputer_handをもとに勝敗を判定
            // 結果は0:あいこ,1:プレイヤーの勝ち,2:プレイヤーの負け -1: 異常値

            if (player_hand == computer_hand) {
                result = 0; // あいこ
            } else if (player_hand == 0 && computer_hand == 1) { // グー vs チョキ
                result = 1; // プレイヤーの勝ち
            } else if (player_hand == 1 && computer_hand == 2) { // チョキ vs パー
                result = 1; // プレイヤーの勝ち
            } else if (player_hand == 2 && computer_hand == 0) { // パー vs グー
                result = 1; // プレイヤーの勝ち
            } else if (player_hand == 0 && computer_hand == 2) { // グー vs パー
                result = 2; // プレイヤーの負け
            } else if (player_hand == 1 && computer_hand == 0) { // チョキ vs グー
                result = 2; // プレイヤーの負け
            } else if (player_hand == 2 && computer_hand == 1) { // パー vs チョキ
                result = 2; // プレイヤーの負け
            } else {
                result = -1;
            }
        } else {
            result = -1;
        }

        //
        // 出力
        //
        String[] hands = { "グー", "チョキ", "パー" };
        String[] results = { "あいこ", "あなたの勝ち", "あなたの負け" };

        if (result > 0) {
            System.out.println("あなたの手: " + hands[player_hand]);
            System.out.println("コンピューターの手: " + hands[computer_hand]);
            System.out.println(results[result]);
        } else {
            System.out.println("0,1,2のいずれかで入力してください");
        }
    }

}