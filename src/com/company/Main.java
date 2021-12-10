package com.company;
import org.testng.annotations.Test;

import java.io.*;
import java.io.File;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception{

    }

    public void day4(){
        int[] Cards = new int[2500];

        File file = new File("E:\\Benutzer\\Desktop\\AOC\\AOC4\\Cards.txt");
        Scanner sc = new Scanner(file);

        int i =  0;
        while (sc.hasNextInt()){
            Cards[i] = sc.nextInt();
            i++;
        }

        //vielleicht bingoCard1.fill(Arrays.copyofRanage(Cards, 0, 24)
        int[] Card1 = Arrays.copyofRange(Cards, 0 , 24);
        BingoCard bingoCard1 = new BingoCard;
        bingoCard1.fill(Card1);
    }

    @Test
    public void day3() throws Exception {
        int l = 1000;
        ArrayList<String> oxyBits0 = new ArrayList<String>(l);
        File file = new File("E:\\Benutzer\\Desktop\\AOC\\AOC3.txt");
        Scanner sc = new Scanner(file);

        ArrayList<String> oxyBits1;
        oxyBits1 = criteriaBit(oxyBits0, 0);
        ArrayList<String> oxyBits2;
        oxyBits2 = criteriaBit(oxyBits1, 1);
        ArrayList<String> oxyBits3;
        oxyBits3 = criteriaBit(oxyBits2, 2);
        ArrayList<String> oxyBits4;
        oxyBits4 = criteriaBit(oxyBits3, 3);
        ArrayList<String> oxyBits5;
        oxyBits5 = criteriaBit(oxyBits4, 4);
        ArrayList<String> oxyBits6;
        oxyBits6 = criteriaBit(oxyBits5, 5);
        ArrayList<String> oxyBits7;
        oxyBits7 = criteriaBit(oxyBits6, 6);
        ArrayList<String> oxyBits8;
        oxyBits8 = criteriaBit(oxyBits7, 7);
        ArrayList<String> oxyBits9;
        oxyBits9 = criteriaBit(oxyBits8, 8);
        ArrayList<String> oxyBits10;
        oxyBits10 = criteriaBit(oxyBits9, 9);

        int i =  0;
        while (sc.hasNextLine()){
            oxyBits0.add(sc.nextLine());
            i++;
        }

        oxyBits1.addAll(criteriaBit(oxyBits0, 0));
        oxyBits2.addAll(criteriaBit(oxyBits1, 1));
        oxyBits3.addAll(criteriaBit(oxyBits2, 2));
        oxyBits4.addAll(criteriaBit(oxyBits3, 3));
        oxyBits5.addAll(criteriaBit(oxyBits4, 4));
        oxyBits6.addAll(criteriaBit(oxyBits5, 5));
        oxyBits7.addAll(criteriaBit(oxyBits6, 6));
        oxyBits8.addAll(criteriaBit(oxyBits7, 7));
        oxyBits9.addAll(criteriaBit(oxyBits8, 8));
        oxyBits10.addAll(criteriaBit(oxyBits9, 9));

        for(int j = 0; j < oxyBits9.size(); j++) {
            System.out.println(oxyBits9.get(j));
        }
        System.out.println(oxyBits9.size());
    }

    @Test
    public static void day2() throws Exception{
        File file = new File("E:\\Benutzer\\Desktop\\AOC\\AOC2.txt");
        Scanner sc = new Scanner(file);

        String[] positions = new String[1000];
        int hPos = 0;
        int depth = 0;
        int aim = 0;

        int i =  0;
        while (sc.hasNextLine()){
            positions[i] = sc.nextLine();
            i++;
        }

        for (String position : positions) {
            if (position.length() == 9) {
                hPos += Character.getNumericValue(position.charAt(8));
                depth += Character.getNumericValue(position.charAt(8)) * aim;
            } else if (position.length() == 6) {
                aim += Character.getNumericValue(position.charAt(5));
            } else if (position.length() == 4) {
                aim -= Character.getNumericValue(position.charAt(3));
            }
        }
        System.out.println(depth * hPos);
    }

    @Test
    public static void day1() throws Exception{
        File file = new File("E:\\Benutzer\\Desktop\\AOC\\AOC1.txt");
        Scanner sc = new Scanner(file);

        int[] heights = new int[2000];
        int i = 0;
        int count = 0;

        while (sc.hasNextLine()){
            heights[i] = Integer.parseInt(sc.nextLine());
            i++;
        }

        for (int j = 3; j < heights.length; j++) {
            int window1 = heights[j-1] + heights[j-2] + heights[j-3];
            int window2 = heights[j] + heights[j-1] + heights[j-2];
            if(window1 < window2){
                count++;
            }
        }
        System.out.println(count);
    }

    public ArrayList<String> criteriaBit(ArrayList<String> _arrLis, int s) throws Exception{
        File file = new File("E:\\Benutzer\\Desktop\\AOC\\AOC3.txt");
        Scanner sc = new Scanner(file);
        String returnVar = "0";
        int index = 0;
        ArrayList<String> arrLis;
        arrLis = _arrLis;


        int mcb = 0;
        ArrayList<String> arrLis2 = new ArrayList<>(arrLis.size());

        mcb = mostCommonAt(arrLis, s);

        for(int j = 0; j < arrLis.size(); j++){
            if(Character.getNumericValue(arrLis.get(j).charAt(s)) == mcb){
                arrLis2.add(arrLis.get(j));
            }
        }

        return arrLis2;
    }

    public int mostCommonAt(ArrayList<String> arrLis,int s) throws Exception{
        File file = new File("E:\\Benutzer\\Desktop\\AOC\\AOC3.txt");
        Scanner sc = new Scanner(file);

        // ArrayList<String> allBitNumbers = new ArrayList<>(1000);
        ArrayList<Integer> bitsAt = new ArrayList<>(1000);
        int count0 = 0;
        int count1 = 0;
        int returnVar = 0;


        for(int j = 0; j < arrLis.size(); j++){
            bitsAt.add(Character.getNumericValue(arrLis.get(j).charAt(s)));
        }

        for(int k = 0; k < bitsAt.size(); k++){
            if(bitsAt.get(k) == 0){
                count0++;
            }else if(bitsAt.get(k) == 1){
                count1++;
            }
        }

        if(count0 <= count1){
            returnVar = 0;
        }else if(count1 < count0){
            returnVar = 1;
        }

        return returnVar;
    }
}
