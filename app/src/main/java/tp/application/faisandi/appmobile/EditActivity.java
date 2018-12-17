package tp.application.faisandi.appmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    public final static String KEY_USERNAME = "lastName";

    private Button buttonValide;
    private TextView editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        editTextName = findViewById(R.id.activity_edit_editText);
        buttonValide = findViewById(R.id.activity_edit_valide);
        buttonValide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveForm();
            }
        });
    }

    private void saveForm() {
        String name = editTextName.getText().toString();
        Intent resultIntent = new Intent();
        resultIntent.putExtra(KEY_USERNAME, name);
        setResult(RESULT_OK, resultIntent);
        finish();
    }


}
