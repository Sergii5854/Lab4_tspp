package com.tspp.laba4.adapter;

public class LegacyDetectorAdapter implements Detector {
  private final LegacyDetector legacyDetector;

  public LegacyDetectorAdapter(LegacyDetector legacyDetector) {
    this.legacyDetector = legacyDetector;
  }

  @Override
  public int detect(String content) {
    double plagiarismPercentage = legacyDetector.detect(content);
    return (int) (plagiarismPercentage * 100);
  }
}
