package com.kurtzbot;

import java.util.Arrays;
import java.util.Collections;

public class Day2 implements Solver{


	private final String[] args;

	public Day2(String[] args) {
		this.args = args;
	}

	@Override
	public void solve() {
		int totalWrappingPaper = 0;
		int totalRibbon = 0;
		for(String box : args) {
			String[] sidesStr = box.split("x");
			int[] sides = new int[3];
			sides[0] = Integer.parseInt(sidesStr[0]);
			sides[1] = Integer.parseInt(sidesStr[1]);
			sides[2] = Integer.parseInt(sidesStr[2]);
			Arrays.sort(sides);

			int face1 = sides[0] * sides[1];
			int face2 = sides[1] * sides[2];
			int face3 = sides[0] * sides[2];

			int smallestSide = sides[0];
			int smallestFace = sides[0] * 2 + sides[1] * 2;

			totalWrappingPaper += 2 * (face1 + face2 + face3) + smallestSide;
			totalRibbon += smallestFace + (sides[0] * sides[1] * sides[2]);
		}
		System.out.println("Total Wrapping Paper Needed: " + totalWrappingPaper);
		System.out.println("Total Ribbon Needed: " + totalRibbon);
	}
}
