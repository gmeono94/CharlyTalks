package fionaflores.com.fionis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnInicio;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInicio= (Button)findViewById(R.id.button_inicio);

        btnInicio.setOnClickListener(this);






    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.button_inicio:

                intent = new Intent(this, MenuActivity.class);
                startActivity(intent);





                break;

            default:

                break;

        }
    }
}
