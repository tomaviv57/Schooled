package net.ddns.mipster.schooled;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Chen on 26/02/2017.
 */

public class AnnouncementListAdapter extends BaseAdapter {
    private ArrayList<AnnouncementItemData> data;
    private LayoutInflater mInflater;

    public AnnouncementListAdapter(Context context, ArrayList<AnnouncementItemData> data){
        this.data = data;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int arg0) {
        return data.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(R.layout.list_item, null);

        TextView date = (TextView) convertView.findViewById(R.id.date);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView text = (TextView) convertView.findViewById(R.id.text);

        date.setText(data.get(position).getDate());
        title.setText(data.get(position).getTitle());
        text.setText(data.get(position).getText());

        return convertView;
    }
}