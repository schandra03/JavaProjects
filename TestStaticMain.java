class TestStaticMain {
    static String mountain = "Chocorua";
   
    static TestStaticMain favorite(){
        System.out.print("Mount ");
        return null;
    }
   
    public static void main(String[] args) {
        System.out.println(favorite().mountain);
    }
}