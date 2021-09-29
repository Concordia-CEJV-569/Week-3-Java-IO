package com.concordia.io;

import java.io.IOException;
import java.util.Iterator;

public class ReadInputs {

	public static void main(String[] args) throws IOException {
		byte data[] = new byte[10];

		System.out.println("Enter some characters: ");
		System.in.read(data);

		System.out.println("You enetered: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print((char) data[i]);
		}
	}

}
