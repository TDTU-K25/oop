class Cau1{
	public static int maxEvenPos(int a[]) {
		//code here
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0 && a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static String lowercaseFirstLetter(String str){
		//code here
		String[] words = str.split(" ");
		String strAfterLowerCaseFirstLetter = "";
		for (String word : words) {
			String temp = "";
			temp += Character.toLowerCase(word.charAt(0)) + word.substring(1);
			strAfterLowerCaseFirstLetter += (temp + " ");
		}
		return strAfterLowerCaseFirstLetter.trim();
	} 
	
	public static void main(String[] args){		
		int a[] = {1,-2,3,1,-2,6};
		System.out.println(maxEvenPos(a));
		String s = "Khoa Cong nghe thong tin";
		System.out.println(lowercaseFirstLetter(s));
	}
}