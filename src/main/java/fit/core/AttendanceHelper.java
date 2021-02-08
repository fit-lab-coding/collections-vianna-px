package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {
    public static Map<String, Boolean> random(int pupil, int percent) {
        Map<String, Boolean> attendanceList = new HashMap<>();

        int totalPresence = (int)Math.ceil(pupil * (percent/100.00));

        for(int i = 0; i < pupil; i++) {
            boolean present = i < totalPresence;
            attendanceList.put("" + i, present);
        }

        return attendanceList;
    }
}
