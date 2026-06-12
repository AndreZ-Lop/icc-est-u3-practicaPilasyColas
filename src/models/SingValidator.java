package models;

import java.util.Stack;

public class SingValidator {
    public boolean isValid(String signos){
        Stack<Character> pilaSigns = new Stack<>();
        for(char sign : signos.toCharArray()){
            if(sign == '(' || sign== '[' || sign == '{' ){
                pilaSigns.push(sign);
            }else if(sign == ')' || sign == ')' || sign == ')'){
                if (pilaSigns.isEmpty()) return false;
 
                char top = pilaSigns.pop();
                
                if((sign == ')' && top != '(') || (sign == ']' && top != '[') || (sign == '}' && top != '{')){
                    return false;
                }
            }
        }
        return pilaSigns.isEmpty();
    }

}
