package fionaflores.com.fionis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCategoriauno;
    private Button btnCategoriados;
    private Button btnCategoriatres;
    private Button btnCategoriacuatro;

    @Override
    protected void onCreate(Bundle stanceState) {
        super.onCreate(stanceState);
        setContentView(R.layout.activity_menu);
        btnCategoriauno= (Button)findViewById(R.id.button_categoriauno);
        btnCategoriados= (Button)findViewById(R.id.button_categoriados);
        btnCategoriatres= (Button)findViewById(R.id.button_categoriatres);
        btnCategoriacuatro= (Button)findViewById(R.id.button_categoriacuatro);

        btnCategoriauno.setOnClickListener(this);
        btnCategoriados.setOnClickListener(this);
        btnCategoriatres.setOnClickListener(this);
        btnCategoriacuatro.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.button_categoriauno:
                Toast.makeText(this, "Este SERÍA MI PRIMER BOTÓN", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_categoriados:
                Toast.makeText(this, "Y este el segundo", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_categoriatres:
                Toast.makeText(this, "Y el tercero", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_categoriacuatro:
                Toast.makeText(this, "Y el bebé", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}

