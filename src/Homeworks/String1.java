package Homeworks;

public class String1 {
    public static void main(String[] args) {

        /**JAVA - String Questions-1
         1- Given a string, return a new string made of 3 copies of the last 2 chars of
         the original string. The string length will be at least 2.
         Examples :
         "Clarusway" → "ayayay"
         "Florida" → "dadada"
         "Hi" → "HiHiHi"*/


        String name = "Clarusway";

        char[] letters = name.toCharArray();
        String twoLetters = name.substring(7);
        for (int i = 0; i < letters.length - 6; i++)
            System.out.print(twoLetters);
        System.out.println();

        String name1 = "Florida";
        char[] letter = name1.toCharArray();
        String twoLetters1 = name1.substring(5);
        for (int i = 0; i < letter.length - 4; i++)
            System.out.print(twoLetters1);
        System.out.println();

        String name3 = "Hi";
        char[] letter1 = name3.toCharArray();
        String twoLetters2 = name3.substring(0);
        for (int i = 0; i <= 2; i++)
            System.out.print(twoLetters2);
        System.out.println();

        System.out.println("=================");

        /**2- Given a string, return true if it’s ending with ‘a’.
         *  Otherwise return false. The string length will be at least 2.
         Examples :
         Apple –> false
         Canada –> true*/

        String str = "Apple";
        String str1 = "Canada";
        boolean var = str.endsWith("a");
        System.out.println(var);
        boolean var1 = str1.endsWith("a");
        System.out.println(var1);

        System.out.println("=================");

        /**3- Given a string, return the first index number of ‘a’. If there is no ‘a’ return -1.
         Examples :
         “Washington” → 1
         “New York” → -1
         “America” → 0*/


        String city = "New York";
        //char[] letters2 = city.toCharA();
        boolean a = false;
        for (int i = 0; i < city.length(); i++) {
            if (city.charAt(i) == 'a') {
                System.out.println(i);
                a = true;
            }

        }
        if (!a) {
            System.out.print(-1);
        }

        System.out.println();
        System.out.println("================");


        String city3="";
        city3= "America";
        System.out.println(city3.indexOf("s"));

        System.out.println("================");

        String city1 = "Washington";
        if (city1.contains("a"))
            System.out.println(city1.indexOf("a"));
        else {
            System.out.println(-1);
        }
        System.out.println();
        System.out.println("================");



        /**4- Given a string, replace all is with was.
         Examples :
         “My name is Rajendra.My name is lamror.My name is Technolamror." →
         “My name was Rajendra. My name was lamror. My name was Technolamror."*/

        String test = "My name is Rajendra. My name is lamror. My name is Technolamror. ";
        String result = test.replaceAll("is", "was");
        System.out.println(result);

        System.out.println("=================");

        /**5- Given a string, remove the spaces between words.
         Examples :
         “My name is Arthur. I am 20 years old.” →”MynameisArthur.Iam20yearsold.”*/

        String sentence = "My name is Arthur. I am 20 years old.";
        System.out.println(sentence.replaceAll(" ",""));

        //sentence = sentence.replaceAll("\\s+", "");
        //System.out.println(sentence);
        System.out.println("=================");

        /**6- Given a string, split it from ‘:’ and return the new string.
         If there is no ‘:’ return “There is no ‘:’ in the string”.
         Examples :
         “Name : Daniel” → “NameDaniel”
         “My name is Deniel” → “There is no ‘:’ in the string”*/


        String newStr = "Name : Daniel";
        String[] result1 = newStr.split(":");
        for (int i=0;i<= result1.length-1; i++){
            System.out.print(result1[i].trim());
        }

        System.out.println();

        String newStr1 = "My name is Deniel";
        for (int i=0; i<newStr1.length()-16; i++){
            if (newStr1.charAt(i)!=':')
                System.out.println("There is no ‘:’ in the string");

        }



        /**7- Given a string, return the new string after converting all char in string lower case.
         Examples :
         “New York City” → “new york city”*/
        String lowerCase = "New York City";
        System.out.println(lowerCase.toLowerCase());
        System.out.println("==============");


        /**8- Given a string, return the new string after converting all char in string UPPER case.
         Examples :
         “New York City” → “NEW YORK CITY”*/

        String upperCase = "New York City";
        System.out.println(upperCase.toUpperCase());
        System.out.println("=====================");

        /**9- Given a string, return the length of the string.
         Examples :
         “Clarusway SDET Course” → “The String length is 22”
         “New York” → The String length is 8”*/

        String sentence3 = "Clarusway SDET Course";
        System.out.println("The String length is " + sentence3.length());

        //int number = sentence3.length();
        //        System.out.println("The String length is " + number); // this is the other way.


        System.out.println("=====================");




        /**10- Given 3 or 4 strings, return the new string after concatenation.
         Examples :
         New
         York
         City
         → “New York City”
         My
         Name
         Is
         Alex
         → “My name is Alex”*/

        String word = "New ";
        String word2 = "York ";
        String word3 = "is ";
        String word4 = "A city";

        String strNew = word.concat(word2 + word3 + word4);
        System.out.println(strNew);


    }

}


