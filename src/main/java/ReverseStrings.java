public class ReverseStrings {

    public static void main(String[] args) {
        String s = "the sky is blue";
        char[] chars = reverseWords(s.toCharArray());

        StringBuffer sb= new StringBuffer();
        for(char c:chars) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

    public static char[] reverseWords(char[] chars) {
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, start, i-1);
                start =i+1;
            }
        }
        reverse(chars,start,chars.length-1);
        reverse(chars,0,chars.length-1);
        return chars;
    }

    private static void reverse(char[] chars, int start, int end) {
        char temp;
        while(start<end){
            temp=chars[start];
            chars[start++]=chars[end];
            chars[end--]=temp;
        }
    }
}
