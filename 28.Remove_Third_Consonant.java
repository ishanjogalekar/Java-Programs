public class third_cons {
    public static void main(String[] args){
        String str = "asdfguihj";
        System.out.println(FindThirdLastConsonant(str));
    }
    //Method to find third consonant in string
    static Character FindThirdLastConsonant(String str){
        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(str);
        return (str.charAt(str.length() - 3));
    }
}
