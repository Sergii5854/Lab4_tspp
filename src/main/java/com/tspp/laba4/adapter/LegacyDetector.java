package com.tspp.laba4.adapter;

import java.util.Random;

public class LegacyDetector {
  // returns values from 0 to 1
  double detect(String content) {
    Random random = new Random();
    return random.nextDouble(1);
  }
}

