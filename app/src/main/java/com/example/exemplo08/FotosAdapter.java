package com.example.exemplo08;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FotosAdapter extends BaseAdapter {

    private final Context context;
    private final List<Fotos> icons;

    public FotosAdapter(Context context, List<Fotos> icons) {
        this.context = context;
        this.icons = icons;
    }

    @Override
    public int getCount() {
        return icons.size();
    }

    @Override
    public Object getItem(int position) {
        return icons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder") View view = LayoutInflater.from(context)
                .inflate(R.layout.adapter_fotos, parent,false);
        TextView texto = view.findViewById(R.id.txtFotos);
        ImageView img = view.findViewById(R.id.imgFotos);

        Fotos icons = Fotos.getIcons().get(position);
        texto.setText(icons.nome);
        img.setImageResource(icons.img);

        return view;
    }
}