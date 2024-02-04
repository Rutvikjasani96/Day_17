public class Question_6 {
//    given n strings s1 & s2, calculate longest common prefix strings.
    public static void main(String[] args) {
        String[] strs = {"abc"};
        String common_str = longestCommonPrefix(strs);
        System.out.println("longest common prefix : "+common_str);
    }
    static String longestCommonPrefix(String[]  strs){
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int ans = Integer.MAX_VALUE;
        for(int i=1;i< strs.length;i++){
            String s1 = strs[i-1];
            String s2 = strs[i];
            int j = 0;
            int cnt = 0;
            while(j<s1.length() && j<s2.length()){
                if(s1.charAt(j)==s2.charAt(j)){
                    j++;
                    cnt++;
                }else{
                    break;
                }
            }
            ans = Math.min(ans,cnt);
        }
        return ans > 0 ? strs[0].substring(0,ans) : "";
    }
}
