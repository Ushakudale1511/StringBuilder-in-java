import java.util.*;
class stringbuilder{
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
  //char at index 0
        System.out.println(sb.charAt(3));

        //set char at index 
       sb.setCharAt(0 , 'u');
       System.out.println(sb);

    }
    }
