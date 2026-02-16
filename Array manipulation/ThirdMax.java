class thirdMax {
    public static int thirdMax(int[] nums) {

        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (int num : nums) {

            // Skip duplicates
            if ((first != null && num==first) ||
                (second != null && num==second) ||
                (third != null && num==third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (second == null || num > second) {
                third = second;
                second = num;
            }
            else if (third == null || num > third) {
                third = num;
            }
        }

        return (third == null) ? first : third;
    }

    public static void main(String[] args) {
        int [] arr={2,2,3,1};
        System.out.println(thirdMax(arr));
    }
}
