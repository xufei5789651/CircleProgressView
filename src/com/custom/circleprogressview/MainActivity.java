package com.custom.circleprogressview;


import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final CircleProgressView progressView = (CircleProgressView) findViewById(R.id.pro);
		progressView.setProgress(79);
	}

}
