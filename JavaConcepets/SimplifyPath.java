package JavaConcepets;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {

        String s[] = path.split("/");

        StringBuilder sb = new StringBuilder();

        Stack<String> stack = new Stack<>();

        for(String str : s){
            if(str.equals("..")){
                if(!stack.isEmpty() && str.equals("..")){
                    stack.pop();
                }
            }else if(!str.equals("") && !str.equals(".")){

                stack.push(str);
            }
        }

        if(stack.isEmpty()) return "/";


        while(!stack.isEmpty()){
            sb.insert(0, stack.pop()).insert(0,"/");
        }
        return sb.toString();
    }
}
