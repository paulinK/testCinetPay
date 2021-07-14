package com.cinetpay;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Nombre d'occurence");
		String[] st = {"le", "la", "lu"};
		try {
			System.out.println("Début : " + System.currentTimeMillis());
			System.out.println(rechercheOccurence( st, "le"));
			System.out.println("Fin   : " + System.currentTimeMillis());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Nombre de caractères dans un mot");
		try {
			System.out.println("Début : " + System.currentTimeMillis());
			System.out.println(occurenceLettre("anticonstitutionnellement"));
			System.out.println("Fin   : " + System.currentTimeMillis());
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	static ArrayList<String> occurenceLettre(String mot) throws Exception {
		ArrayList<String> st = new ArrayList<String>();
		
		char[] ch = new char[mot.length()];
		
		String str = "";
		
		
		
		List<Object> list = new ArrayList<Object>();
		for(Object val: mot.toCharArray()) {
		  if(!list.contains(val)) {
		    list.add(val);
		  }
		}
		list.toArray(new Object[0]);
		
		
		
		
		for (int i = 0; i < list.size(); i++) {
			str = "" + list.get(i) + rechercheOccurenceChar( mot.toCharArray(), mot.charAt(i));
			st.add(str);
			
           
        }

		return st;
	}
	
	
	
	static int rechercheOccurenceChar(char[] book, char mot)  throws Exception  {
		
		int nombre = -1;
		
		for(char st: book) {
			if (st == mot) {
				nombre++;
			}
		}
		
		if (nombre == -1) {
			return nombre;
		} else {
			return nombre + 1;
		}
		
		
	}
	
	
	/*
	static int rechercheOccurenceObject(Object[] book, Object mot) {
		
		System.out.println("Début : " + System.currentTimeMillis());
		int nombre = -1;
		
		
		
		for (int i= 0; i< book.length; i++ ) {
			if (mot.equals(book[i])) {
				nombre++;
			}
		}
		
		
		if (nombre == -1) {
			System.out.println("Fin   : " + System.currentTimeMillis());
			return nombre;
		} else {
			System.out.println("Fin   : " + System.currentTimeMillis());
			return nombre + 1;
		}
		
		
	}
	
	*/

	
	static int rechercheOccurence(String[] book, String mot)  throws Exception {
		
		
		int nombre = -1;
		
		for(String st: book) {
			if (st.equals(mot)) {
				nombre++;
			}
		}
		
		
		
		if (nombre == -1) {
			System.out.println("Fin   : " + System.currentTimeMillis());
			return nombre;
		} else {
			System.out.println("Fin   : " + System.currentTimeMillis());
			return nombre + 1;
		}
		
		
	}

}
