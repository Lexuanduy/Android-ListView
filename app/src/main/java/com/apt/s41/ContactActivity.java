package com.apt.s41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {

    List<User> listUser = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        initData();

        ContactAdapter contactAdapter = new ContactAdapter(this, listUser);
        ListView lvContact = findViewById(R.id.lvContact);
        lvContact.setAdapter(contactAdapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                User user = listUser.get(i);
                Toast.makeText(ContactActivity.this, user.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {

        listUser.add(new User("tinngan", "0989773866", R.drawable.tinngan_110219_753423468_2));
        listUser.add(new User("ngoctrinh", "0989888666", R.drawable.ngoctrinh));
        listUser.add(new User("huyenmy", "0989222786", R.drawable.huyenmy));
        listUser.add(new User("thailand", "0989791866", R.drawable.thailand));
        listUser.add(new User("sexy", "098999999", R.drawable.sexy));
        listUser.add(new User("trang", "01656665677", R.drawable.trang));
        listUser.add(new User("kankew", "0974888732", R.drawable.kankew));

    }


}
