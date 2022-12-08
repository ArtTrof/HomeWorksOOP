package Exception.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static boolean isThisDateValid(String dateToValidate, String dateFormat) {
        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(dateToValidate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Worker[] worker = new Worker[4];
        Scanner in = new Scanner(System.in);
        int[] seniority = new int[4];
        for (int i = 0; i < worker.length; i++) {
            String initial, pos, year;
            System.out.println("Input initials ");
            initial = in.nextLine();
            System.out.println("Input position ");
            pos = in.nextLine();
            System.out.println("Input year ");
            year = in.nextLine();
            isThisDateValid(year, "yyyy");
            worker[i] = new Worker(initial, pos, year);


            int yearNow = Calendar.getInstance().get(Calendar.YEAR);

            seniority[i] = yearNow - Integer.parseInt(year);
        }

        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i].toString());
            System.out.println("Staj :" + seniority[i]);

        }



    }
}
