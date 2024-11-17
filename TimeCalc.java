public class TimeCalc {
    public static void main(String[] args) {
        //Total minutes = (10 hours * 60 minutes) + 30 minutes + 4055 minutes = 4685 minutes;
        //Total hours = 4685 / 60 = 78;
        //New hours = 78 % 24 = 6; // The remainder operator % is also known as modulo
        //New minutes = 4685 – (78 * 60) = 5;
        String h = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int originalHour = Integer.parseInt("" + h.charAt(0) + h.charAt(1));
        int originalMinutes = Integer.parseInt("" + h.charAt(3) + h.charAt(4));
        int totalMinutes = (originalHour * 60) + originalMinutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
          if(newHours < 10 && newMinutes < 10) {
            System.out.print("0" + newHours + ":0" + newMinutes);
          }
          else if(newHours < 10) {
            System.out.print("0" + newHours + ":" + newMinutes);
          }
          else if(newMinutes < 10) {
            System.out.print(newHours + ":0" + newMinutes);
          }
          else {
            System.out.print(newHours + ":" + newMinutes);
          }
        
    }
}
