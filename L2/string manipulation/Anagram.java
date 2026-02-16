public class Anagram {
    public static boolean isanagram(String s,String t){
         s = s.toLowerCase();
    t = t.toLowerCase();
    if (s.length() != t.length()) return false;

    int[] count = new int[26];

    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }

    for (int num : count) {
        if (num != 0) return false;
    }

    return true;
    }
    public static void main(String[] args) {
        String s1="Anagram";
        String s2="Nagaram";
        boolean ans=isanagram(s1,s2);
        if(ans){
            System.out.println("It is a valid anagram");
        }
        else{
            System.out.println("It is not a valid anagram");
        }
    }
}
