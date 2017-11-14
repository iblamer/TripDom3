package edu.itla.tripdom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Visualize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualize);
        TextView txtVisualizeName = findViewById(R.id.txtVisualizeName);
        Bundle parameter = getIntent().getExtras();
        txtVisualizeName.setText(parameter.getString("Nombre"));
    }
}
