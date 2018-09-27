package jude.forcadas.com.forcadasjudelab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent Magic = new Intent(this, JudeicatorCustomClass.class);
        startService(Magic);
    }

    public void Magic(View Virtual){
        Intent Shift, Designator;

        if(Virtual.getId() == R.id.ActivityButton1){
            Shift = new Intent(this, ActivityTwo.class);
            startActivity(Shift);
        }

        else if(Virtual.getId() == R.id.MapButton1){
            Shift = new Intent(Intent.ACTION_VIEW);
            Shift.setData(Uri.parse("geo:14.599499, 120.981275"));
            Designator = Intent.createChooser(Shift, "Designate Application");
            startActivity(Designator);
        }
    }
}
