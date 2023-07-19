package com.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Launch {

	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("mycon2.txt");
		f.write("raju".getBytes());

	}

}
