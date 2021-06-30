package com.bridgelabz.tictactoe;

public class TicTacToeGame {
	char board[]=new char[10];

	public void initialize() {
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public static void main(String[] args) {
		TicTacToeGame obj = new TicTacToeGame();
		obj.initialize();

	}

}