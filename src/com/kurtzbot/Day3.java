package com.kurtzbot;

import java.util.HashSet;

public class Day3 implements Solver{

	String input;
	public Day3(String[] args) {
		this.input = args[0];
	}

	private class Mover {
		int x = 0;
		int y = 0;
	}

	@Override
	public void solve() {
		HashSet<String> visited = new HashSet<>();
		visited.add("0,0");
		Mover santa = new Mover();
		Mover robot = new Mover();
		char[] directions = input.toCharArray();
		for(int i = 0; i < directions.length; i += 2) {
			visited.add(newCoordinates(santa, directions[i]));
			visited.add(newCoordinates(robot, directions[i+1]));
		}
		System.out.println(visited.size());
	}

	public String newCoordinates(Mover mover, char direction) {
		switch(direction){
			case '^': mover.y--;
				break;
			case '>': mover.x++;
				break;
			case 'v': mover.y++;
				break;
			case '<': mover.x--;
				break;
		}
		return mover.x + "," + mover.y;
	}
}
