package com.picture.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	public static void write(String s) throws IOException {
		
		//Date Date = new Date();
		FileWriter fstream = new FileWriter("D:\\Florida Press Report\\Report_1.txt",true);
		BufferedWriter out = new BufferedWriter(fstream);
		out.write(s);
		out.close();
	}

}
