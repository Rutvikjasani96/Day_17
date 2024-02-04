public class Question_4 {
//    given a char[](string), reverse word by word.
//    Note : between every word, there is a space.
//    no extra space, no in-built, no extra spaces at start & end
    public static void main(String[] args) {
        String sentence = "love hate data structures";
        String reverse_str = reverseWordByWord(sentence);
        System.out.println("reverse string : "+reverse_str);
    }
    static String reverseWordByWord(String sentence){
        String reverse_full_str = Question_3.reverseString(sentence,0,sentence.length()-1);
        int s = 0;
        int e = 0;
        while(e<reverse_full_str.length()){
            while (e < reverse_full_str.length() && reverse_full_str.charAt(e) != ' '){
                e++;
            }
            reverse_full_str = Question_3.reverseString(reverse_full_str,s,e-1);
            e++;
            s=e;
        }
        return reverse_full_str;
    }
}
