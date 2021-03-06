package com.scxd.lawqinghai.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.scxd.lawqinghai.R;
import com.scxd.lawqinghai.bean.other.DictionaryManager;
import com.scxd.lawqinghai.bean.response.DicationResBean;
import com.scxd.lawqinghai.bean.response.NotificationOfCompulsoryMeasuresResBean;
import com.scxd.lawqinghai.bean.response.SummaryPunishmentDecisionResBean;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 描述：
 * 公司：四川星盾科技股份有限公司
 * 编写人：陈渝金-pc:64550
 * 时间： 2018/7/3
 * 修改人：
 * 修改时间：
 */


public class NotificationOfCompulsoryMeasureAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context mContext;
    private List<NotificationOfCompulsoryMeasuresResBean.DataBean.ListBean> dataList;
//    private LayoutInflater mInflater;
    public static final int TYPE_NORMAL = 1;
    private static final int TYPE_FOOTER = 2;
    private int mSwitch = 0;
    private Map<String, String> hpzlMap;
    private Map<String, String> qzcslxMap;


    public NotificationOfCompulsoryMeasureAdapter(Context mContext) {

        this.mContext = mContext;
//        mInflater = LayoutInflater.from(mContext);
        List<DicationResBean> hpzlList = DictionaryManager.getInstance().getHpzl();
        hpzlMap = new LinkedHashMap<>();
        for (DicationResBean resBean : hpzlList) {
            hpzlMap.put(resBean.getCode(), resBean.getName());
        }
        List<DicationResBean> qzcslxList = DictionaryManager.getInstance().getQzcslx();
        qzcslxMap = new LinkedHashMap<>();
        for (DicationResBean resBean : qzcslxList) {
            qzcslxMap.put(resBean.getCode(), resBean.getName());
        }

    }

    public void setDatas(List<NotificationOfCompulsoryMeasuresResBean.DataBean.ListBean> datas) {
        this.dataList = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {

        if (position + 1 == getItemCount() && mSwitch == 1) {
            return TYPE_FOOTER;
        }
        return TYPE_NORMAL;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_FOOTER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_foot, parent, false);
            return new NotificationOfCompulsoryMeasureAdapter.FooterViewHolder(view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item, parent, false);
        return new NotificationOfCompulsoryMeasureAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {


        if (holder instanceof NotificationOfCompulsoryMeasureAdapter.ViewHolder) {
            NotificationOfCompulsoryMeasureAdapter.ViewHolder viewHolder = (NotificationOfCompulsoryMeasureAdapter.ViewHolder) holder;
            final NotificationOfCompulsoryMeasuresResBean.DataBean.ListBean bean = dataList.get(position);
            ((ViewHolder) holder).number.setText(bean.getJdsbh());
            ((ViewHolder) holder).hpzl.setText(hpzlMap.get(bean.getHpzl()));
            ((ViewHolder) holder).hphm.setText(bean.getHphm());
            ((ViewHolder) holder).dsr.setText(bean.getDsr());
            ((ViewHolder) holder).zjhm.setText(bean.getJszh());
            ((ViewHolder) holder).notification.setText(qzcslxMap.get(bean.getQzcs()));//强制 措施


            viewHolder.summarydy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mOnItemClickListener != null) {
                        mOnItemClickListener.OnItemClick(view, position, bean);
                    }
                }
            });
            viewHolder.summaryxq.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mOnItemClickListener != null) {
                        mOnItemClickListener.OnItemClick(view, position, bean);
                    }
                }
            });
        }

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size() + mSwitch;
    }

    public void setFooterOn() {
        mSwitch = 1;
        notifyDataSetChanged();
    }

    public void setFooterOff() {
        mSwitch = 0;
        notifyDataSetChanged();
    }

    private NotificationOfCompulsoryMeasureAdapter.OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(NotificationOfCompulsoryMeasureAdapter.OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }


    class FooterViewHolder extends RecyclerView.ViewHolder {

        public FooterViewHolder(View itemView) {
            super(itemView);
        }
    }

    public interface OnItemClickListener {
        void OnItemClick(View view, int position, Object bean);
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.number)
        TextView number;
        @BindView(R.id.hpzl)
        TextView hpzl;
        @BindView(R.id.hphm)
        TextView hphm;
        @BindView(R.id.dsr)
        TextView dsr;
        @BindView(R.id.zjhm)
        TextView zjhm;
        @BindView(R.id.notification)
        TextView notification;
        @BindView(R.id.item_linear)
        LinearLayout itemLiner;
        @BindView(R.id.summarydy)
        Button summarydy;
        @BindView(R.id.summaryxq)
        Button summaryxq;


        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
