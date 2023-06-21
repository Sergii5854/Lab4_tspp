package com.tspp.laba4.prototype;

import java.util.Objects;

public class ChessTheme {

  private String board;
  private String piece;

  public ChessTheme() {
  }

  public ChessTheme(ChessTheme target) {
    if (target != null) {
      this.board = target.board;
      this.piece = target.piece;
    }
  }

  public void setBoard(String board) {
    this.board = board;
  }

  public void setPiece(String piece) {
    this.piece = piece;
  }


  public ChessTheme clone() {
    return new ChessTheme(this);
  }

  @Override
  public String toString() {
    return "{" +
        "board='" + board + '\'' +
        ", piece='" + piece + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChessTheme that = (ChessTheme) o;
    return Objects.equals(board, that.board) && Objects.equals(piece, that.piece);
  }

  @Override
  public int hashCode() {
    return Objects.hash(board, piece);
  }
}
