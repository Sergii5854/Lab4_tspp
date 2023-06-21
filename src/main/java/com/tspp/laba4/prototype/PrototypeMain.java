package com.tspp.laba4.prototype;

public class PrototypeMain {
  public static void main(String[] args) {
    ChessTheme dark = new ChessTheme();
    dark.setBoard("Dark");
    dark.setPiece("Dark");

    ChessTheme white = new ChessTheme();
    white.setBoard("White");
    white.setPiece("White");

    ChessTheme anotherDark = dark.clone();

    ChessTheme blueWhite = white.clone();
    blueWhite.setBoard("Blue");

    System.out.println("Dark " + dark);
    System.out.println("Another Dark " + anotherDark);
    System.out.println("White " + white);
    System.out.println("Blue " + blueWhite);
  }
}
