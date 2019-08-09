package org.tensorflow.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Eric on 3/2/2018.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        Intent intent = new Intent(this, org.tensorflow.demo.ClassifierActivity.class);
        startActivity(intent);
        finish();
    }
}
