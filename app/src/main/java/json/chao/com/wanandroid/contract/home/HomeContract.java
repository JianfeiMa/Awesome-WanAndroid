package json.chao.com.wanandroid.contract.home;

import java.util.List;

import json.chao.com.wanandroid.base.presenter.AbstractPresenter;
import json.chao.com.wanandroid.base.view.AbstractView;
import json.chao.com.wanandroid.core.bean.main.banner.BannerData;

public interface HomeContract {

    interface View extends AbstractView {
        void showBannerData(List<BannerData> bannerDataList) ;
    }

    interface Presenter extends AbstractPresenter<View> {
        void getBannerData(boolean isShowError);
    }
}
