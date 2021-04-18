package kr.ac.baekseok.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Youtuber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtuber);

        final String[] mid = {"ThankyouBUBU", "재미어트", "운지기 TV", "피지컬갤러리", "율리예스", "조제알통", "DeSLun맨몸운동", "DanJeong", "헬스티비", "DanoTV", "SmiHomeTraining스미홈트", "힙으뜸", "빵느Seoyeon"};
        ListView list = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mid);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0) {
                    Intent intent = new Intent(getApplicationContext(), Youtube1.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Thank you BuBu는 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 1) {
                    Intent intent = new Intent(getApplicationContext(), Youtube2.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "재미어트는 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 2) {
                    Intent intent = new Intent(getApplicationContext(), Youtube3.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "운지기 TV는 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 3) {
                    Intent intent = new Intent(getApplicationContext(), Youtube4.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "피지컬갤러리는 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 4) {
                    Intent intent = new Intent(getApplicationContext(), Youtube5.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "율리예스는 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 5) {
                    Intent intent = new Intent(getApplicationContext(), Youtube6.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "조제알통은 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 6) {
                    Intent intent = new Intent(getApplicationContext(), Youtube7.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "DeSLun맨몸운동은 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 7) {
                    Intent intent = new Intent(getApplicationContext(), Youtube8.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Dan Jeong은 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 8) {
                    Intent intent = new Intent(getApplicationContext(), Youtube9.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "헬스티비는 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 9) {
                    Intent intent = new Intent(getApplicationContext(), Youtube10.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "DanoTV는 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 10) {
                    Intent intent = new Intent(getApplicationContext(), Youtube11.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "SmiHomeTraining스미홈트는 누구?", Toast.LENGTH_SHORT).show();
                }
                else if(i == 11) {
                    Intent intent = new Intent(getApplicationContext(), Youtube12.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "힙으뜸은 누구?", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), Youtube13.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "빵느 Seoyeon은 누구?", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
