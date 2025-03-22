public class trimmer {
    public static void main(String[] args) {
        String text="  Greatest of all time   ";
        int start=0;int end=text.length()-1;
         
        while(start<=end && text.charAt(start)==' '){
            start++;
        }
        while(end>=start && text.charAt(end)==' '){
            end--;
        }
        String character="";
        for(int i=start;i<=end;i++){
            character=character+text.charAt(i);
        }
        System.out.println(character);
    }   
}