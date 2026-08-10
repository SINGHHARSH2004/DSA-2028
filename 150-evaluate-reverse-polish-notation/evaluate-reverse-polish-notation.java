class Solution {
public int evalRPN(String[] tokens) {
Stack<Integer> stack= new Stack<>();


    for(int i=0;i<tokens.length;i++ ){

         if (tokens[i].matches("-?\\d+")) {
            stack.push(Integer.parseInt(tokens[i]));
        }

        else if(tokens[i].equals("+")){
            int a=stack.pop();
            int b=stack.pop();
            stack.push(a+b);
        }
         else if(tokens[i].equals("-")){
            int a=stack.pop();
            int b=stack.pop();
            stack.push(b-a);
        }
        else if(tokens[i].equals("*")){
            int a=stack.pop();
            int b=stack.pop();
            stack.push(a*b);
        }

        else{
             int a=stack.pop();
            int b=stack.pop();
            stack.push(b/a);
        }

    }
    return stack.peek();
}


}