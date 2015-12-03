package com.kurtzbot;

import java.util.HashSet;

public class Day3 implements Solver{

	String input;
	public Day3(String[] args) {
		this.input = args[0];
	}

	@Override
	public void solve() {
		HashSet<String> visited = new HashSet<>();
		visited.add("0,0");
		int x = 0;
		int y = 0;
		for(char direction : input.toCharArray()) {
			switch(direction){
				case '^': y--;
					break;
				case '>': x++;
					break;
				case 'v': y++;
					break;
				case '<': x--;
					break;
			}
			visited.add(x + "," + y);
		}
		System.out.println(visited.size());
	}
}
