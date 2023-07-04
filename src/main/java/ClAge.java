import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ClAge {

    public static void main(String[] args) {
        System.out.println(ageCalc(2006, 11, 23));
    }
    public static long ageCalc(int year, int month, int dayOfMonth){

        long age = 0;

        LocalDate date1 = LocalDate.of(year, month, dayOfMonth);
        LocalDate cur = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        String db = date1.format(formatter);
        String td = cur.format(formatter);

        String pattern = "MM-dd-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        try {
            Date ddb = sdf.parse(db);
            Date dtd = sdf.parse(td);

            long elapsedms = ddb.getTime() - dtd.getTime();
            long diff = TimeUnit.MINUTES.convert(elapsedms, TimeUnit.MILLISECONDS);

            age = -diff/526000;
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        return age;
    }
}