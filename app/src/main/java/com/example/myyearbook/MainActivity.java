package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 Button btn= (Button) findViewById(R.id.btnevent);

 btn.setOnClickListener(new View.OnClickListener(){
@Override
    public void onClick(View view){
        final TextView textView  =(TextView) findViewById(R.id.textview);
        textView.setText("Hello Hello Hello");

        Intent i = new Intent(getApplicationContext(),GraduationPage.class);
        startActivity(i);

}

});

}


}
