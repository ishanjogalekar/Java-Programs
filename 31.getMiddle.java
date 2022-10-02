class Kata {
  public static String getMiddle(String word) {
    //Code goes here!
    int len = word.length();
    int mid = len/2;
    if(len % 2 == 0){
      return (word.charAt(mid-1)+""+word.charAt(mid));
    }
    else{
      return String.valueOf((word.charAt(mid)));
    }
  }
}
