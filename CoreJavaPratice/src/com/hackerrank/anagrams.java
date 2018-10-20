package com.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class anagrams {
	 static boolean isAnagram(String a, String b) {
		 
		 int alength=a.length();
		 int blength=b.length();
		 
		 if(a.equals(b))
		 {
			 return true;
		 }
		 
		 if(alength!=blength)
		 {
			 return false;
		 }
		 
		 char[] chararray = null;
		 int frequency = 0;
		 		 
		 String firststring = a.toLowerCase();
		 String secondstring = b.toLowerCase();
		 
		 
		 
			HashMap<Character, Integer> amap = new HashMap<>();
			for (char ch : firststring.toCharArray()) {
				if (amap.containsKey(ch)) {
					int val = amap.get(ch);
					amap.put(ch, val + 1);
				} else {
					amap.put(ch, 1);
				}
			}
			
			HashMap<Character, Integer> bmap = new HashMap<>();
			for (char ch : secondstring.toCharArray()) {
				if (bmap.containsKey(ch)) {
					int val = bmap.get(ch);
					amap.put(ch, val + 1);
				} else {
					bmap.put(ch, 1);
				}
			}
			
			 Iterator it = amap.entrySet().iterator();
			    while (it.hasNext()) {
			        Map.Entry pair = (Map.Entry)it.next();
			        System.out.println(pair.getKey() + " = " + pair.getValue());
			        it.remove(); // avoids a ConcurrentModificationException
			    }
		 
		 
		 
		 
	        return true;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }

}
