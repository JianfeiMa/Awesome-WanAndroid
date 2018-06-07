package json.chao.com.wanandroid.ui.home.fragment;

import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import json.chao.com.wanandroid.R;
import json.chao.com.wanandroid.base.fragment.BaseRootFragment;
import json.chao.com.wanandroid.contract.home.HomeContract;
import json.chao.com.wanandroid.core.bean.main.banner.BannerData;
import json.chao.com.wanandroid.presenter.home.HomePresenter;

/**
 * 这个是MVP模式中的V层View
 */
public class HomeFragment extends BaseRootFragment<HomePresenter> implements HomeContract.View {
    private SwipeRefreshLayout mSwipeRefreshLayout;

    private RecyclerView mRecyclerView;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void showBannerData(List<BannerData> bannerDataList) {

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    /**
     * 重写父类BaseRootFragment的方法
     */
    @Override
    protected void initEventAndData() {
        super.initEventAndData();
    }

    private void initRecyclerView() {

    }
}
