package com.Array;

public class Tictoc {
    public static void main(String[] args) {
        char[][] tt = {{'X','O','X'},{'O','X','O'},{'X','O','X'}};

        for(int i=0; i<tt.length; i++) {
            for(int j=0; j<tt[i].length; j++) {
                System.out.print(tt[i][j]+" ");
            }
            System.out.println();
        }
    }
}
