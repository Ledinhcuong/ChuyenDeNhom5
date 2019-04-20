package vn.edu.tdc.lamdep.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import vn.edu.tdc.lamdep.Adapter.GiamCan_Adapter;
import vn.edu.tdc.lamdep.Model.GiamCan_model;
import vn.edu.tdc.lamdep.R;

public class GiamCan extends AppCompatActivity implements SearchView.OnQueryTextListener  {
    private ArrayList<GiamCan_model> listGiamCan;
    private GiamCan_Adapter giamcanAdapter;
    private RecyclerView rcvGiamCan ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giamcan_layout);

        setControl();
        importData();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    private void importData() {
        listGiamCan.add(new GiamCan_model(1, R.drawable.icondangdep, "Chăm sóc tóc hiệu quả trong mùa du lịch"));
        listGiamCan.add(new GiamCan_model(2, R.drawable.icondangdep, "Chăm sóc tóc hiệu quả trong mùa du lịch"));

        giamcanAdapter.notifyDataSetChanged();
    }

    private void setControl() {
        rcvGiamCan = (RecyclerView) findViewById(R.id.recycle_view_giamcan);
        listGiamCan = new ArrayList<>();
        giamcanAdapter = new GiamCan_Adapter(GiamCan.this, listGiamCan);
        // Quy định chiều hiển thị của recycler view (Vertical hoăc Hozital)
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(GiamCan.this, LinearLayoutManager.VERTICAL, false);
        // Set chiều hiển thị cho recycler view word tođay
        // Set chiều hiển thị cho recycler view word tođay
        rcvGiamCan.setLayoutManager(linearLayoutManager);
        // Set adapter cho recycler view word today
        rcvGiamCan.setAdapter(giamcanAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                onBackPressed();
                return true;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }
    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return false;
    }
}
