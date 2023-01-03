class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack();
        String op="+-*/";
        for(String s:tokens)
        {
            if(op.contains(s)&&!st.isEmpty()){
              int op1=st.pop();
              int op2=st.pop();
              int ans=help(op2,s,op1);
              st.push(ans);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();

    }
    public int help(int op2,String s,int op1)
    {
        if(s.equals("+"))return op2+op1;
        else if(s.equals("-"))return op2-op1;
        else if(s.equals("/"))return op2/op1;
        return op2*op1;
    }
}