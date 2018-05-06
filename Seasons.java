public class Seasons {
   public static void main (String args[]) {
      for (int i = 1; i < 14; i++) {
         String month = "";
         System.out.print (i + " - ");
         switch (i) {
            case 1:
               month = "January";
               break;
            case 2:
               month = "February";
               break;
            case 3:
               month = "March";
               break;
            case 4:
               month = "April";
               break;
            case 5:
               month = "May";
               break;
            case 6:
               month = "June";
               break;
            case 7:
               month = "July";
               break;
            case 8:
               month = "August";
               break;
            case 9:
               month = "September";
               break;
            case 10:
               month = "October";
               break;
            case 11:
               month = "November";
               break;
            case 12:
               month = "December";
               break;
            default:
               System.out.println ("incorrect month number!");
         }
         System.out.print (month);
         switch (i){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               System.out.println (" contains 31 days");
               break;
            case 2:
               System.out.println (" contains 28 or 29 days");
               break;
            case 4:
            case 6:
            case 9:
            case 11:
               System.out.println (" contains 30 days");
               break;
         }
      }
   }
}