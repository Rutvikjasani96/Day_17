public class Question_2 {
//    given a string, which contains any lower case character sort given string.
    public static void main(String[] args) {
        String str = "dabacdb";
        String sorted_str = sort_string(str);
        System.out.println("sorted string : "+sorted_str);
    }
    static String sort_string(String str){
        int[] cnt = new int[26];
        StringBuilder sorted_str = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int index = str.charAt(i) - 97;
            cnt[index]++;
        }
        for (int i=0;i<cnt.length;i++){
            for(int j=0;j<cnt[i];j++) {
                sorted_str.append((char) (i+97));   // Type casting of Char
            }
        }
        return sorted_str.toString();
    }
}
