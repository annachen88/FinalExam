package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
static List<Food> list = new ArrayList<>();
static List<String> list2 = new ArrayList<>();
	public static void main(String[] args) {
try {
	FileReader read = new FileReader("menu.txt");
	BufferedReader in = new  BufferedReader (read);
	String line = in.readLine();
	while (line != null) {
		String[] line1 = line.split(",");
		list.add(new Food(Integer.parseInt(line1[0]), line1[1], Integer.parseInt(line1[2]),
				Integer.parseInt(line1[3])));
		//int number, String food, int price, int col
		line = in.readLine();
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
while(true){print();}

	}
public static void print(){
	
	int i=0;
	while(i<list.size()){
		System.out.println(list.get(i).getNumber()+")"+list.get(i).getFood());
		i++;
	}
	System.out.println("0) 結算");
	System.out.println("q) 離開(結束程式)");
	Scanner scanner = new Scanner(System.in);
	System.out.println("請輸入餐點:");
	String a = scanner.nextLine();
	System.out.println("請輸入數量:");
	int b = scanner.nextInt();
	i=0;
	boolean check=true;
	while(check){
	
	//new Integer(list.get(i).getNumber()).toString()
	if(Integer.parseInt(a)==list.get(i).getNumber()){
		//System.out.println("目前餐點:"+list.get(i).getFood()+b+"份");	
		//list.get(i).getPrice()*b
		list2.add(list.get(i).getFood()+b);
		System.out.println("目前餐點:");
		for(int j =0; j<list2.size();j++)
			System.out.println((j+1)+"."+" " +list2.get(j)+"份");
		check=false;
	}else{
		i=i+1;}
	}
	//list2.add(list.get(i).getFood()+b);
	System.out.println("=================");
	//for(int j =0; j<list2.size();j++)
	//System.out.println((j+1)+"."+" " +list2.get(j)+"份");
	
}}

