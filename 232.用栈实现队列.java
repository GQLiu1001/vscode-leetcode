
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {

    private Stack<Integer> stackPush; // 用于入队的栈
    private Stack<Integer> stackPop;  // 用于出队的栈

    public MyQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    /**
     * 将元素 x 推到队列的末尾。
     * 直接将元素压入 stackPush 栈。
     * 时间复杂度：O(1)
     */
    public void push(int x) {
    
        stackPush.push(x);
    }

    /**
     * 从队列的开头移除并返回元素。
     * 如果 stackPop 为空，则将 stackPush 中的所有元素依次弹出并压入 stackPop 中，
     * 这样 stackPop 的栈顶元素就是队列的队首元素。
     * 然后从 stackPop 中弹出并返回元素。
     * 时间复杂度：均摊 O(1)，最坏情况 O(n) (当 stackPop 为空且需要转移所有元素时)
     */
    public int pop() {
        if (stackPop.isEmpty()) {
            // 将 stackPush 中的元素转移到 stackPop
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    /**
     * 返回队列开头的元素而不移除。
     * 与 pop 操作类似，如果 stackPop 为空，需要先将 stackPush 中的元素转移到 stackPop。
     * 然后返回 stackPop 的栈顶元素。
     * 时间复杂度：均摊 O(1)，最坏情况 O(n) (当 stackPop 为空且需要转移所有元素时)
     */
    public int peek() {
        if (stackPop.isEmpty()) {
            // 将 stackPush 中的元素转移到 stackPop
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    /**
     * 如果队列为空，返回 true；否则，返回 false。
     * 当 stackPush 和 stackPop 都为空时，队列才为空。
     * 时间复杂度：O(1)
     */
    public boolean empty() {
        return stackPush.isEmpty() && stackPop.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

// @lc code=end

