public class CheckPassFail { 
    
    public static String checkCondistionMark(int mark) {
        if (mark >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
    
    public static void main(String[] args) { 
        int mark = 49; 
        System.out.println(checkCondistionMark(mark));
        System.out.println("DONE");
    }
}
