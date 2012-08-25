package name.matan.rachel_apps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

public class PoemActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_activity);
        WebView wv = (WebView) findViewById(R.id.poemView);
        Bundle bundle = getIntent().getExtras();
        String documentName = bundle.getString(this.getString(R.string.poem_filename_key));
        wv.loadUrl("file:///android_asset/"+documentName);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
