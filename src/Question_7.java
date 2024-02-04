public class Question_7 {
//    given a string check, if a given substring is palindrome or not
    public static void main(String[] args) {
        String str = "malayalam";
        boolean is_palindrome = isPalindrome(str,0,str.length()-1);
        System.out.println("is string plaindrome : "+is_palindrome);
    }
    static boolean isPalindrome(String str,int i,int j){
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }

        }
        return true;
    }
}
