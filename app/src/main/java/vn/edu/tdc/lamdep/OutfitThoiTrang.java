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

import vn.edu.tdc.lamdep.Adapter.OutfitThoiTrang_Adapter;
import vn.edu.tdc.lamdep.Model.OutfitThoiTrang_model;
import vn.edu.tdc.lamdep.Model.XuHuongThoiTrang_Model;
import vn.edu.tdc.lamdep.R;

public class OutfitThoiTrang extends AppCompatActivity implements SearchView.OnQueryTextListener{
    private ArrayList<OutfitThoiTrang_model> listOutfit;
    private OutfitThoiTrang_Adapter outfitAdapter;
    private RecyclerView rcvOutfit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outfit_layout);

        setControl();
        importData();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void importData() {
        listOutfit.add(new OutfitThoiTrang_model(1, R.drawable.icondangdep, "Chăm sóc tóc hiệu quả trong mùa du lịch"));
        listOutfit.add(new OutfitThoiTrang_model(2, R.drawable.icondangdep, "Chăm sóc tóc hiệu quả trong mùa du lịch"));

        outfitAdapter.notifyDataSetChanged();
    }

    private void setControl() {
        rcvOutfit = (RecyclerView) findViewById(R.id.recycle_view_outfit);
        listOutfit = new ArrayList<>();
        outfitAdapter = new OutfitThoiTrang_Adapter(OutfitThoiTrang.this, listOutfit);
        // Quy định chiều hiển thị của recycler view (Vertical hoăc Hozital)
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(OutfitThoiTrang.this, LinearLayoutManager.VERTICAL, false);
        // Set chiều hiển thị cho recycler view word tođay
        // Set chiều hiển thị cho recycler view word tođay
        rcvOutfit.setLayoutManager(linearLayoutManager);
        // Set adapter cho recycler view word today
        rcvOutfit.setAdapter(outfitAdapter);
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
