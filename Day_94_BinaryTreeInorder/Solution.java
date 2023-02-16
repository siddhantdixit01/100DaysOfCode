/*
Example 1:

Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:

Input: root = []
Output: []

Example 3:

Input: root = [1]
Output: [1]
Code
*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack <TreeNode> st = new Stack<>();
        List <Integer> arr=new ArrayList<>();
        if(root == null)  
            return arr;
        TreeNode temp=root;
        while(temp !=null || !st.isEmpty()){
            while(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            temp=st.pop();
            arr.add(temp.val);
            temp=temp.right;
        }
        return arr;
    }
}
