package portofolio.app.com.myportofolio;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     Resources resources;

    String[] buttonsText;

    final int[] buttonIds={

            R.id.btn_spotify,
            R.id.btn_scores,
            R.id.btn_library,
            R.id.btn_buid,
            R.id.btn_reader,
            R.id.btn_capstone
    };

    private Button[] mButtons = new Button[buttonIds.length];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resources = getResources();


        for(int i = 0;i<mButtons.length;i++)
        {
            mButtons[i]=(Button)findViewById(buttonIds[i]);
            mButtons[i].setOnClickListener(this);
        }


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
    public void onClick(View view) {

        String message = "";
        switch(view.getId())
        {
            case R.id.btn_spotify:
                message = resources.getString(R.string.button_spotify);
                break;
            case R.id.btn_scores:
                message = resources.getString(R.string.button_scores);
                break;
            case R.id.btn_library:
                message = resources.getString(R.string.button_library);
                break;
            case R.id.btn_buid:
                message = resources.getString(R.string.button_build_it_bigger);
                break;
            case R.id.btn_reader:
                message = resources.getString(R.string.button_reader);
                break;
            case R.id.btn_capstone:
                message = resources.getString(R.string.button_capstone_app);
                break;

        }

        Toast.makeText(getApplicationContext(),"This button will launch "+message,Toast.LENGTH_LONG).show();

    }
}
