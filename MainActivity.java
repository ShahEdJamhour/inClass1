package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.library.model.Book;
import com.example.library.model.BookDataAccess;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    private Button bttn;
    private Spinner spinner;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttn=findViewById(R.id.bttn);
        spinner=findViewById(R.id.spinner);
        text2=findViewById(R.id.textView2);
        BookDataAccess Bookda= new BookDataAccess();

        String[]types= Bookda.getBookTypes();
        // i should give it 3 things in the constructor

        //this means which activity we are working on.
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,types);



        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category=spinner.getSelectedItem().toString();
                BookDataAccess Bookda= new BookDataAccess();
                List<Book> lstBooks=Bookda.getBookCategory;


                // we need to give an adapter





            }
        });






    }
}