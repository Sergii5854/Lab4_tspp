package com.tspp.laba4.iterator;

import java.util.List;

public class Dir {
  List<Dir> dirs;
  List<File> files;

  public FileIterator getFileIterator() {
    return new FileIteratorImpl(this);
  }
}
