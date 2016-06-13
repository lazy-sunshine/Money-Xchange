package com.example.user.moneyxchange.data.adapters;

import android.database.Cursor;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.user.moneyxchange.R;
import com.example.user.moneyxchange.data.Money;

import butterknife.BindView;
import butterknife.ButterKnife;
import ckm.simple.sql_provider.processor.internal.Table;

/**
 * Created by User on 6/11/2016.
 */
public class RecycleMainAdapter extends RecyclerView.Adapter<RecycleMainAdapter.ViewHolder> {
    LongClickListener clickListener;
    Cursor mCursor;
    ContextCompat c;
    @Override
    public RecycleMainAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        int layoutId = -1;
        if ( viewGroup instanceof RecyclerView ) {

             View view = LayoutInflater.from(viewGroup.getContext()).inflate(layoutId, viewGroup, false);


            view.setFocusable(true);
            ViewHolder viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
            return viewHolder;
        } else {
            throw new RuntimeException("Not bound to RecyclerViewSelection");
        }

    }

    @Override
    public void onBindViewHolder(RecycleMainAdapter.ViewHolder holder, int position) {
    mCursor.moveToPosition(position);

        Money testRow = MoneyTable.getRow(mCursor,true);



    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setClickListener(LongClickListener c){
        clickListener=c;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener {
        @BindView(R.id.image_under_main) ImageView nameImage;
        @BindView(R.id.main_take) TextViewCompat add_num;
        @BindView(R.id.textView5) TextViewCompat name;
        @BindView(R.id.main2) TextViewCompat add_symbol;
        @BindView(R.id.give1) TextViewCompat sub_symbol;
        @BindView(R.id.main_give) TextViewCompat sub_num;



        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
        @Override
        public boolean onLongClick(View view) {
            return false;
        }
    }

    public interface LongClickListener{
        public void itemClickView(View view,int pos);
    }
}
