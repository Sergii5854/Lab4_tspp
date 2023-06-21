package com.tspp.laba4.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class FileIteratorImpl implements FileIterator{
  private Stack<Iterator<File>> stack;
  private File nextFile;

  public FileIteratorImpl(Dir rootDir) {
    stack = new Stack<>();
    stack.push(rootDir.files.iterator());
    findNextFile();
  }

  public boolean hasMore() {
    return nextFile != null;
  }

  public File next() {
    if (!hasMore()) {
      throw new NoSuchElementException();
    }
    File currentFile = nextFile;
    findNextFile();
    return currentFile;
  }

  private void findNextFile() {
    nextFile = null;

    while (!stack.isEmpty()) {
      Iterator<File> currentIterator = stack.peek();

      if (currentIterator.hasNext()) {
        File file = currentIterator.next();
        nextFile = file;
        break;
      } else {
        stack.pop();
      }
    }

    if (nextFile == null && !stack.isEmpty()) {
      Iterator<File> fileIterator = stack.pop();
      stack.push(fileIterator);
      findNextFile();
    }
  }
}
