package com.concordia.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) {

		File file = new File("src/MyFile.txt");

		try {
			FileWriter fileWriter = new FileWriter(file);
			
			fileWriter.write("Let's see if it works");
			
			fileWriter.close();
			
			// Read
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
