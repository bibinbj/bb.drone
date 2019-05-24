package com;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;

public class Base64ImageConverter {

	public static final String filePath="/Users/bibinbabyjohn/Downloads/The_Batman.jpg";
	public static final String outputFileName="/Users/bibinbabyjohn/Downloads/The_Batman2.jpg";
	
    public static void main(String args[]) throws IOException{
        byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
        String encodedString = Base64.getEncoder().encodeToString(fileContent);
        System.out.println(encodedString);
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        FileUtils.writeByteArrayToFile(new File(outputFileName), decodedBytes);
    }
}

