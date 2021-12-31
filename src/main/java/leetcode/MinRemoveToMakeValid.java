package leetcode;

import java.util.Stack;

public class MinRemoveToMakeValid {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for(int i=0; i<chars.length;i++){
            char c=chars[i];
            if(c=='('){
                stack.push(i);
            }
            else if(c==')' && stack.size()!=0){
                stack.pop();
            }
            else if(c==')') {
                chars[i]=' ';
            }
        }
        Object[] ch=stack.toArray();
        for(Object c:ch){
            Integer index=Integer.parseInt(c.toString());
            System.out.println(index);
            chars[index]=' ';
        }
        for(Character c:chars) {
            System.out.print(c.toString());
        }

        StringBuilder stringb = new StringBuilder();
        for (char c:chars) {
            if(c!=' '){
                stringb.append(c);
            }
        }

        return stringb.toString();
    }
}
