import java.util.HashSet;
class JewelsnStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        int c=numJewelsInStones(jewels,stones);
        System.out.println(c);
    }
}