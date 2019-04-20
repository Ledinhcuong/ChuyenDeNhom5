package vn.edu.tdc.lamdep.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import vn.edu.tdc.lamdep.Activity.GiamCan;
import vn.edu.tdc.lamdep.Activity.TangChieuCao;
import vn.edu.tdc.lamdep.Activity.TangVongMot;
import vn.edu.tdc.lamdep.Model.DangDep_model;
import vn.edu.tdc.lamdep.Model.Macdep_model;
import vn.edu.tdc.lamdep.R;

public class DangDep_Adapter extends RecyclerView.Adapter<DangDep_Adapter.ViewHolder> {
    private Context context;   // Màn hình hiện tại
    private LayoutInflater inflater;

    // Phương thức khởi tạo
    public DangDep_Adapter(Context context, ArrayList<DangDep_model> list) {
        this.context = context;
        this.listFunction = list;
        inflater = LayoutInflater.from(context);
    }
    public DangDep_Adapter() {
        this.context = context;
        this.listFunction = listFunction;
        inflater = LayoutInflater.from(context);

    }

    private ArrayList<DangDep_model> listFunction;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgicon;
        public TextView tvdanhmuc;
        public ViewHolder(View itemView) {

            super(itemView);
            tvdanhmuc = (TextView) itemView.findViewById(R.id.txtDangDep);
            imgicon = (ImageView) itemView.findViewById(R.id.imgDangDep);
        }
    }

    @NonNull
    @Override
    public DangDep_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.list_item_dangdep, viewGroup, false);

       ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DangDep_Adapter.ViewHolder viewHolder, int i) {
        final DangDep_model dm = listFunction.get(i);


        // Set từng giá trị lên item

        viewHolder.imgicon.setImageResource(dm.getHinhAnh());
        viewHolder.tvdanhmuc.setText(dm.getTenDanhMuc());


        // Bắt sự kiện nhấn vào một item
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (dm.getIdDanhMucDangDep()) {
                    case 1:
                        Intent intent = new Intent(context, GiamCan.class);
                        context.startActivity(intent);
                        break;
                    case 2:
                        Intent intent1 = new Intent(context, TangChieuCao.class);
                        context.startActivity(intent1);
                        break;
                    case 3:
                        Intent intent2 = new Intent(context, TangVongMot.class);
                        context.startActivity(intent2);
                        break;

                    default:
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return listFunction.size();
    }

    public interface OnItemClickedListener {
        void onItemClick(int idFunction);

    }

    // Khai báo một biến interface
    private DangDep_Adapter.OnItemClickedListener onItemClickedListener;

    // Tạo setter cho biến interface ta vừa tạo
    public void setOnItemClickedListener(DangDep_Adapter.OnItemClickedListener onItemClickedListener) {

        this.onItemClickedListener = onItemClickedListener;
    }


}
