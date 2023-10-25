package com.nguyentanlap.n63132204_thigiuaky;

import android.content.Context;
import android.telecom.TelecomManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DongVatAdapter extends BaseAdapter {
    private  ArrayList<DongVat> lst;
    private LayoutInflater inflater;
    private Context context;

    public DongVatAdapter(ArrayList<DongVat> lst, Context context) {
        this.lst = lst;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int i) {
        return lst.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewHienHanh = view;
        if(viewHienHanh == null){
            viewHienHanh = inflater.inflate(R.layout.item_dongvat,null);
        }

        DongVat dvHienTai = lst.get(i);

        TextView tv_tenDV = (TextView) viewHienHanh.findViewById(R.id.tvTen);
        TextView tv_taptinh = (TextView) viewHienHanh.findViewById(R.id.tvTapTinh);
        TextView tv_soLuong = (TextView) viewHienHanh.findViewById(R.id.tvSoLuong);
        ImageView img_anh = (ImageView) viewHienHanh.findViewById(R.id.imgAnh);

        tv_tenDV.setText(dvHienTai.getTen());
        tv_taptinh.setText("Động vât "+ dvHienTai.getTapTinh());
        tv_soLuong.setText("Số lượng loài "+ String.valueOf(dvHienTai.getSoLuong()));
        img_anh.setImageResource(dvHienTai.getIdAnh());


        return null;
    }
}
