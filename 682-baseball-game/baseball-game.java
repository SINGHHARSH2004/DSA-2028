class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("+")) {
                int size = list.size();
                int sum = list.get(size - 1) + list.get(size - 2);
                list.add(sum);
            } 
            else if (op.equals("D")) {
                list.add(2 * list.get(list.size() - 1));
            } 
            else if (op.equals("C")) {
                list.remove(list.size() - 1);
            } 
            else {
                list.add(Integer.parseInt(op));
            }
        }
        int total = 0;
        for (int num : list) {
            total += num;
        }

        return total;
    }
}