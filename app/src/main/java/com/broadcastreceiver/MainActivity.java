package com.broadcastreceiver;

        import android.os.Bundle;
        import android.app.Activity;
        import android.view.Menu;
        import android.content.Intent;
        import android.view.View;

        import com.broadcastreceiver.R;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // broadcast a custom intent.
    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.tutorialspoint.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}