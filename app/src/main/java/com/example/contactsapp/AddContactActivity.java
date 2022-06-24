package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AddContactActivity extends AppCompatActivity {

    EditText nameET, phoneET, webET, mapET;
    ImageView happyIMV, neutralIMV, sadIMV;

    View.OnClickListener onFaceClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String nameValue = nameET.getText().toString();
            String phoneValue = phoneET.getText().toString();
            String webValue = webET.getText().toString();
            String mapValue = mapET.getText().toString();
            if (nameValue.trim().isEmpty()) {
                nameET.setError("This field is mandatory !");
            }

            if (phoneValue.trim().isEmpty()) {
                phoneET.setError("This field is mandatory !");
            }

            if (nameValue.trim().isEmpty()) {
                nameET.setError("This field is mandatory !");
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        nameET = findViewById(R.id.name_et);
        phoneET = findViewById(R.id.phone_et);
        webET = findViewById(R.id.websiteEditText);
        mapET = findViewById(R.id.location_et);
        happyIMV = findViewById(R.id.happy_imv);
        neutralIMV = findViewById(R.id.neutral_imv);
        sadIMV = findViewById(R.id.sad_imv);


    }
}