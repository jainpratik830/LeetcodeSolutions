import java.util.Stack;

public class Min_Stack {

    class MinStack {

        Stack<Integer> stack;
        Stack<Integer> min;

        public MinStack() {
            stack=new Stack<>();
            min=new Stack<>();
        }

        public void push(int x) {
            if (stack.empty()){
                stack.push(x);
                min.push(x);
            }else {
                stack.push(x);
                int a=min.peek();
                if (a<=x){
                    min.push(a);
                }else {
                    min.push(x);
                }
            }
        }

        public void pop() {
            stack.pop();
            min.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }

}
