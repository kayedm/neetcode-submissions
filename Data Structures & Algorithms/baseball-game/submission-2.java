class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for(String op : operations) {

            if(op.equals("+")) {
                int prev = stack.pop();
                int total = prev + stack.peek();
                stack.push(prev);
                stack.push(total);
            } else if(op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if(op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        for(int score : stack) {
            sum += score;
        }

        return sum;

    }
}