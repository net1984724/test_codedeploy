package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld implements RequestHandler<Map<String, Object>, Map<String, Object>> {

  /**
   * AWS Lambda のハンドラーメソッドです。
   *
   * @param input   入力データ
   * @param context AWS Lambda Context オブジェクト
   * @return 出力データ
   */
  @Override
  public Map<String, Object> handleRequest(Map<String, Object> input, Context context) {
    Map<String, Object> output = new HashMap<>();
    output.put("foo", "Hello, world");
    output.put("bar", "Goodbye, world");
    output.put("input", input); // 入力情報を見たいので出力に含める
    output.put("context", context); // コンテキスト情報を見たいので出力に含める
    return output;
  }
}