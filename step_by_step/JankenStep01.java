package step_by_step;

/**
 * じゃんけんゲーム step01
 * ランダムな要素や条件分岐などの処理はせず、まずは仮の表示で実行時のイメージを固める
 * 
 * どのような処理をするかをコメントで記述する
 * グー、チョキ、パーのような文字列ではなく、数字を選択させるのは、ぐー | グー | ぐ〜 | グ- のような表記ゆれを避けるため
 */
public class JankenStep01 {
    public static void main(String[] args) {
        //
        // 入力
        //
        System.out.println("じゃ〜んけ〜ん (0:グー,1:チョキ,2:パー):");

        //
        // 処理
        //

        // 入力値のチェック 未実装
        // コンピュータの手の選択 未実装
        // 勝敗判定 未実装

        //
        // 出力
        //
        System.out.println("あなたの手: グー");
        System.out.println("コンピューターの手: チョキ");
        System.out.println("あなたの勝ち");
    }

}