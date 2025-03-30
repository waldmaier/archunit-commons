package com.github.waldmaier;

public class HelloWorld {

  String getText() {
    return "Hello World";
  }

  public static void main(String[] args) {
    System.out.println(new HelloWorld().getText());
  }
}
