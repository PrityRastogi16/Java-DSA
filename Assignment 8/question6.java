import java.util.*;
public class Assignment8 {
    public static List<Integer> findAnagrams(String s, String p) {
        int freq1[] = new int[26];
    int freq2[] = new int[26];
    List<Integer> ans = new ArrayList<>();
    
    if(s.length()<p.length()){
        return ans;
    }
        int start=0;
    int end=p.length();
    
    for(int i=0; i<p.length(); i++){
        freq1[s.charAt(i)-'a']++;
        freq2[p.charAt(i)-'a']++;
    }

    
    if(Arrays.equals(freq1,freq2))
        ans.add(start);
    
    while(end<s.length()){
        
        freq1[s.charAt(start)-'a']--;
        freq1[s.charAt(end)-'a']++;
        
        if(Arrays.equals(freq1,freq2))
        ans.add(start+1);
        
        start++;
        end++;
    }
  return ans;  
        }
    
    
        public static void main(String[] args) {
       String s ="bcadefghicabhjcab";
       String p = "abc";
       List<Integer> indices = findAnagrams(s, p);
        System.out.println(indices);
           
        }
    }