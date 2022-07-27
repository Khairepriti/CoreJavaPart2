package com.java.collection;

import java.util.EnumSet;

public class EnumGameDemo {
	enum Game{
		Cricket,Football,Tennis
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<Game> game1 = EnumSet.allOf(Game.class);
		System.out.println("Game Enumset : "+game1);
		EnumSet<Game> game2 = EnumSet.noneOf(Game.class);
		System.out.println("empty Enumset : "+game2);
		

	}

}
