public class DnaStrand {
  public static String makeComplement(String dna) {
    //Your code
    StringBuilder stb = new StringBuilder();
    for(int i=0;i<dna.length();i++){
      char c = dna.charAt(i);
      if(c == 'A'){
        stb.append('T');
      }
      if(c == 'T'){
        stb.append('A');
      }
      if(c == 'C'){
        stb.append('G');
      }
      if(c == 'G') {
        stb.append('C');
      }
    }
   return stb.toString(); 
  }
}
