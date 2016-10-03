package hannasalmaa.login;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editUsername, editPassword;
    Button btnLogin, btnReg, btnFac, btnGma, btnTwi;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate (savedInstanceState);
            setContentView(R.layout.activity_main);
            editUsername=(EditText)findViewById(R.id.adduname);
            editPassword=(EditText)findViewById(R.id.addpass);
            btnLogin=(Button) findViewById(R.id.BtnLogin);
            btnReg=(Button)findViewById(R.id.BtnRegister);
            btnFac=(Button)findViewById(R.id.btnFacebook);
            btnGma=(Button)findViewById(R.id.btnGmail);
            btnTwi=(Button)findViewById(R.id.btnTwitter);


            btnLogin.setOnClickListener(this);
            btnReg.setOnClickListener(this);
            btnFac.setOnClickListener(this);
            btnGma.setOnClickListener(this);
            btnTwi.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnFacebook:
                Uri uriFB = Uri.parse("http://www.facebook.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,uriFB);
                startActivity(intent);
                break;

            case R.id.btnGmail:
                Uri uriGM = Uri.parse("http://www.gmail.com");
                Intent intent2 = new Intent(Intent.ACTION_VIEW,uriGM);
                startActivity(intent2);


                break;
            case R.id.btnTwitter:
                Uri uriTW = Uri.parse("http://www.twitter.com");
                Intent intent3 = new Intent(Intent.ACTION_VIEW,uriTW);
                startActivity(intent3);


                break;
            case R.id.BtnLogin:
                if (editUsername.getText().toString().equals("admin") && editPassword.getText().toString().equals("1234"))
                {
                    Intent hal = new Intent(this,HalamanAwal.class);
                    startActivity(hal);
                }else
                {
                    Toast.makeText(getApplicationContext(),"Mohon Maaf Anda Gagal Login",Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.BtnRegister:

                Intent regis = new Intent(this,HalamanRegister.class);
                startActivity(regis);


                break;
            default:
        }


    }
}