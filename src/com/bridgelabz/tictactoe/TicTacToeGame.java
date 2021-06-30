package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	char board[] = new char[10];
	char player, computer;
	Scanner scan = new Scanner(System.in);

	public void initialize() {
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public void check() {
		System.out.println("Please Select Your Coice : 'X' or 'O' ");
		char choice = scan.next().charAt(0);
		switch (choice) {

		case 1:
			player = 'X';
			computer = 'O';
			break;
		case 2:
			player = 'O';
			computer = 'X';
			break;
		default:
			break;

		}

	}

	public static void main(String[] args) {

		TicTacToeGame obj = new TicTacToeGame();
		obj.initialize();
		obj.check();

	}

}