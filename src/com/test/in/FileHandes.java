package com.test.in;

 
enum Week {
	sunday, wednesday, thursday
}

public class FileHandes {
//enum 
	public static void main(String[] args) {
		Week f = Week.sunday;
		System.out.println(f);

		for (Week w : Week.values()) {
			System.out.println(w);
		}
		
		
		
		
		
		
	}
}
