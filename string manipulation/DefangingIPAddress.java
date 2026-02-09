public class DefangingIPAddress {

    public static String defangIPaddr(String address) {
        StringBuilder sb =new StringBuilder();
        for(char c: address.toCharArray()){
            if(c=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="255.100.50.0";
        System.out.println(s);
        s=defangIPaddr(s);
        System.out.println(s);
    }
}

