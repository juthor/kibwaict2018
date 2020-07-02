package com.example.hyunju.registeration;

/*import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
*/


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity {

    EditText id, pwd;
    Button btn;
    String loginId, loginPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id = (EditText)findViewById(R.id.inputId);
        pwd = (EditText)findViewById(R.id.inputPwd);
        btn = (Button)findViewById(R.id.loginBtn);
        SharedPreferences auto = getSharedPreferences("auto", Activity.MODE_PRIVATE);


        //처음에는 SharedPreferences에 아무런 정보도 없으므로 값을 저장할 키들을 생성
        // getString의 첫 번째 인자는 저장될 키, 두 번쨰 인자는 값
        // 초기값 값이 없음-> 값을 null을 줌

        loginId = auto.getString("inputId",null);
        loginPwd = auto.getString("inputPwd",null);

        //MainActivity로 들어왔을 때 loginId와 loginPwd값을 가져와서 id랑 password 일치시, 자동적으로 액티비티 이동.
        if(loginId !=null && loginPwd != null) {
            if(loginId.equals("hello") && loginPwd.equals("hello")) {
                Toast.makeText(LoginActivity.this, loginId +"님 자동로그인 입니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, SubActivity.class);
                startActivity(intent);
                finish();
            }
            else if(loginId.equals("bye") && loginPwd.equals("bye")) {
                Toast.makeText(LoginActivity.this, loginId +"님 자동로그인 입니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, SubActivity.class);
                startActivity(intent);
                finish();
            }
            else if(loginId.equals("ks1") && loginPwd.equals("ks1")) {
                Toast.makeText(LoginActivity.this, loginId +"님 자동로그인 입니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, SubActivity.class);
                startActivity(intent);
                finish();
            }
            else if(loginId.equals("kb1") && loginPwd.equals("kb1")) {
                Toast.makeText(LoginActivity.this, loginId +"님 자동로그인 입니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, SubActivity.class);
                startActivity(intent);
                finish();
            }
        }
        //id와 pwd가 null이면 Mainactivity가 보여짐.
        else if(loginId == null && loginPwd == null){
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (id.getText().toString().equals("hello") && pwd.getText().toString().equals("hello")) {
                        SharedPreferences auto = getSharedPreferences("auto", Activity.MODE_PRIVATE);
                        //auto의 loginId와 loginPwd에 값을 저장해 줌
                        SharedPreferences.Editor autoLogin = auto.edit();
                        autoLogin.putString("inputId", id.getText().toString());
                        autoLogin.putString("inputPwd", pwd.getText().toString());
                        //꼭 commit()을 해줘야 값이 저장됨
                        autoLogin.commit();
                        Toast.makeText(LoginActivity.this, id.getText().toString()+"님 환영합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, SubActivity.class);
                        startActivity(intent);
                        finish();
                    }

                    else if (id.getText().toString().equals("bye") && pwd.getText().toString().equals("bye")) {
                        SharedPreferences auto = getSharedPreferences("auto", Activity.MODE_PRIVATE);
                        SharedPreferences.Editor autoLogin = auto.edit();
                        autoLogin.putString("inputId", id.getText().toString());
                        autoLogin.putString("inputPwd", pwd.getText().toString());
                        autoLogin.commit();
                        Toast.makeText(LoginActivity.this, id.getText().toString()+"님 환영합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, SubActivity.class);
                        startActivity(intent);
                        finish();
                    }

                    else if (id.getText().toString().equals("ks1") && pwd.getText().toString().equals("ks1")) {
                        SharedPreferences auto = getSharedPreferences("auto", Activity.MODE_PRIVATE);
                        //아이디가 'ks1'이고 비밀번호가 'ks1'일 경우 SharedPreferences.Editor를 통해
                        //auto의 loginId와 loginPwd에 값을 저장해 줌
                        SharedPreferences.Editor autoLogin = auto.edit();
                        autoLogin.putString("inputId", id.getText().toString());
                        autoLogin.putString("inputPwd", pwd.getText().toString());
                        //commit()을 해줘야 값이 저장됨
                        autoLogin.commit();
                        Toast.makeText(LoginActivity.this, id.getText().toString()+"님 환영합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, SubActivity.class);
                        startActivity(intent);
                        finish();
                    }

                    else if (id.getText().toString().equals("kb1") && pwd.getText().toString().equals("kb1")) {
                        SharedPreferences auto = getSharedPreferences("auto", Activity.MODE_PRIVATE);
                        //아이디가 kb1이고 비밀번호가 'kb1일 경우 SharedPreferences.Editor를 통해
                        //auto의 loginId와 loginPwd에 값을 저장해 줌
                        SharedPreferences.Editor autoLogin = auto.edit();
                        autoLogin.putString("inputId", id.getText().toString());
                        autoLogin.putString("inputPwd", pwd.getText().toString());
                        autoLogin.commit();
                        Toast.makeText(LoginActivity.this, id.getText().toString()+"님 환영합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, SubActivity.class);
                        startActivity(intent);
                        finish();
                    }

                    else//만약 틀렸으면 문구 출력하고 다시 입력하도록 함
                    {
                        Toast.makeText(LoginActivity.this, "Error Id or Password \n" +
                                "Please contact manager", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
    }
}

