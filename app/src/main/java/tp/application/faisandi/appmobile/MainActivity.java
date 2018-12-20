package tp.application.faisandi.appmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

/**
 * TODO: implement onclick
 */
public class MainActivity extends AppCompatActivity implements NameItemListener {

    private RecyclerView recyclerView;
    private Button buttonEdit;
    private ListNameAdapter listNameAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listNameAdapter= new ListNameAdapter(this);
        initViews();
        initList();
    }

    private void initList() {
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(listNameAdapter);
    }

    @Override
    protected void onResume(){
        super.onResume();

        List<String> nameList =DataManager.getInstance().getNameList();
        listNameAdapter.updateData(nameList);

    }

    private void initViews() {
        recyclerView = findViewById(R.id.activity_main_recyclerView);

        buttonEdit = findViewById(R.id.activity_main_button);
        buttonEdit.setOnClickListener(v -> {
            Intent intent = new Intent(this, EditActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public void clickOnItem(String name) {
        Toast.makeText(this, name,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clickOnCloss(String name) {
        Toast.makeText(this,"Clic sur la croix de l'item: "+name,Toast.LENGTH_SHORT).show();
    }
}


