public class Question_5 {
//    Prefix String
//    for a given string, all substrings starting at index 0.
    public static void main(String[] args) {
        String str = "Rutvik";
        print_prefix(str);
    }
    static void print_prefix(String str){
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
