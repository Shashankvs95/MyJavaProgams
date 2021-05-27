package com.technoelevate.filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {

	public static void writeData() throws IOException {
		FileWriter fw = new FileWriter("E:\\java TY\\Demo\\src\\com\\technoelevate\\filehandling\\WriteData.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("EmpID : TY12345\n");
		bw.write("Name : Shashank\n");
		bw.write("Job : Software Developer\n");
		bw.write("Company : TechnoElevate\n");
		bw.write("Place : Banglore");
		
		fw.flush();
		bw.close();
		bw.close();
		System.out.println("Write Successful");
	}

	public static void readData() throws IOException {
		FileReader fr = new FileReader("E:\\java TY\\Demo\\src\\com\\technoelevate\\filehandling\\WriteData.txt");
		BufferedReader br = new BufferedReader(fr);

		String display;

		while ((display = br.readLine()) != null) {
			System.out.println(display);
		}

		br.close();
		fr.close();
		System.out.println("Read Successful");
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println();
			System.out.println("1.WriteData\n2.ReadData\n3.Exit");
			System.out.println("ENTER YOUR CHOICE");
			int ch = s.nextInt();
			System.out.println();
			switch (ch) {
			case 1:
				writeData();
				break;
			case 2:
				readData();
				break;
			case 3:
				b = false;
				System.out.println("Exit successful");
				break;
			default:
				System.out.println("invalid choice");
				break;
				
			}
		}
		
		
	}

}