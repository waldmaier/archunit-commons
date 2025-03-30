package com.github.waldmaier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class HelloWorldTest {
  HelloWorld helloWorld;

  @BeforeEach
  void initialize() {
    helloWorld = new HelloWorld();
  }

  @Test
  void test() {
    assertThat(helloWorld.getText())
        .isEqualTo("Hello World");
  }
}
