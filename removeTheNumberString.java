public class removeTheNumberString {
    public static void main(String[] args) {
        String str = "For1tunecl2oud3";
        String result = removeNumbers(str);
        System.out.println("String after removing numbers: " + result);
    }

    public static String removeNumbers(String str) {
        return str.replaceAll("[0-9]", "");
    }
}