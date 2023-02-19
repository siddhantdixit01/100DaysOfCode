/*
Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

Code-
*/
class Solution{
public boolean isValid(String s) {
        if(s.length() % 2 !=0)
            return false;
        Stack <Character> st =new Stack();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else if(c==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else if(c=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }
            else if(c==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }
            else{
                return false;
            } 
        }
        return st.isEmpty();
    }
}
