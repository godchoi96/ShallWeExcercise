package kr.ac.baekseok.finalproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Join extends Activity {
    EditText jID, jPW, jName, jEmail;
    Button btnRegistration;
    myDBHelper myHelper;
    SQLiteDatabase sqlDB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);
        jID = (EditText) findViewById(R.id.jID);
        jPW = (EditText) findViewById(R.id.jPW);
        btnRegistration = (Button) findViewById(R.id.j_JoinButton);
        myHelper = new myDBHelper(this);
        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlDB = myHelper.getWritableDatabase();
                sqlDB.execSQL("INSERT INTO Join_info VALUES ('"+
                        jID.getText().toString()+"','"+
                        jPW.getText().toString()+"','"+
                        jName.getText().toString()+"','"+
                        jEmail.getText().toString()+"')");
                sqlDB.close();
                Toast.makeText(getApplicationContext(), "가입됨", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public class myDBHelper extends SQLiteOpenHelper {
        public myDBHelper (Context context) {
            super(context, "LoginDB", null, 1);
        }
        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL("CREATE TABLE Join_info(uID TEXT, uPassword TEXT);");
        }
        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Join_info");
            onCreate(sqLiteDatabase);
        }
    }
}

