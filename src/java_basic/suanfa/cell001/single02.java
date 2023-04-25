package java_basic.suanfa.cell001;

import org.junit.Test;

import java.util.Stack;

public class single02 {
    @Test
    public void method() {

        Stack<String> stack = new Stack<String>();
        stack.push("Test");

        String next = stack.pop();
    }
}
