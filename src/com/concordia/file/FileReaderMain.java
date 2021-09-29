package com.concordia.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		File file = new File("src/data.txt");

		try {

			FileInputStream fileInputStream = new FileInputStream(file);
			System.out.println("Total size to read in bytes is: " + fileInputStream.available());

			int content;
			while ((content = fileInputStream.read()) != -1) {
				// convert to char and display
				System.out.print((char) content);
			}

		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}

}
