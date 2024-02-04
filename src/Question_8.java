public class Question_8 {
//    given a string, calculate length of longest palindromic substring
    public static void main(String[] args) {
        String str = "abzzba";
        int long_palin_strlen = longestPalindromic(str);
        System.out.println("longest palindromic substring : "+long_palin_strlen);
    }
    static int longestPalindromic(String str){
        int ans = 1;
        for(int i=0;i<str.length();i++){
            ans = Math.max(ans,expand(str,i,i));
        }
        for(int i=0;i<str.length()-1;i++){
            ans = Math.max(ans,expand(str,i,i+1));
        }

        return ans;
    }
    static int expand(String str,int i,int j){
        while(i>=0 && j<str.length() && str.charAt(i)==str.charAt(j)){
            i--;
            j++;
        }
        i++;   //  because if condition is true then inc & dec. and next time condition work. so we go to the one step back to find length
        j--;
        return j-i+1;
    }
}
