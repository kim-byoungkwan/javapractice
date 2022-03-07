package Soohyuk_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = br.readLine();
			if(input.equals(".")) break;
			
			int size = input.length();
			Stack<Character> st = new Stack<>();
			boolean flag = true;
			
			for(int i=0; i<size; i++) {
				char cur = input.charAt(i);
				if(cur == '(' || cur == '[') st.add(cur);
				else if(cur == ')') {
					if(st.isEmpty() || st.pop() != '(') {
						System.out.println("no");
						flag=false;
						break;
					}
				}else if(cur == ']') {
					if(st.isEmpty() || st.pop() != '[') {
						System.out.println("no");
						flag=false;
						break;
					}
				}
			}
			
			if(flag && st.isEmpty()) System.out.println("yes");
			else if(flag && !st.isEmpty()) System.out.println("no");
		}
	}
}
