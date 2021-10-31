//time complexity: O(n)
//space complexity: O(1)

public class Exercise {
    public int longestSubstringWithoutRepeating(String str){
        Set<Character> checker = new HashSet<>();
        int biggest = 0;
        
        for(int i = 0; i<str.length();i++){
            if(!checker.add(str.charAt(i))){
                if(biggest<checker.size())
                    biggest=checker.size();
                checker.clear();
            }else{
                if(biggest<checker.size())
                    biggest=checker.size();
            }
        }
        
       return biggest; 
    }
}
