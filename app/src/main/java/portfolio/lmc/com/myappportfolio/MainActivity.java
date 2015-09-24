package portfolio.lmc.com.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyButton= (Button)findViewById(R.id.button_spotify);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(getApplicationContext(), "This button will launch spotify app");
            }
        });

        Button scoreButton= (Button)findViewById(R.id.button_score);
        scoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(getApplicationContext(), "This button will launch score app");
            }
        });
        Button libraryButton= (Button)findViewById(R.id.button_library);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(getApplicationContext(),"This button will launch library app");
            }
        });
        Button buildBiggerButton= (Button)findViewById(R.id.button_build_bigger);
        buildBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(getApplicationContext(),"This button will launch buildBigger app");
            }
        });
        Button xyzReaderButton= (Button)findViewById(R.id.button_xyz_reader);
        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(getApplicationContext(),"This button will launch  xyzReader app");
            }
        });
        Button capstoneButton= (Button)findViewById(R.id.button_capstone);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(getApplicationContext(),"This button will launch  capstone app");
            }
        });








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showToast(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
