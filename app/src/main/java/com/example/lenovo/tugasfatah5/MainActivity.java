package com.example.lenovo.tugasfatah5;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvJam;
    private ArrayList<Jam> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvJam = findViewById(R.id.rv_jam);
        rvJam.setHasFixedSize(true);

        list.addAll(JamData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvJam.setLayoutManager(new LinearLayoutManager(this));
        ListJam listHeroAdapter = new ListJam(list);
        rvJam.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode (int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;
        }
    }

    private void showRecyclerGrid(){
        rvJam.setLayoutManager(new GridLayoutManager(this, 2));
        GridJam gridHeroAdapter = new GridJam(list);
        rvJam.setAdapter(gridHeroAdapter);
    }

    private void showRecyclerCardView(){
        rvJam.setLayoutManager(new LinearLayoutManager(this));
        CardViewJam cardViewHeroAdapter = new CardViewJam(list);
        rvJam.setAdapter(cardViewHeroAdapter);
    }
}
