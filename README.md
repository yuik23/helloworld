# 第6回課題 このプロジェクトについて

## 概要

①Spring Boot を使用して Hello World を返す、シンプルな REST API を実装しています。

②練習のため２つのBranchを作成し、それぞれPRを作成しました。
１つ目のPRをMergeしたのち２つ目のPRをMergeした際にconflictになるのか、MAIN+PR1＋PR2になるのかいまいち理解できておらず試してみたいと思っています。
それぞれのBranchでは以下を実装しています。
- feature/hello-worldではHelloResponseクラスを用い、Getリクエスト(/responses)で  こんにちは を返す処理

- feature/greetingではMapを用い、Getリクエスト(/greetings)で挨拶を返す処理

## Hello World を返す（概要①）動作結果
以下を確認しました。
- ステータスコード200
- Hello World を返していること
<img width="645" alt="image" src="https://github.com/yuik23/helloworld/assets/121958929/ddd403e5-5e26-4376-944f-e9dc4051afff">

## 概要②）動作結果
PR２つがコンフリクトを起こしたため、feature/greetingをマージしたのちそのコードにfeature/hello-worldと同じ内容の処理を加えたfeature/responseを作成、マージしました。
