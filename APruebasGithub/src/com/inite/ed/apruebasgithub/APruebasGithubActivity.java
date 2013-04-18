package com.inite.ed.apruebasgithub;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class APruebasGithubActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_apruebas_github);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.apruebas_github, menu);
		return true;
	}

}
