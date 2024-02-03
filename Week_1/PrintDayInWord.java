
public class PrintDayInWord { 
    
    public static String checkByIfElse(int dayNumber){
        if (dayNumber == 0) {
            return "Sunday";
        }else if (dayNumber == 1) {
            return "Monday";
        } else if (dayNumber == 2) {
            return "Tuesday";
        } else if (dayNumber == 3) {
            return "Wednesday";
        } else if (dayNumber == 4) {
            return "Thursday";
        } else if (dayNumber == 5) {
            return "Friday";
        } else if (dayNumber == 6) {
            return "Saturday";
        } else {
            return "OTHER";
        }
    }

    public static String checkSwitchCase(int dayNumber){
        switch (dayNumber) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            // ... Các trường hợp khác
            default:
                return "OTHER";
        }
    }


    public static void main(String[] args) {
        int dayNumber = 6; // Đặt giá trị của ”dayNumber” ở đây!
        System.out.println(String.format("Sử dụng IF-Else If-Else với dayNumber = %d thì là: %s ", dayNumber, checkByIfElse(dayNumber)));
        System.out.println(String.format("Sử dụng switch-case-default với dayNumber = %d thì là: %s ", dayNumber, checkSwitchCase(dayNumber)));
        // 
    }
}
