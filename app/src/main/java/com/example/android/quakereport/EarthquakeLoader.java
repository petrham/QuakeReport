package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;



public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String url;

    public static final String LOG_TAG = EarthquakeLoader.class.getName();

    public EarthquakeLoader(Context context, String url) {
        super(context);
        // TODO: Finish implementing this constructor
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG,"onStartLoading");
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // TODO: Implement this method
        Log.i(LOG_TAG,"loadInBackground");
        if (url == null) {
            return null;
        }

        List<Earthquake> result = QueryUtils.fetchEarthquakeData(url);
        return result;
    }
}