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

import vn.edu.tdc.lamdep.Adapter.TangChieuCao_Adapter;
import vn.edu.tdc.lamdep.Adapter.TangVongMot_Adapter;
import vn.edu.tdc.lamdep.Model.TangChieuCao_model;
import vn.edu.tdc.lamdep.R;

public class TangChieuCao extends AppCompatActivity implements SearchView.OnQueryTextListener{
    private ArrayList<TangChieuCao_model> listTangChieuCao;
    private TangChieuCao_Adapter tangchieucaoAdapter;
    private RecyclerView rcvTangChieuCao ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tangchieucao_layout);

        setControl();
        importData();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    private void importData() {
        listTangChieuCao.add(new TangChieuCao_model(1, R.drawable.icondangdep, "Chăm sóc tóc hiệu quả trong mùa du lịch"));
        listTangChieuCao.add(new TangChieuCao_model(2, R.drawable.icondangdep, "Chăm sóc tóc hiệu quả trong mùa du lịch"));

        tangchieucaoAdapter.notifyDataSetChanged();
    }

    private void setControl() {
        rcvTangChieuCao = (RecyclerView) findViewById(R.id.recycle_view_tangchieucao);
        listTangChieuCao = new ArrayList<>();
        tangchieucaoAdapter = new TangChieuCao_Adapter(TangChieuCao.this, listTangChieuCao);
        // Quy định chiều hiển thị của recycler view (Vertical hoăc Hozital)
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(TangChieuCao.this, LinearLayoutManager.VERTICAL, false);
        // Set chiều hiển thị cho recycler view word tođay
        // Set chiều hiển thị cho recycler view word tođay
        rcvTangChieuCao.setLayoutManager(linearLayoutManager);
        // Set adapter cho recycler view word today
        rcvTangChieuCao.setAdapter(tangchieucaoAdapter);
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
