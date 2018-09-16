package NanshuPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	static String findWinner(int[] andrea, int[] maria, String s) {
		int len = andrea.length;

		ArrayList<Integer> ResultListAndrea = new ArrayList<Integer>();

		ArrayList<Integer> ResultListMaria = new ArrayList<Integer>();
		
		String winner="";

		int resultAndrea = 0;

		int resultMaria = 0;

		switch (s) {
		case "even": {

			ArrayList<Integer> getSet = new ArrayList<Integer>();

			getSet = findSetsforeven(len);

			for (Integer i : getSet) {

				ResultListAndrea.add(andrea[i] - maria[i]);

				ResultListMaria.add(maria[i] - andrea[i]);

			}

			for (Integer j : ResultListAndrea) {

				resultAndrea = resultAndrea + ResultListAndrea.get(j);

				System.out.println(resultAndrea);
			}
			for (Integer j : ResultListMaria) {

				resultMaria = resultMaria + ResultListMaria.get(j);

				System.out.println(resultMaria);
			}
			
			if(resultAndrea>resultMaria){
				System.out.println("Andrea wins");
			winner="Andrea";
				return winner;
			}
			else{
				System.out.println("Maria wins");
				winner="Maria";
				return winner;
			}

		}

		case "odd": {
			ArrayList<Integer> getSet = new ArrayList<Integer>();

		getSet = findsetsforOdd(len);

		for (Integer i : getSet) {

			ResultListAndrea.add(andrea[i] - maria[i]);

			ResultListMaria.add(maria[i] - andrea[i]);

		}

		for (Integer j : ResultListAndrea) {

			resultAndrea = resultAndrea + ResultListAndrea.get(j);

			System.out.println(resultAndrea);
		}
		for (Integer j : ResultListMaria) {

			resultMaria = resultMaria + ResultListMaria.get(j);

			System.out.println(resultMaria);
		}
		
		if(resultAndrea>resultMaria){
			System.out.println("Andrea wins");
		winner="Andrea";
			return winner;
		}
		else{
			System.out.println("Maria wins");
			winner="Maria";
			return winner;
		}

		}

		}
		return null;

		

	}

	public static ArrayList<Integer> findSetsforeven(int len) {
		ArrayList<Integer> seteven = new ArrayList<Integer>();

		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {

				seteven.add(i);
			}

		}
		return seteven;

	}

	public static ArrayList<Integer> findsetsforOdd(int len) {

		ArrayList<Integer> setodd = new ArrayList<Integer>();

		for (int i = 0; i < len; i++) {
			if (i % 2 != 0) {

				setodd.add(i);
			}

		}
		return setodd;

	}

	public static void main(String[] args) {
 Solution s = new Solution();
 int[] andrea={1,2,3};
 int[] maria={3,5,8};
 
 String s1="odd";
 
 s.findWinner(andrea, maria, s1);
 
		

	}
}
