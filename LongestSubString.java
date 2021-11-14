//time complexity: O(n)
//space complexity: O(1)

public class Exercise {
    public int longestSubstringWithoutRepeating(String str){
       Set<Character> checker = new HashSet<>();
        int biggest = 0;
        int start = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(checker.add(s.charAt(i))){
                if(checker.size()>biggest)
                    biggest = checker.size();
            }else{
                i--;
                checker.remove(s.charAt(start++));
            }
        }
        
        return biggest;
    }
}
