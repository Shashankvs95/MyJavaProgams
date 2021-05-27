package com.technoelevate.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvRead 
{
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\java TY\\Demo\\src\\com\\technoelevate\\filehandling\\Csv_file.csv");
		BufferedReader br = new BufferedReader(fr);
		
		String line ="";
		
		while((line = br.readLine())!=null) {
			String count[] = line.split(",");
			System.out.println(count[0]+" "+count[1]+" "+count[2]+" "+count[3]);
		}
		br.close();
		fr.close();
		
	}
}
