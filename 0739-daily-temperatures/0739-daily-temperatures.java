class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            result[i] = 0;
        }
        for(int i=1; i<temperatures.length; i++){
            if(temperatures[i-1] < temperatures[i]){
                result[i-1] = i - (i-1);
                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                    result[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
            }else{
                stack.push(i-1);
            }
        }
        return result;
    }
}