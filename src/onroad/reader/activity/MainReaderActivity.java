package onroad.reader.activity;


import onroad.reader.utils.FileOpenerAsyncTask;
import zhang.archer.readerontheroad.R;
import zhang.archer.readerontheroad.R.layout;
import zhang.archer.readerontheroad.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainReaderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_reader);
        FileOpenerAsyncTask fileOpenAsyncTask = new FileOpenerAsyncTask();
        fileOpenAsyncTask.setPara((TextView)findViewById(R.id.text_view));
        fileOpenAsyncTask.execute();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_reader, menu);
        return true;
    }
    
}
