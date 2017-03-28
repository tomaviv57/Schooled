package net.ddns.mipster.schooled;

import android.app.Application;
import android.util.Log;


/**
 * Created by Chen on 25/02/2017.
 */

public class SchooledApplication extends Application {

    public static int FIRST_LINE = 0;

    public static final String ANNOUNCEMENT_DATA = "net.ddns.mipster.schooled.announcementData";
    public static final String SCHEDULE_DATA = "net.ddns.mipster.schooled.scheduleData";
    public static final String NOTE_DATA = "net.ddns.mipster.schooled.noteData";
    public static final String CLASSES_DATA = "net.ddns.mipster.schooled.classesData";
    public static final String SWITCH_DATA = "net.ddns.mipster.schooled.switchData";

    public static SQLiteHelper data;

    public SchooledApplication(){}

    @Override
    public void onCreate() {
        super.onCreate();

        data = new SQLiteHelper(getApplicationContext());
    }
}