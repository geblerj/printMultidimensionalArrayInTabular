package com.james;

class Main {
  public static void main(String[] args) {
    int[][] numbers = {{3, 3, 3}, {14, 14, 14}, {205, 205, 205}};
    for (int i = 0; i < numbers.length; i++) {
    	for (int j = 0; j < numbers[i].length; j++) {
    		System.out.print(String.format("%1$-" + 4 + "s", numbers[i][j] + " "));
    	}
    	System.out.println();
    }
  }
}
