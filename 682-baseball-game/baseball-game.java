class Solution {
    public int calPoints(String[] op) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < op.length; i++) {

    
            if (op[i].matches("-?\\d+")) {
                stack.push(Integer.parseInt(op[i]));
            }

    
            else if (op[i].equals("C")) {
                stack.pop();
            }

        
            else if (op[i].equals("D")) {
                int j = stack.peek();
                stack.push(2 * j);
            }

            else if (op[i].equals("+")) {
                int a = stack.pop();
                int b = stack.peek();

                stack.push(a);
                stack.push(a + b);
            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}