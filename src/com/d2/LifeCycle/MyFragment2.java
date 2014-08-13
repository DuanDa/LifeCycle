package com.d2.LifeCycle;


import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Da on 2014/5/8.
 */
public class MyFragment2 extends Fragment
{
	private static final String TAG = MyFragment2.class.getSimpleName();
	private static final boolean DEBUG = true;

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
		Log.d(TAG, "---> onAttach");
		setRetainInstance(true);
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		Log.d(TAG, "---> onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		Log.d(TAG, "---> onCreateView");
		View view = inflater.inflate(R.layout.fragment2, container, false);
		return view;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState)
	{
		super.onViewCreated(view, savedInstanceState);
		Log.d(TAG, "---> onViewCreated");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState)
	{
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, "---> onActivityCreated");
	}


	@Override
	public void onStart()
	{
		super.onStart();
		Log.d(TAG, "---> onStart");
	}

	@Override
	public void onResume()
	{
		super.onResume();
		Log.d(TAG, "---> onResume");
	}

	@Override
	public void onPause()
	{
		super.onPause();
		Log.d(TAG, "---> onPause");
	}

	@Override
	public void onStop()
	{
		super.onStop();
		Log.d(TAG, "---> onStop");
	}

	@Override
	public void onDestroy()
	{
		super.onDestroy();
		Log.d(TAG, "---> onDestroy");
	}

	@Override
	public void onDestroyView()
	{
		super.onDestroyView();
		Log.d(TAG, "---> onDestroyView");
	}

	@Override
	public void onDetach()
	{
		super.onDetach();
		Log.d(TAG, "---> onDetach");
	}

	@Override
	public void onSaveInstanceState(Bundle outState)
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

	@Override
	public void onViewStateRestored(Bundle savedInstanceState)
	{
		super.onViewStateRestored(savedInstanceState);
		Log.d(TAG, "---> onViewStateRestored");
	}
}
