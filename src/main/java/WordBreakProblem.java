import java.util.Arrays;
import java.util.List;

class WordBreakProblem {
    public static boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s)){
            return true;
        }

        for(int i=0; i<s.length(); i++){
            if(wordDict.contains(s.substring(0,i)) && wordBreak(s.substring(i),wordDict)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aaleetcodeaa";
        List wordDict = Arrays.asList(new String[] {"leet", "code","aa"});
        System.out.println(wordBreak(s,wordDict));
    }
}