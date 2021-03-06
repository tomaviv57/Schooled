package net.ddns.mipster.schooled.adapters;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import net.ddns.mipster.schooled.classes.AnnouncementItemData;
import net.ddns.mipster.schooled.R;

import java.util.ArrayList;


public class AnnouncementListAdapter extends BaseAdapter {
    private ArrayList<AnnouncementItemData> data;
    private LayoutInflater mInflater;

    public AnnouncementListAdapter(Context context, ArrayList<AnnouncementItemData> data){
        this.data = data;
        mInflater = LayoutInflater.from(context);
    }

    public AnnouncementListAdapter(Context context, Cursor data){
        this.data = new ArrayList<>();

        while (data.moveToNext())
            this.data.add(new AnnouncementItemData(data.getString(0),data.getString(2),data.getString(1),data.getString(3)));
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(R.layout.announcement_list_item, null);

        TextView date = (TextView) convertView.findViewById(R.id.date);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView text = (TextView) convertView.findViewById(R.id.text);

        date.setText(data.get(position).getDate());
        title.setText(data.get(position).getTitle());
        text.setText(data.get(position).getText());

        if(!data.get(position).getUrl().isEmpty()) {
            title.setTextColor(Color.parseColor("#0000EE"));
            title.setPaintFlags(title.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        }

        return convertView;
    }
}