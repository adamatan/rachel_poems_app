package name.matan.rachel_apps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends Activity {
	protected static final long SPLASH_DELAY = 5000;
	@Override
	public void onCreate(Bundle savedInstanceData) {
		super.onCreate(savedInstanceData);
		setContentView(R.layout.activity_splash);
		
		Handler h = new Handler();
		
		Runnable r = new Runnable() {
			public void run() {
				Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
				startActivity(intent);
			}
		};
		
		h.postDelayed(r, SPLASH_DELAY);
	}
}
