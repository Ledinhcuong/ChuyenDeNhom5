package vn.edu.tdc.lamdep.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import vn.edu.tdc.lamdep.Adapter.XuHuongThoiTrang_Adapter;
import vn.edu.tdc.lamdep.Model.XuHuongThoiTrang_Model;
import vn.edu.tdc.lamdep.R;

public class XuHuongThoiTrang extends AppCompatActivity  implements SearchView.OnQueryTextListener{

    private ArrayList<XuHuongThoiTrang_Model> listXuHuong;
    private XuHuongThoiTrang_Adapter xuhuongAdapter;
    private RecyclerView rcvXuHuong ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xu_huong_thoi_trang_layout);

        setControl();
        importData();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void setControl() {
        rcvXuHuong = (RecyclerView) findViewById(R.id.recycle_view_XuHuongtt);
        listXuHuong = new ArrayList<>();
        xuhuongAdapter = new XuHuongThoiTrang_Adapter(XuHuongThoiTrang.this, listXuHuong);
        // Quy định chiều hiển thị của recycler view (Vertical hoăc Hozital)
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(XuHuongThoiTrang.this, LinearLayoutManager.VERTICAL, false);
        // Set chiều hiển thị cho recycler view word tođay
        // Set chiều hiển thị cho recycler view word tođay
        rcvXuHuong.setLayoutManager(linearLayoutManager);
        // Set adapter cho recycler view word today
        rcvXuHuong.setAdapter(xuhuongAdapter);
    }

    public void importData() {
        listXuHuong.add(new XuHuongThoiTrang_Model(1, R.drawable.icondangdep, "Chăm sóc tóc hiệu quả trong mùa du lịch"));
        listXuHuong.add(new XuHuongThoiTrang_Model(2, R.drawable.icondangdep, "Chăm sóc tóc hiệu quả trong mùa du lịch"));

        xuhuongAdapter.notifyDataSetChanged();
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
