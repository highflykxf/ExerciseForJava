package exercise.java.json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface implements Comparator<Object>{

    public ComparatorInterface() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String service_time = "6:00:00,7:00:00,8:00:00,9:00:00,10:10:00,12:00:00,14:00:00,6:30:00,9:30:00";
        String[] time_array = service_time.split(",");
        List<String> time_list = Arrays.asList(time_array);
        Collections.sort(time_list, new ComparatorInterface());
        for(String time:time_list){
            System.out.println(time);
        }
    }

    @Override
    public int compare(Object arg0, Object arg1) {
        // TODO Auto-generated method stub
        String time_0 = (String) arg0;
        String time_1 = (String) arg1;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        int t0 = 0;
        int t1 = 0;
        try {
            t0 = (int) sdf.parse(time_0).getTime();
            t1 = (int) sdf.parse(time_1).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return t0 > t1 ? 1 : -1;
    }

}
