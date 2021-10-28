package unsplash.rubikamp.sanaebadi.info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin=findViewById(R.id.button_login);

        //this is clickListener for show toast

        buttonLogin.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "Horray, you made the first.", Toast.LENGTH_LONG).show());
    }
}