package jude.forcadas.com.forcadasjudelab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class JudeicatorCustomClass extends IntentService{
    public JudeicatorCustomClass() {
        super("JudeicatorCustomClass");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("JUDEICATOR CUSTOM", "JudeicatorCustomClass is now running in the background..!");
    }
}
