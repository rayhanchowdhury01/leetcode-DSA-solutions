class Solution {
			public boolean canMakeSubsequence(String str1, String str2) {
				if (str2.length() > str1.length()) return false;

				int n = str1.length();
				int m = str2.length();
				int x = 0, i = n - 1, j = m - 1;
				
				while (i >= 0 && j >= 0) {
					if (str2.charAt(j) == str1.charAt(i)) {
						x++; i--; j--;
					} else if (str2.charAt(j) == 'a' && str1.charAt(i) == 'z') {
						x++; i--; j--;
					} else if ((int) str1.charAt(i) - 'a' + 1 == (int) str2.charAt(j) - 'a') {
						x++; i--; j--;
					} else i--;
				}
				return x == str2.length();


			}
		}