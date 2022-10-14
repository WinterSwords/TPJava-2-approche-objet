package TP_J5_6.listes;

import java.util.ArrayList;

public class CreationList {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		for(Integer i=0;i<100;i++) {
			list.add(i);
		}
		System.out.println(list.size());
	}
}