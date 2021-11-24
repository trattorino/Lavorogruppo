package itts.quintodinf.lavoretto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i i2=getIntent();
        String messaggiricevuti = i.getStringExtra(name “messaggio”);
        String nomiricevuto = i2.getStringExtra(name “nome”);
        Toast t= Toast.makeText(getApplicationContext(), nomericevuto.toString(), Toast.LENGHT_LONG);
        t.show();
        //t.setGravity(10, 3, 5);
    }
}

    }
}