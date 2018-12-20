package tp.application.faisandi.appmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    private Button buttonValide;
    private TextView editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        editTextName = findViewById(R.id.activity_edit_editText);
        buttonValide = findViewById(R.id.activity_edit_valide);
        buttonValide.setOnClickListener(v -> save());
    }

    private void save() {
        String name = editTextName.getText().toString();
        if(!name.isEmpty()){
            DataManager.getInstance().addName(name);
        }
        finish();
    }


}
