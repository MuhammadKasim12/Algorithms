public class LongestPalindromeString {
    public static void main(String[] args) {
        System.out.println(longestPalindromicString("sabbaa"));
    }

    private static String longestPalindromicString(String str) {
        if(str==null || str.length()<1){
            return null;
        }
        int subStringStartIndex=0;
        int subStringEndIndex=0;

        for(int i=0; i<str.length();i++ ){
            int len1=expandFromCenter(str, i, i); // ciric
            int len2 =expandFromCenter(str, i, i+1); // hannah
            int len = Math.max(len1, len2);


            if (len> (subStringEndIndex-subStringStartIndex)) {
                subStringStartIndex = i- ((len -1)/2);
                subStringEndIndex = i+ (len/2)+1;
            }
        }
        return str.substring(subStringStartIndex, subStringEndIndex);
    }

    private static int expandFromCenter(String str, int left, int right) {
        if(str==null || left> right){
            return 0;
        }

        while(left>0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        return right-left -1;
        /* After finding the matching characters in while loop
         on the either side the pointer is still in incremented to
          the right and decremented to the left
            Hence we need to subtract 1 from right-left
            */
    }

}
