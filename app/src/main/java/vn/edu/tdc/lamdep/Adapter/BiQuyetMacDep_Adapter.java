package vn.edu.tdc.lamdep.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import vn.edu.tdc.lamdep.Model.BiQuyetMacDep_model;
import vn.edu.tdc.lamdep.Model.OutfitThoiTrang_model;
import vn.edu.tdc.lamdep.R;

public class BiQuyetMacDep_Adapter  extends RecyclerView.Adapter<BiQuyetMacDep_Adapter.ViewHolder> {

    private Context context;   // Màn hình hiện tại
    private LayoutInflater inflater;

    // Phương thức khởi tạo
    public BiQuyetMacDep_Adapter(Context context, ArrayList<BiQuyetMacDep_model> list) {
        this.context = context;
        this.listFunction = list;
        inflater = LayoutInflater.from(context);
    }
    public BiQuyetMacDep_Adapter() {
        this.context = context;
        this.listFunction = listFunction;
        inflater = LayoutInflater.from(context);

    }
    private ArrayList<BiQuyetMacDep_model> listFunction;
    @NonNull
    @Override
    public BiQuyetMacDep_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.list_item_outfit, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BiQuyetMacDep_Adapter.ViewHolder viewHolder, int i) {
        final BiQuyetMacDep_model dm = listFunction.get(i);


        // Set từng giá trị lên item

        viewHolder.imgOutfit.setImageResource(dm.getHinhAnh());
        viewHolder.txtOutfit.setText(dm.getTenbaiviet());


        // Bắt sự kiện nhấn vào một item
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickedListener.onItemClick(dm.getId());
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFunction.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgOutfit;
        public TextView txtOutfit;
        public ViewHolder(View itemView) {

            super(itemView);
            txtOutfit = (TextView) itemView.findViewById(R.id.txtOutfit);
            imgOutfit = (ImageView) itemView.findViewById(R.id.imgOutfit);
        }
    }
    public interface OnItemClickedListener {
        void onItemClick(int idFunction);

    }

    // Khai báo một biến interface
    private BiQuyetMacDep_Adapter.OnItemClickedListener onItemClickedListener;

    // Tạo setter cho biến interface ta vừa tạo
    public void setOnItemClickedListener(BiQuyetMacDep_Adapter.OnItemClickedListener onItemClickedListener) {

        this.onItemClickedListener = onItemClickedListener;
    }
}