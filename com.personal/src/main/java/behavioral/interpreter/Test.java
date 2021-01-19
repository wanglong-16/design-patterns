package behavioral.interpreter;

import behavioral.interpreter.bean.Number;
import behavioral.interpreter.bean.Operator;

import java.util.Stack;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-16 11:31:37
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Test {

    public static void main(String[] args) {
        String ms = "二加四减五加七加一";
        String ms1 = "九减五加三减一";
        System.out.println(calculateString(ms1));
    }

    private static int calculateString(String string) {
        int result = 0;
        char [] characters = string.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < characters.length; i++) {
            char t = characters[i];
            if (t == '加' || t == '减') {
                Integer left = stack.pop();
                i ++;
                Integer right = new Number(characters[i]).interpret();
                stack.push(new Operator(left, right, t).interpret());
            } else {
                stack.push(new Number(t).interpret());
            }
        }
        return stack.pop();
    }
}
