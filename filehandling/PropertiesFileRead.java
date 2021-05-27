package com.technoelevate.filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileRead 
{
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\java TY\\Demo\\src\\com\\technoelevate\\filehandling\\db.properties");
		Properties p = new Properties();
		p.load(fr);
		String name = p.getProperty("db.name");
		String place = p.getProperty("db.place");
		String job = p.getProperty("db.job");
		String company = p.getProperty("db.company");
		
		System.out.println(name+"\n"+place+"\n"+job+"\n"+company);
		
	}
}
