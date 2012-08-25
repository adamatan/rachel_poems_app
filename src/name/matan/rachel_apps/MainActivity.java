package name.matan.rachel_apps;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(this.getString(R.string.main_activity_title));
        
        
        Button showPoemButton = (Button) findViewById(R.id.show_poem_button);
        final Intent intent = new Intent(MainActivity.this, PoemActivity.class);
        final Bundle bundle = new Bundle();
        
        bundle.putString(this.getString(R.string.poem_filename_key) , "Rac016.html");
        intent.putExtras(bundle);
        showPoemButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(intent);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
