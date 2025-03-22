public class Vowel {
    public static void main(String[] args) {
        String text="karun is ace";
        int count=0;
        int sum=0;
        String character = "";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
           if(ch!=' '){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    count=count+1;
                }
                else{
                    sum=sum+1;
                }
            }
            else{
                character="";
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }   
}