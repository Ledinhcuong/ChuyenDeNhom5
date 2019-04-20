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

import vn.edu.tdc.lamdep.Adapter.BiQuyetMacDep_Adapter;
import vn.edu.tdc.lamdep.Model.BiQuyetMacDep_model;
import vn.edu.tdc.lamdep.Model.OutfitThoiTrang_model;
import vn.edu.tdc.lamdep.R;

public class BiQuyetMacDep extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private ArrayList<BiQuyetMacDep_model> listBiQuyet;
    private BiQuyetMacDep_Adapter biquyetAdapter;
    private RecyclerView rcvBiQuyet ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biquyetmacdep_layout);

        setControl();
        importData();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    private void importData() {
        listBiQuyet.add(new BiQuyetMacDep_model(1, R.drawable.icondangdep, "Chăm sóc tóc hiệu quả trong mùa du lịch"));
        listBiQuyet.add(new BiQuyetMacDep_model(2, R.drawable.icondangdep, "Chăm sóc tóc hiệu quả trong mùa du lịch"));

        biquyetAdapter.notifyDataSetChanged();
    }

    private void setControl() {
        rcvBiQuyet = (RecyclerView) findViewById(R.id.recycle_view_BiQuyet);
        listBiQuyet = new ArrayList<>();
        biquyetAdapter = new BiQuyetMacDep_Adapter(BiQuyetMacDep.this, listBiQuyet);
        // Quy định chiều hiển thị của recycler view (Vertical hoăc Hozital)
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BiQuyetMacDep.this, LinearLayoutManager.VERTICAL, false);
        // Set chiều hiển thị cho recycler view word tođay
        // Set chiều hiển thị cho recycler view word tođay
        rcvBiQuyet.setLayoutManager(linearLayoutManager);
        // Set adapter cho recycler view word today
        rcvBiQuyet.setAdapter(biquyetAdapter);
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
