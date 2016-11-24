package udacity.portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnPopularMovies = (Button) findViewById(R.id.popularmovies);
        final Button btnStockHawk = (Button) findViewById(R.id.stockHawk);
        final Button btnBuildItBigger = (Button) findViewById(R.id.buildIt);
        final Button btnAppMaterial = (Button) findViewById(R.id.makeYourAppMaterial);
        final Button btnGoUbi = (Button) findViewById(R.id.goUbi);
        final Button btnCapstone = (Button) findViewById(R.id.capstone);

        btnPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = btnPopularMovies.getText();
                click(v,text);
            }
        });

        btnStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = btnStockHawk.getText();
                click(v,text);
            }
        });

        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = btnBuildItBigger.getText();
                click(v,text);
            }
        });

        btnAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = btnAppMaterial.getText();
                click(v,text);
            }
        });

        btnGoUbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = btnGoUbi.getText();
                click(v,text);
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = btnCapstone.getText();
                click(v,text);
            }
        });
    }

    public void click (View view, CharSequence btText)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + btText + " Project";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
