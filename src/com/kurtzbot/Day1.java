package com.kurtzbot;

public class Day1 implements Solver{

	private final String input;

	public Day1(String input) {
		this.input = input;
	}

	@Override
	public void solve() {
		String[] parens = input.split("");
		int count = 0;
		int position = 1;
		for(String paren : parens){
			if(paren.equals("(")){
				count++;
			}
			else {
				count--;
			}

			if(count == -1){
				System.out.println(position);
			}
			position++;
		}
	}
}
