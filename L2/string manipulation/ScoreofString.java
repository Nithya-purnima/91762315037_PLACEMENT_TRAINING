public class ScoreofString {
    public static int scoreOfString(String s) {
        int sum=0,j;
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            j=i+1;
            sum+=Math.abs(arr[i]-arr[j]);
        }
        return sum;
    }

    public static void main(String[] args) {
        String s="hello";
        int sum=scoreOfString(s);
        System.out.println(sum);
        
    }

        
}