package nanodegree.zoheb.org.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button spotifyStreamerBtn;
    Button scoresAppBtn;
    Button libraryAppBtn;
    Button buildItBiggerBtn;
    Button baconReaderBtn;
    Button myCapStoneBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyStreamerBtn = (Button)findViewById(R.id.spotifyStreamer);
        scoresAppBtn = (Button)findViewById(R.id.scoresApp);
        libraryAppBtn = (Button)findViewById(R.id.libraryApp);
        buildItBiggerBtn = (Button)findViewById(R.id.buildItBigger);
        baconReaderBtn = (Button)findViewById(R.id.baconReader);
        myCapStoneBtn = (Button)findViewById(R.id.capStone);

        spotifyStreamerBtn.setOnClickListener(this);
        scoresAppBtn.setOnClickListener(this);
        libraryAppBtn.setOnClickListener(this);
        buildItBiggerBtn.setOnClickListener(this);
        baconReaderBtn.setOnClickListener(this);
        myCapStoneBtn.setOnClickListener(this);


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

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.spotifyStreamer:
                Toast.makeText(this, "This Button Will Launch Spotify Streamer", Toast.LENGTH_SHORT).show();
                break;

            case R.id.libraryApp:
                Toast.makeText(this, "This Button Will Launch Library App", Toast.LENGTH_SHORT).show();
                break;

            case R.id.scoresApp:
                Toast.makeText(this, "This Button Will Launch Scores App", Toast.LENGTH_SHORT).show();
                break;

            case R.id.buildItBigger:
                Toast.makeText(this, "This Button Will Launch Build it Bigger", Toast.LENGTH_SHORT).show();
                break;

            case R.id.baconReader:
                Toast.makeText(this, "This Button Will Launch Bacon Reader ", Toast.LENGTH_SHORT).show();
                break;

            case R.id.capStone:
                Toast.makeText(this, "This Button Will Launch Capstone App", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
