public class SecondDay {

    private static final String Palindrome_1 = "Kol Einu Sunie Lauk";
    private static final String Palindrome_2 = "Argi ten ne tigra";
    private static final String Palindrome_3 = "Sedek uzu kedes";





    public static void main (String[] arga) {

        String[] palindromeMas = {Palindrome_1, Palindrome_2, Palindrome_3};


        for (String p : palindromeMas) {
            if (isWordIsPalindrome(p.replaceAll("", ""))) {
                System.out.println("Polindromas");
            } else {
                System.out.println("Nepolindromas");
            }

        }
    }
          private static boolean isWordIsPalindrome(String word){
          boolean isPalindrome = true;
          for (int i = 0; i < word.length(); i++){
             char a = word.charAt(i);
             char b = word.charAt(word.length() -1 -i);

             if (a != b){
             isPalindrome = false;
             break;

            }
        }
        return isPalindrome;

    }
}
