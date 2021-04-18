package kr.ac.baekseok.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Join {
    EditText edtID, edtPW;
    Button JoinButton, LoginButton;
    int IDFlag = 0;
    int PWFlag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        edtID = (EditText) findViewById(R.id.edtID);
        edtPW = (EditText) findViewById(R.id.edtPW);
        JoinButton = (Button) findViewById(R.id.JoinButton);
        LoginButton  = (Button) findViewById(R.id.LoginButton);

        JoinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Join.class);
                startActivity(intent);
            }
        });

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlDB = myHelper.getReadableDatabase();
                Cursor cursor;
                cursor = sqlDB.rawQuery("SELECT *FROM Join_info;", null);
                String edt1=null;
                String pass1=null;
                String edt2=null;
                String pass2=null;

                while(cursor.moveToNext())
                {
                    edt2 = cursor.getString(0);
                    pass2 = cursor.getString(1);
                    edt1 = edtID.getText().toString();
                    pass1 = edtPW.getText().toString();

                    if(edt2.equals(edt1))
                    {
                        if(edt2.equals(edt1)) {
                            IDFlag = 1;
                            if(pass2.equals(pass1)) {
                                PWFlag = 1;
                                Toast.makeText(getApplicationContext(), "정상회원입니다.", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(), home.class);
                                startActivity(intent);

                            }
                            else {
                                Toast.makeText(getApplicationContext(), "비밀번호가 틀렸습니다.", Toast.LENGTH_LONG).show();
                            }

                        }
                    }
                    else
                    {

                    }
                }
                if(IDFlag == 0 && PWFlag == 0)
                {
                    Toast.makeText(getApplicationContext(), "아이디가 올바르지 않습니다.", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    private long lastTimeBackPressed;

    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() - lastTimeBackPressed < 1500) {
            finish();
            return;
        }
        Toast.makeText(this, "'뒤로' 버튼을 한 번 더 눌러 종료합니다.", Toast.LENGTH_SHORT);
        lastTimeBackPressed = System.currentTimeMillis();
    }
}
