package example.code.starwarscharacterinfo.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import example.code.starwarscharacterinfo.R;
import example.code.starwarscharacterinfo.Utils.Utils;

public class CharacterDescriptionActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView heightTextView;
    private TextView weightTextView;
    private TextView createdTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_description);

        nameTextView = (TextView) findViewById(R.id.character_name);
        heightTextView = (TextView) findViewById(R.id.character_height);
        weightTextView = (TextView) findViewById(R.id.character_mass);
        createdTextView = (TextView) findViewById(R.id.record_creation_date);

        Intent intent = getIntent();

        String name = intent.getStringExtra(Utils.NAME);
        String height = intent.getStringExtra(Utils.HEIGHT);
        String weight = intent.getStringExtra(Utils.WEIGHT);
        String date = intent.getStringExtra(Utils.DATE);

        if(!name.isEmpty()) nameTextView.setText(name);
        if(!height.isEmpty()) heightTextView.setText(height);
        if(!weight.isEmpty()) weightTextView.setText(weight);
        if(!date.isEmpty()) createdTextView.setText(date);

    }
}
