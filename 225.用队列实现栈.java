
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {

    private Queue<Integer> queue1; // 主要队列
    private Queue<Integer> queue2; // 辅助队列

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /**
     * 将元素 x 压入栈顶。
     * 新元素总是加入到非空的队列中（如果两个都为空，选择 queue1）。
     * 然后将另一个队列的所有元素依次转移到这个队列的末尾，
     * 保证最后加入的元素在队列的前面，模拟栈顶。
     * 时间复杂度：O(n)，其中 n 是栈中元素的数量（因为可能需要移动另一个队列的所有元素）。
     */
    public void push(int x) {
        if (queue1.isEmpty()) {
            queue1.offer(x);
            while (!queue2.isEmpty()) {
                queue1.offer(queue2.poll());
            }
        } else {
            queue2.offer(x);
            while (!queue1.isEmpty()) {
                queue2.offer(queue1.poll());
            }
        }
    }

    /**
     * 移除并返回栈顶元素。
     * 由于 push 操作保证了栈顶元素在队列的前面，直接从非空队列的队首移除并返回即可。
     * 时间复杂度：O(1)。
     */
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        if (!queue1.isEmpty()) {
            return queue1.poll();
        } else {
            return queue2.poll();
        }
    }

    /**
     * 返回栈顶元素。
     * 同样，栈顶元素位于非空队列的队首，直接查看即可。
     * 时间复杂度：O(1)。
     */
    public int top() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        if (!queue1.isEmpty()) {
            return queue1.peek();
        } else {
            return queue2.peek();
        }
    }

    /**
     * 如果栈是空的，返回 true；否则，返回 false。
     * 当两个队列都为空时，栈为空。
     * 时间复杂度：O(1)。
     */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

