package step_by_step;

/**
 * じゃんけんゲーム step02
 * 出力の切り替え処理を記述する
 * 
 * 開発初期の段階では、入力値やランダムな値などは使用せず仮の値で固定したほうが動作確認しやすい
 */
public class JankenStep02 {
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
        int result = 1; // プレイヤーが勝ったと仮定する resultの値を0,1,2と変更して実行し、表示を確認する

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