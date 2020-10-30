package com.morsstepan.uniyar;

import java.io.*;

/**
 * @author Rayron Victor
 * email: rayronvictor@gmail.com
 */
public class Main {

	public static void main(String[] args) {
		int numberOfNode = 10;
//		FilePathUtils filePathUtils = new FilePathUtils();
//		Graph graph = filePathUtils.readGraphFromFile("Taxicab_64.txt");
//		Graph graph = filePathUtils.readGraphFromFile("small.txt");
//		DisjointHamiltonianCycles h = new DisjointHamiltonianCycles(graph);
//		h.start();

		SimulatedAnnealing.simulateAnnealing(10, 1000, 0.9);
	}

}
