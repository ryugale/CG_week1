class nullexception{
    public static void main(String[] args){
        nullexception obj = new nullexception();
        obj.getexception();
        obj.catchexception();
    }

    public void getexception(){
        String text = null;
        text.length();
    }

    public void catchexception(){
        try {
            String text = null;
        text.length();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    
}