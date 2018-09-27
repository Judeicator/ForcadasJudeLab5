package jude.forcadas.com.forcadasjudelab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void Magic(View Virtual){
        Intent Shift, Designator;

        if(Virtual.getId() == R.id.ActivityButton2){
            Shift = new Intent(this, MainActivity.class);
            startActivity(Shift);
        }

        else if(Virtual.getId() == R.id.MapButton2){
            Shift = new Intent(Intent.ACTION_VIEW);
            Shift.setData(Uri.parse("geo:14.580303, 120.989094"));
            Designator = Intent.createChooser(Shift,"Designate Application");
            startActivity(Designator);
        }
    }

}
