public class Question_1 {
//    given a string s, every character is small or capital we have to toggle
    public static void main(String[] args) {
        String s ="aBcAFd";
        String toggled_str = toggleString(s);
        System.out.println("toggled str : "+toggled_str);
    }
    static String toggleString(String s){
        StringBuilder toggled_str = new StringBuilder(s);
        for(int i=0;i<toggled_str.length();i++){
            toggled_str.setCharAt(i, (char) (toggled_str.charAt(i) ^ 32));   // set atr ith index str.charAt(i) ^32. it's inbuilt function in StringBuilder
        }
        return toggled_str.toString();
    }
}
