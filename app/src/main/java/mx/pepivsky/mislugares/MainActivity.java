package mx.pepivsky.mislugares;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapaI(View v){
        Intent i = new Intent(this,MapsActivity.class);
        startActivity(i);
    }

    public void irMapaC(View v){
        Intent i = new Intent(this,MapsActivityf.class);
        startActivity(i);
    }

    public void irMapaE(View v){
        Intent i = new Intent(this,MapsActivitye.class);
        startActivity(i);
    }

    public void irMapaP(View v){
        Intent i = new Intent(this,MapsActivityp.class);
        startActivity(i);
    }

}
