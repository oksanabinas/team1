package com.oksana.binas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.*;
import static java.lang.Float.*;

public class App 
{
    public static void main( String[] args ) throws IOException 
    {
		ArrayList<Song> songArrayList = readFileToArrayList("testfile.txt");
		//sort
		Collections.sort(songArrayList, new Comparator<Song>() {
		    public int compare(Song o1, Song o2) {
		    	return o1.getSurname().compareTo(o2.getSurname());
		    }
		});
		
		printParsedFile(songArrayList);
    }
    
    private static ArrayList<Song> readFileToArrayList(String fileToRead) throws FileNotFoundException {
		File file = new File(fileToRead);
	    ArrayList<Song> songs = new ArrayList<Song>();
	    Scanner in = new Scanner(file);
	    while (in.hasNextLine()) {
	    	String row = in.nextLine();
	    	List<String> rowList = Arrays.asList(row.split(","));
	    	Song song = new Song(rowList.get(0), rowList.get(1), parseFloat(rowList.get(2)));
	    	songs.add(song);
	    }
	    in.close();
	    
	    return songs;
	}
    
    public static void printParsedFile(ArrayList<Song> arrayListFromFile){
		for (Song song : arrayListFromFile){
			System.out.println(song.getSurname());
			System.out.println(song.getName());
			System.out.println(song.getDuration());
			System.out.println("---------------------");
		}
	}
}
