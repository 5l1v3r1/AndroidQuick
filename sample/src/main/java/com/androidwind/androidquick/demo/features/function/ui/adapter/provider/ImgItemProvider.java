package com.androidwind.androidquick.demo.features.function.ui.adapter.provider;

import android.widget.Toast;

import com.androidwind.androidquick.demo.R;
import com.androidwind.androidquick.demo.bean.CBean;
import com.androidwind.androidquick.demo.features.function.ui.adapter.DemoAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.provider.BaseItemProvider;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */

public class ImgItemProvider extends BaseItemProvider<CBean, BaseViewHolder> {

    @Override
    public int viewType() {
        return DemoAdapter.TYPE_IMG;
    }

    @Override
    public int layout() {
        return R.layout.item_multiviewtype_img;
    }

    @Override
    public void convert(BaseViewHolder helper, CBean data, int position) {
        helper.addOnClickListener(R.id.iv_img);
        helper.setImageResource(R.id.iv_img, R.mipmap.ic_launcher);
    }

    @Override
    public void onClick(BaseViewHolder helper, CBean data, int position) {
        Toast.makeText(mContext, "click", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onLongClick(BaseViewHolder helper, CBean data, int position) {
        Toast.makeText(mContext, "longClick", Toast.LENGTH_SHORT).show();
        return true;
    }
}
