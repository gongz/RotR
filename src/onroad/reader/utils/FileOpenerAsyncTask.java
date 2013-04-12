package onroad.reader.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import android.os.AsyncTask;
import android.widget.TextView;

public class FileOpenerAsyncTask extends AsyncTask<Object, Object, Object> {
    private TextView tv;
    
    
    
    @Override
    protected Object doInBackground(Object... params) {
        try {
            StringBuilder text = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader(Utils.file));
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
            return text;
        } catch (IOException e) {
            // You'll need to add proper error handling here
        }
        
        return null;
    }
    
    @Override
    protected void onPostExecute(Object result) {
        if(tv!=null){
            tv.setText(result.toString());
        }
    }
    
    public void setPara (TextView tv){
        this.tv = tv;
    }
    
}
