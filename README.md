# java_samples

Java 初級者向けのサンプルプログラム集

Python 版は[こちら](https://github.com/AyumuTakai/python_samples)

## プログラム開発の進め方 (/step_by_step)

じゃんけんゲームを例に、プログラム開発の際にどのような手順や考え方で設計し実装するのか、
段階的にプログラム実装する流れをまとめました。

人によって開発の流れ、順番や考え方は異なります。
この手順だけが正解のように扱わず、あくまで一つの例として扱ってください。

| ステップ | ファイル名                                                                                               | 概要                                                                                                                             |
| -------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| 01       | [JankenStep01.java](https://github.com/AyumuTakai/java_samples/blob/main/step_by_step/JankenStep01.java) | ランダムな要素や条件分岐などの処理はせず、まずは仮の表示で実行時のイメージを固める                                               |
| 02       | [JankenStep02.java](https://github.com/AyumuTakai/java_samples/blob/main/step_by_step/JankenStep02.java) | 出力の切り替え処理を記述する                                                                                                     |
| 03       | [JankenStep03.java](https://github.com/AyumuTakai/java_samples/blob/main/step_by_step/JankenStep03.java) | 勝敗判定の処理を記述する                                                                                                         |
| 04       | [JankenStep04.java](https://github.com/AyumuTakai/java_samples/blob/main/step_by_step/JankenStep04.java) | プレイヤーの手をキーボードから入力し、ランダムなコンピューターの手と勝負できるようにする。不正な値が入力された場合の対策を行なう |
| 05       | [JankenStep05.java](https://github.com/AyumuTakai/java_samples/blob/main/step_by_step/JankenStep05.java) | 勝敗判定を関数にまとめる                                                                                                         |

### プログラミングの前に

プログラムを何も考えずにいきなり書きだすことはできません。
プログラム言語の文法だけ覚えても実用的なプログラムを作ることは難しいでしょう。
明文化するかどうかは別として、プログラムを書き出すまえに要件定義や設計といった工程をおこなってプログラムの仕様を明確にします。

小さなプログラムを作成する際の設計の例を"[プログラムの設計.pdf](https://github.com/AyumuTakai/java_samples/blob/main/step_by_step/プログラムの設計.pdf)"にまとめてあります。
プログラム開発に慣れてくると頭の中だけで設計をある程度まとめられるようになります。

## 変換/暗号 (/convert)

| 難易度 | ファイル名                                                                                            | 概要             | キーワード      |
| ------ | ----------------------------------------------------------------------------------------------------- | ---------------- | --------------- |
| ☆      | [TanukiDecrypt.java](https://github.com/AyumuTakai/java_samples/blob/main/convert/TanukiDecrypt.java) | たぬき暗号解読器 | replace,Scanner |

## さいころ (/dice)

| 難易度 | ファイル名                                                                           | 概要                                        | キーワード         |
| ------ | ------------------------------------------------------------------------------------ | ------------------------------------------- | ------------------ |
| ☆      | [Dice01.java](https://github.com/AyumuTakai/java_samples/blob/main/dice/Dice01.java) | 単純なさいころ                              | Random             |
| ☆☆     | [Dice02.java](https://github.com/AyumuTakai/java_samples/blob/main/dice/Dice02.java) | 振る回数を指定できるさいころ                | Random,Scanner,for |
| ☆☆     | [Dice03.java](https://github.com/AyumuTakai/java_samples/blob/main/dice/Dice03.java) | 振る回数を指定でき,合計値も表示するさいころ | Random,Scanner,for |

## おみくじ (/omikuji)

| 難易度 | ファイル名                                                                                    | 概要                        | キーワード                          |
| ------ | --------------------------------------------------------------------------------------------- | --------------------------- | ----------------------------------- |
| ☆      | [Omikuji01.java](https://github.com/AyumuTakai/java_samples/blob/main/omikuji/Omikuji01.java) | 均等な確率のおみくじ        | Random,配列,length                  |
| ☆      | [Omikuji02.java](https://github.com/AyumuTakai/java_samples/blob/main/omikuji/Omikuji02.java) | 確率の異なるおみくじ その 1 | Random,配列,length                  |
| ☆☆☆    | [Omikuji03.java](https://github.com/AyumuTakai/java_samples/blob/main/omikuji/Omikuji03.java) | 確率の異なるおみくじ その 2 | Random,配列,クラス,foreach,if,break |
