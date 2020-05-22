package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddContact extends AppCompatActivity {
    Button btnAdd;
    EditText edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        edtPass = findViewById(R.id.edtPass);
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mess="";
                String pass= "^(?=.*[A-Z])[A-Za-z\\d@$!%*?&_#-.]{0,}$";
                String pass1= "^(?=.*[a-z])[A-Za-z\\d@$!%*?&_#-.]{0,}$";
                String pass2= "^(?=.*\\d)[A-Za-z\\d@$!%*?&_#-.]{0,}$";
                String pass4= "^(?=.*[@$!%*?&_#-.])[A-Za-z\\d@$!%*?&_#-.]{0,}$";
                String pass3= "^[A-Za-z\\d@$!%*?&_#-.]{8,}$";

                boolean flag;
                flag = edtPass.getText().toString().matches(pass);
                if(flag == false)
                    mess+= " 1 kí tự in hoa,";

                flag = edtPass.getText().toString().matches(pass1);
                if(flag == false)
                    mess+=" 1 kí tự thường ";

                flag = edtPass.getText().toString().matches(pass2);
                    if(flag == false)
                     mess+=" 1 kí tự số ";
                flag = edtPass.getText().toString().matches(pass3);
                if(flag == false)
                    mess+=" đủ 8 kí tự số ";
                flag = edtPass.getText().toString().matches(pass4);
                if(flag == false)
                    mess+=" 1 kí tự đb ";
                if(mess !="")
                    Toast.makeText(getBaseContext(),"Mật khẩu cần thêm "+mess,Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getBaseContext(),"Mật khẩu đủ điều kiện",Toast.LENGTH_LONG).show();
            }
        });


    }
}
