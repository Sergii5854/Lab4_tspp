package com.tspp.laba4.adapter;

public class AdapterMain {
  public static void main(String[] args) {
    Detector detector = new LegacyDetectorAdapter(new LegacyDetector());

    int plagiarismPercentage = detector.detect("Some content");

    System.out.println("Plagiarism percentage: " + plagiarismPercentage);
  }
}
