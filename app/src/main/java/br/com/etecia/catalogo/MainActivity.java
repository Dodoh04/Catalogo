package br.com.etecia.catalogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView idListCamisetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idListCamisetas = findViewById(R.id.idListCamisetas);
        MyAdapter Adapter = new MyAdapter();
        idListCamisetas.setAdapter(Adapter);

    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
    public View getView( int i, )
}