package hannasalmaa.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by acer on 9/29/2016.
 */
public class HalamanRegister extends AppCompatActivity implements View.OnClickListener {
    Button btnC , btnS;
    EditText name,pass,email,hp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_register);

        btnC= (Button)findViewById(R.id.btnCancel);
        btnS= (Button)findViewById(R.id.btnSave);

        name = (EditText)findViewById(R.id.edtUser);
        pass = (EditText)findViewById(R.id.edtPass);
        email = (EditText)findViewById(R.id.edtEmail);
        hp = (EditText)findViewById(R.id.edtHandphone);



        btnC.setOnClickListener(this);
        btnS.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnCancel:
                Intent back = new Intent(this,MainActivity.class);
                startActivity(back);
                break;


            case R.id.btnSave:
                name.setText("");
                pass.setText("");
                email.setText("");
                hp.setText("");
                Toast.makeText(getApplicationContext(),"Selamat anda berhasil mendaftar",Toast.LENGTH_LONG).show();

                break;
            default:
        }
    }

}
