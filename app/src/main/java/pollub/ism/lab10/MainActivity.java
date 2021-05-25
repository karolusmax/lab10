package pollub.ism.lab10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import pollub.ism.lab10.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding okno = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        okno = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(okno.getRoot());

        okno.pasekPostepu.setProgress(0);
        okno.pasekPostepu.setMax(100);
        okno.przycisk3.setEnabled(true);
        okno.przycisk4.setEnabled(false);
    }


    public void przycisk1(View view) {

    }

    public void przycisk2(View view) {

    }

    public void przycisk3(View view) {

    }

    public void przycisk4(View view) {

    }
}