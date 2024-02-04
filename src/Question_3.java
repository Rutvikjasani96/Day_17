public class Question_3 {
//    given a string, reverse a part of string.
    public static void main(String[] args) {
        String str = "abdeagf";
        int start = 2;
        int end = 5;
        String reverced_string = reverseString(str,start,end);
        System.out.println("reverced string : "+reverced_string);
    }
    static String reverseString(String str,int start,int end){
        StringBuilder sb = new StringBuilder(str);
        while(start<end){
            swapCharacter(sb,start,end);
            start++;
            end--;
        }
        return sb.toString();
    }
    static void swapCharacter(StringBuilder str,int i,int j){
        char temp = str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);
    }
}
