package com.tspp.laba4.iterator;

import java.util.List;

public class IteratorMain {
  public static void main(String[] args) {
    Dir rootDir  = new Dir();
    rootDir.dirs = List.of(new Dir(), new Dir());
    rootDir.files = List.of(new File(), new File());
    FileIterator fileIterator = rootDir.getFileIterator();
    while (fileIterator.hasMore()) {
      File file = fileIterator.next();
      System.out.println(file.absolutePath);
    }
  }
}
