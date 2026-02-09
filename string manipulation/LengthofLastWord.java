public class LengthofLastWord{
  public static void main() {
    String s="Hello World";
    int i = s.length() - 1;
    int length = 0;


    // Step 1: Skip trailing spaces or use trim fn [s=s.trim()]
    while (i >= 0 && s.charAt(i) == ' ') {
        i--;
    }

    // Step 2: Count last word characters
    while (i >= 0 && s.charAt(i) != ' ') {
        length++;
        i--;
    }

    System.out.println("The len of last word : "+length);
}
}

