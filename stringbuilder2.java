import java.util.*;
class stringbuilder2{
    public static void main (String []args){
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
  //insrt a string
        sb.insert(2 , 'n');
        System.out.println(sb);
//delete a string
        sb.delete(2 , 3);
        System.out.println(sb);
//delete a strin
        sb.delete(1,3);
        System.out.println(sb);
    }
}
