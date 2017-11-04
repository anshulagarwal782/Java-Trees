package local;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class tokenizer{
 	private String str;
 	private int num;
 	private LinkedList<Integer> number = new LinkedList<Integer>();
 	public tokenizer(String str) {
 		super();
 		this.str = str;
 	}
 	public int tokeniz() {
 			int l = str.length();
 			for(int i=0;i<l;i=i+3) {
 				char c = str.charAt(i);
 			num = Integer.parseInt(str.valueOf(c));
 			number.add(num);
 			}
 			return convert(number);
 	}
 	public int convert(LinkedList<Integer> num) {
			int l = num.size();
			int number = 0;
			for(int j=0;j<l;j++) {
				number = (int) (number + num.get(j)*Math.pow(10, l-j-1));
			}
			return number;
	}
}
public class Amazon_example {
	public static void main(String[]args) {
		 int test=3,i=0,num=0;
		 int arr[] = new int[10];
		 Scanner sc=new Scanner(System.in);
		 String s;
		 while(test!=0){
		 s=sc.nextLine();
		 tokenizer t=new tokenizer(s);
		 arr[i++]=t.tokeniz();
		 test--;
		 }
		 for(int k=0;k<arr.length;k++) {
			 num+=arr[k];
			 }
		 Stack<Integer> stack = new Stack<Integer>();
		 while(num!=0) {
		 stack.push(num%10);
		 num = num/10;
		 }
		 int l = stack.size();
		 for(int k=0;k<l-1;k++) {
			 System.out.print(""+stack.pop()+"->");
		 }
		 System.out.print(stack.pop());
	 }
}
