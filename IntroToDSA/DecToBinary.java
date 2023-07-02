
class HelloWorld {
    public static void main(String[] args) {
        System. out. println(DtoB(100));
    }
    public static String DtoB(int num){
        String code = "";
        while(num>0){
              int remainder = num % 2;
              num=num/2;
              code+=remainder;
        }
        
        String revcode ="";
        char ch;
        for (int i=0; i<code.length(); i++){
        ch= code.charAt(i); //extracts each character
        revcode= ch+revcode; //adds each character in front of the existing string
      }
        
        return revcode;
    }
    
}
