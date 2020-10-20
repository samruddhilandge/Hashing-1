/**
 * 1. first check both strings have same length. If not return false
 * Here I took two hashmaps. One hashmao to store characters from string s as keys, while second hashmap
 * store characters of t as keys. When inserting we just check if the key is present. It not, then directly
 * push else, check the mapping i.e sChar == tChar at that position.
 * Time Complexity:  
 * Space complexity: O(1) since there are only 26 characters present which is a constant
 * Run on Leetcode: yes
 * Any difficulty while coding: no
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> sMap = new HashMap<Character, Character>();
        HashMap<Character, Character> tMap = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, tChar);
            }
            else{
                if(sMap.get(sChar) != tChar) return false;
            }
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar, sChar); 
            }
            else{
                if(tMap.get(tChar) != sChar) return false;
            }  
        }
        return true; 
    }
}