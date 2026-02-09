class ReverseVowel {
    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char[] arr=s.toCharArray();
        while(l<r){
            if(!isVowel(arr[l])){
                l++;
            }
            if(!isVowel(arr[r])){
                r--;
            }
            if(isVowel(arr[l])&&isVowel(arr[r])){
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        s=reverseVowels(s);
        System.out.println(s);
    }
}
    
