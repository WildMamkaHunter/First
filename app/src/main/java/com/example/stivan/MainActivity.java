package com.example.stivan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button WriteButton;
    Intent intent1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WriteButton=findViewById(R.id.WriteButton);
        intent1 = new Intent(MainActivity.this, NewActivity.class);
    }

    public void ClickButton1(View view) {
        EditText NameText = (EditText) findViewById(R.id.NameText);
        EditText SNameText = (EditText) findViewById(R.id.SNameText);
        EditText TNameText = (EditText) findViewById(R.id.TNameText);
        EditText DateText = (EditText) findViewById(R.id.DateText);
        EditText EmailText = (EditText) findViewById(R.id.EmailText);

        String NameText1 = NameText.getText().toString();
        String SNameText1 = SNameText.getText().toString();
        String TNameText1 = TNameText.getText().toString();
        String DateText1 = DateText.getText().toString();
        String EmailText1 = EmailText.getText().toString();

        intent1.putExtra("Name",NameText1);
        intent1.putExtra("SName",SNameText1);
        intent1.putExtra("TName",TNameText1);
        intent1.putExtra("Date",DateText1);
        intent1.putExtra("Email",EmailText1);


    }

    public void ClickButton(View view) {
        startActivity(intent1);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
