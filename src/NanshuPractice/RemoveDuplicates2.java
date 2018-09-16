package NanshuPractice;

public class RemoveDuplicates2 {
	public static String removeDuplicates(String word) {
		if (word == null || word.length() < 2) {
			return word;
		}
		int pos = 1;
		
		char[] characters = word.toCharArray();
		for (int i = 1; i < word.length(); i++) {
			int j;
			for (j = 0; j < pos; ++j) {
				System.out.println("value of j"+j+" Value of i "+i);
				System.out.println(characters[i]+" value of i and j in array "+characters[j]);
				if (characters[i] == characters[j]) {
					break;
				}
			}
			if (j == pos) {
				characters[pos] = characters[i];
				++pos;
				System.out.println(pos);
				System.out.println(characters[i]);
			} else {
				characters[pos] = 0;
				++pos;
				System.out.println("else loop"+pos);
				System.out.println("else loop"+characters[i]);
			}
		}
		return toUniqueString(characters);
	}

	public static String toUniqueString(char[] letters) {
		StringBuilder sb = new StringBuilder(letters.length);
		for (char c : letters) {
			if (c != 0) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}

	public static void main(String[] args) {
		
		RemoveDuplicates2 rd=new RemoveDuplicates2();
		rd.removeDuplicates("nanshu");
		
		// TODO Auto-generated method stub

	}

}
