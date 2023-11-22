package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * じゃんけんゲーム step05
 * 勝敗処理をメソッドに分離する
 * 
 */
public class JankenStep05 {
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

        // 勝敗判定
        // player_handとcomputer_handをもとに勝敗を判定
        // 結果は0:あいこ,1:プレイヤーの勝ち,2:プレイヤーの負け -1:異常値
        int result = judge(player_hand, computer_hand);

        //
        // 出力
        //
        String[] hands = { "グー", "チョキ", "パー" };
        String[] results = { "あいこ", "あなたの勝ち", "あなたの負け" };

        if (result >= 0) {
            System.out.println("あなたの手: " + hands[player_hand]);
            System.out.println("コンピューターの手: " + hands[computer_hand]);
            System.out.println(results[result]);
        } else {
            System.out.println("0,1,2のいずれかで入力してください");
        }

        // test_judge(); 勝敗判定のテスト
    }

    /**
     * 勝敗判定
     * 
     * @param player_hand   プレイヤーの手 0:グー,1:チョキ,2:パー
     * @param opponent_hand 対戦相手の手 0:グー,1:チョキ,2:パー
     * @return 0:あいこ,1:プレイヤーの勝ち,2:プレイヤーの負け,-1: エラー
     */
    public static int judge(int player_hand, int opponent_hand) {
        // 入力値のチェック
        int result = 0;
        if (0 <= player_hand && player_hand <= 2 && 0 <= opponent_hand && opponent_hand <= 2) {
            // 勝敗判定
            // player_handとopponent_handをもとに勝敗を判定
            // 結果は0:あいこ,1:プレイヤーの勝ち,2:プレイヤーの負け -1: 異常値

            if (player_hand == opponent_hand) {
                result = 0; // あいこ
            } else if (player_hand == 0 && opponent_hand == 1) { // グー vs チョキ
                result = 1; // プレイヤーの勝ち
            } else if (player_hand == 1 && opponent_hand == 2) { // チョキ vs パー
                result = 1; // プレイヤーの勝ち
            } else if (player_hand == 2 && opponent_hand == 0) { // パー vs グー
                result = 1; // プレイヤーの勝ち
            } else if (player_hand == 0 && opponent_hand == 2) { // グー vs パー
                result = 2; // プレイヤーの負け
            } else if (player_hand == 1 && opponent_hand == 0) { // チョキ vs グー
                result = 2; // プレイヤーの負け
            } else if (player_hand == 2 && opponent_hand == 1) { // パー vs チョキ
                result = 2; // プレイヤーの負け
            } else {
                result = -1;
            }
        } else {
            result = -1;
        }
        return result;
    }

    /**
     * 勝敗判定のテスト
     */
    private static void test_judge() {
        // 勝敗判定関数のテスト
        // 入力値(引数)と結果(戻り値)の組合せが正しいかチェックする
        // 実行した結果何も表示されなければOK

        // あいこのテスト
        if (judge(0, 0) != 0) {
            System.out.println("0, 0, NG");
        }
        if (judge(1, 1) != 0) {
            System.out.println("1, 1, NG");
        }
        if (judge(2, 2) != 0) {
            System.out.println("2, 2, NG");
        }

        // プレイヤー勝ちのテスト
        if (judge(0, 1) != 1) {
            System.out.println("0, 1, NG");
        }
        if (judge(1, 2) != 1) {
            System.out.println("1, 2, NG");
        }
        if (judge(2, 0) != 1) {
            System.out.println("2, 0, NG");
        }

        // プレイヤー負けのテスト
        if (judge(0, 2) != 2) {
            System.out.println("0, 2, NG");
        }
        if (judge(1, 0) != 2) {
            System.out.println("1, 0, NG");
        }
        if (judge(2, 1) != 2) {
            System.out.println("2, 1, NG");
        }

        // 異常値のテスト
        if (judge(-1, 1) != -1) {
            System.out.println("-1, 1, NG");
        }
        if (judge(0, -1) != -1) {
            System.out.println("0, -1, NG");
        }
        if (judge(-1, -1) != -1) {
            System.out.println("-1, -1, NG");
        }
    }

}