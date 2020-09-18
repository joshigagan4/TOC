import java.util.*; 
class abc 
{ 
static boolean isParanthesisBalanced(String g) 
{ 
Deque<Character> stack=new ArrayDeque<Character>(); 
for (int i=0;i<g.length();i++)
{ 
char x=g.charAt(i); 
if (x=='(' || x=='[' || x=='{') 
{ 
stack.push(x); 
continue; 
} 
if(stack.isEmpty()) return false; 
switch(x)
{ 
case ')': 
stack.pop(); 
if (x=='{' || x=='[') 
return false; 
break; 
case '}': 
stack.pop(); 
if (x=='(' || x=='[') 
return false; 
break; 
case ']': 
stack.pop(); 
if (x=='(' || x=='{') 
return false; 
break; 
} 
} 
return (stack.isEmpty()); 
} 
public static void main(String gg[]) 
{ 
String s=gg[0]; 
if (isParanthesisBalanced(s)) System.out.println("Balanced"); 
else System.out.println("Not Balanced"); 
} 
} 