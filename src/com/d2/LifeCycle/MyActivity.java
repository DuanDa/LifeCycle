package com.d2.LifeCycle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

public class MyActivity extends FragmentActivity
{
	private static final String TAG = MyActivity.class.getSimpleName();
	private static final boolean DEBUG = true;
	private FrameLayout fl;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Log.d(TAG, "---> onCreate");

		fl = (FrameLayout) findViewById(R.id.fl_fragment_container);
		FragmentManager fragmentManager = getSupportFragmentManager();
		fragmentManager.beginTransaction().replace(R.id.fl_fragment_container, new MyFragment()).commit();
	}

	@Override
	protected void onRestart()
	{
		super.onRestart();
		Log.d(TAG, "---> onRestart");
	}

	@Override
	protected void onStart()
	{
		super.onStart();
		Log.d(TAG, "---> onStart");
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		Log.d(TAG, "---> onResume");
	}

	@Override
	protected void onPause()
	{
		super.onPause();
		Log.d(TAG, "---> onPause");
	}

	@Override
	protected void onStop()
	{
		super.onStop();
		Log.d(TAG, "---> onStop");
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		Log.d(TAG, "---> onDestroy");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState)
	{
		super.onSaveInstanceState(outState);
		Log.d(TAG, "---> onSaveInstanceState");
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig)
	{
		super.onConfigurationChanged(newConfig);
		Log.d(TAG, "---> onConfigurationChanged");
	}

	public void displayDialog(View view)
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Sample");
		builder.setMessage("Click me and see the changes in life cycle");
		builder.show();
	}
}
