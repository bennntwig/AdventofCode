package com.company;

public class BingoCard {
    int[][] cardNumbers = new int[5][5];
    boolean[][] cardMarkers = new boolean[5][5];

    public void fill(int numbers[]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cardMarkers[i][j] = false;
            }
        }

        cardNumbers[0][0] = numbers[0];
        cardNumbers[0][1] = numbers[1];
        cardNumbers[0][2] = numbers[2];
        cardNumbers[0][3] = numbers[3];
        cardNumbers[0][4] = numbers[4];

        cardNumbers[1][0] = numbers[5];
        cardNumbers[1][1] = numbers[6];
        cardNumbers[1][2] = numbers[7];
        cardNumbers[1][3] = numbers[8];
        cardNumbers[1][4] = numbers[9];

        cardNumbers[2][0] = numbers[10];
        cardNumbers[2][1] = numbers[11];
        cardNumbers[2][2] = numbers[12];
        cardNumbers[2][3] = numbers[13];
        cardNumbers[2][4] = numbers[14];

        cardNumbers[3][0] = numbers[15];
        cardNumbers[3][1] = numbers[16];
        cardNumbers[3][2] = numbers[17];
        cardNumbers[3][3] = numbers[18];
        cardNumbers[3][4] = numbers[19];

        cardNumbers[4][0] = numbers[20];
        cardNumbers[4][1] = numbers[21];
        cardNumbers[4][2] = numbers[22];
        cardNumbers[4][3] = numbers[23];
        cardNumbers[4][4] = numbers[24];
    }


    public boolean hasBingo(){
        //Zeilen-Bingos
        if (cardMarkers[0][0] && cardMarkers[0][1] && cardMarkers[0][2] && cardMarkers[0][3] && cardMarkers[0][4]) {
            return true;
        } else if (cardMarkers[1][0] && cardMarkers[1][1] && cardMarkers[1][2] && cardMarkers[1][3] && cardMarkers[1][4]) {
            return true;
        } else if (cardMarkers[2][0] && cardMarkers[2][1] && cardMarkers[2][2] && cardMarkers[2][3] && cardMarkers[2][4]) {
            return true;
        } else if (cardMarkers[3][0] && cardMarkers[3][1] && cardMarkers[3][2] && cardMarkers[3][3] && cardMarkers[3][4]) {
            return true;
        } else if (cardMarkers[4][0] && cardMarkers[4][1] && cardMarkers[4][2] && cardMarkers[4][3] && cardMarkers[4][4]) {
            return true;
        }
        //Spalten-Bingos
        else if (cardMarkers[0][0] && cardMarkers[1][0] && cardMarkers[2][0] && cardMarkers[3][0] && cardMarkers[4][0]) {
            return true;
        } else if (cardMarkers[0][1] && cardMarkers[1][1] && cardMarkers[2][1] && cardMarkers[3][1] && cardMarkers[4][1]) {
            return true;
        } else if (cardMarkers[0][2] && cardMarkers[1][2] && cardMarkers[3][2] && cardMarkers[3][2] && cardMarkers[4][2]) {
            return true;
        } else if (cardMarkers[0][3] && cardMarkers[1][3] && cardMarkers[2][3] && cardMarkers[3][3] && cardMarkers[4][3]) {
            return true;
        } else if (cardMarkers[0][4] && cardMarkers[1][4] && cardMarkers[2][4] && cardMarkers[3][4] && cardMarkers[4][4]) {
            return true;
        }
        //Quer-Bingos
        else if (cardMarkers[0][0] && cardMarkers[1][1] && cardMarkers[2][2] && cardMarkers[3][3] && cardMarkers[4][4]) {
            return true;
        } else if (cardMarkers[0][4] && cardMarkers[1][3] && cardMarkers[2][2] && cardMarkers[3][1] && cardMarkers[4][0]) {
            return true;
        }
        return false;
    }

    public void markNumber(int b){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(cardNumbers[i][j] == b){
                    cardMarkers[i][j] = true;
                }
            }
        }
    }

    public void getBingoCard(){

    }


}

