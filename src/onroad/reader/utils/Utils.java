package onroad.reader.utils;

import java.io.File;
import android.os.Environment;

public class Utils {
    public static File sdcard = Environment.getExternalStorageDirectory();
    public static File file = new File(sdcard,"file.txt");

}
