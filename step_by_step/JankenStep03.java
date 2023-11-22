package step_by_step;

/**
 * じゃんけんゲーム step03
 * 勝敗判定の処理を記述する
 * 
 * パターンを網羅するように記述を増やしていく
 * もっと良いプログラムの書き方が思い付くまでは力技でも正しい結果が出れば問題ない
 * 本来は不正な値の入力や異常値への対応もこの時点で実装するが今回は正常時の動作の作成を優先し、例外処理は後で実装する
 * 
 */
public class JankenStep03 {
    public static void main(String[] args) {
        //
        // 入力
        //
        System.out.println("じゃ〜んけ〜ん (0:グー,1:チョキ,2:パー):");
        int player_hand = 0; // グーが入力されたと仮定する 0,1,2と変更して実行し、表示を確認する

        //
        // 処理
        //

        // 入力値のチェック 未実装
        // コンピュータの手の選択
        int computer_hand = 1; // チョキが入力されたと仮定する 0,1,2と変更して実行し、表示を確認する

        // 勝敗判定
        // player_handとcomputer_handをもとに勝敗を判定
        // 結果は0:あいこ,1:プレイヤーの勝ち,2:プレイヤーの負け
        int result = 0;
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
        }

        //
        // 出力
        //
        String[] hands = { "グー", "チョキ", "パー" };
        String[] results = { "あいこ", "あなたの勝ち", "あなたの負け" };

        System.out.println("あなたの手: " + hands[player_hand]);
        System.out.println("コンピューターの手: " + hands[computer_hand]);
        System.out.println(results[result]);
    }

}