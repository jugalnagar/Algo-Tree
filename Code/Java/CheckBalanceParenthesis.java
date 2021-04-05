import java.util.*;

public class CheckBalanceParenthesis {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String parenthesis = scan.next();
		System.out.println(isBalanced(parenthesis));
	}
	
	public static boolean isBalanced(String parenthesis) {
		Stack<Character> stack = new Stack<>();

		for(int i=0;i<parenthesis.length();i++) {

			char currentParenthesis = parenthesis.charAt(i);

			if(currentParenthesis=='(') {
            			stack.push(currentParenthesis);
        		}
        		else if(currentParenthesis=='{')
        		{   
            			if(stack.isEmpty()||stack.peek()!='(')
                			stack.push(currentParenthesis);
            			else 
                			return false;
        		}
        		else if(currentParenthesis=='[')
        		{
            			if(stack.isEmpty() || (stack.peek()!='(' && stack.peek()!='{'))
                			stack.push(currentParenthesis);
            			else 
                			return false;
        		}
        		else if(currentParenthesis==')')
        		{
            			if(stack.isEmpty()||stack.peek()!='(')
                			return false;
            			else
            			{
                			stack.pop();    
            			}
            
        		}
        		else if(currentParenthesis=='}')
        		{
            			if(stack.isEmpty()||stack.peek()!='{')
                			return false;
            			else
            			{
                			stack.pop();    
            			}
        		}
        		else if(currentParenthesis==']')
        		{
            			if(stack.isEmpty()||stack.peek()!='[')
                			return false;
            			else
            			{
                			stack.pop();    
            			}
        		}
    
		}
		if(!stack.isEmpty())
        		return false;
		return true;
	}

}