package dev.nedkuj.acleaner;

import android.app.Activity;
import android.content.Context;

public class ACleaner {

    private Activity activity;
    private Context context;

    public ACleaner(Activity activity, Context context) {
        this.activity = activity;
        this.context = context;
    }

    public void relaunchApp(){
        activity.finish();
        activity.startActivity(activity.getIntent());
    }
}
