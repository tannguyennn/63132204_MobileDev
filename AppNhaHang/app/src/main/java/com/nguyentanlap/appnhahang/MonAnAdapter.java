package com.nguyentanlap.appnhahang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.apache.http.conn.ConnectTimeoutException;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {

    private ArrayList<MonAn> dsMon;
    private LayoutInflater inflater;
    private Context context;

    public MonAnAdapter(ArrayList<MonAn> dsMon, Context context) {
        this.dsMon = dsMon;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMon.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMon.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //view item hiện hành
        View viewHienHanh = view;
        // kiểm tra
        if(viewHienHanh == null) {
            viewHienHanh = inflater.inflate(R.layout.item_monan, null);
        }

        MonAn monHienTai = dsMon.get(i);

        //tim đều khiển
        TextView tv_TenMon = (TextView) viewHienHanh.findViewById(R.id.tvTenMon);
        TextView tv_DonGia = (TextView) viewHienHanh.findViewById(R.id.tvDonGia);
        TextView tv_MoTa = (TextView) viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView img_Anh = (ImageView) viewHienHanh.findViewById(R.id.imgAnhMinhHoa);

        //set text
        tv_TenMon.setText(monHienTai.getTenMonAn());
        tv_DonGia.setText(String.valueOf(monHienTai.getDonGia()));
        tv_MoTa.setText(monHienTai.getIdAnh());
        img_Anh.setImageResource(monHienTai.getIdAnh());



        return null;
    }
}
