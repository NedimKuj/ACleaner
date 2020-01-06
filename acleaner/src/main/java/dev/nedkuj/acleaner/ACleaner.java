package dev.nedkuj.acleaner;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class ACleaner {

    private Activity activity;
    private Context context;

    public ACleaner(Activity activity) {
        this.activity = activity;
    }

    public ACleaner(Activity activity, Context context) {
        this.activity = activity;
        this.context = context;
    }

    public void relaunchApp(){
        activity.finish();
        activity.startActivity(activity.getIntent());
    }

    public void relaunchAppWithMessage(String message){
        relaunchApp();
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
