package lab2.ex.impl;

import lab2.ex.Handler;

public class HandlerP implements Handler {

  @Override
  public boolean canHandel(String str) {
    return "p".equals(str);
  }

  @Override
  public String handle(int value) {
    return value % 2 == 0 ? "делится на 2" : "не делится на 2";
  }
}
