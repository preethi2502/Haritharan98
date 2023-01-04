package com.a.in;

import java.io.File;
import java.io.FileWriter;

public class FileCreation {

	public static void main(String[] args) {
//write data 
		try {
			File f = new File("C:\\Boys\\JavaExcel.xlxs");
			f.createNewFile();

			System.out.println("file data added ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
