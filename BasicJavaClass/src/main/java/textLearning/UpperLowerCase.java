package textLearning;

public class UpperLowerCase {

    public static void main(String[] args) {
//        String myText = "brown lazy dog jumps over fox ";
//        System.out.println(myText.toUpperCase());
//        System.out.println(myText.toLowerCase());
//
//        String myText2 = "";
//        System.out.println(myText2.isEmpty());
//        myText2 = " - ";
//        System.out.println(myText2.isEmpty());
//
//        String firstName = "   MOHAMMAD   ";
//        System.out.println( split(firstName));


        String firstWord = "apple";
        String secondWord = "apple";
        System.out.println(compareToIgnoreCase(firstWord,secondWord));

        //lets use String builder
        String task1 = "Learning QA, ";
        String task2 = "Learning JAVA";

        String finalString = new StringBuilder().append(task1).append(task2).toString();
        System.out.println(finalString);

        String finalString2 = new StringBuffer().append(task1).append(task2).toString();
        System.out.println(finalString2);
    }
    public static int compareToIgnoreCase(String text1, String text2){
        String lowerText1 = text1.toLowerCase();
        String lowerText2 = text2.toLowerCase();
        return lowerText1.compareTo(lowerText2);
    }

//    public static String split(String text){
//        return text.replace(" ","");
//    }


}
