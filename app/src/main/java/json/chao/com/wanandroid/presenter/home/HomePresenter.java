package json.chao.com.wanandroid.presenter.home;

import json.chao.com.wanandroid.base.presenter.BasePresenter;
import json.chao.com.wanandroid.contract.home.HomeContract;
import json.chao.com.wanandroid.core.DataManager;

/**
 * 这是MVP模式中P
 */
public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {
    private DataManager mDataManager;

    /**
     * 构造函数
     * @param dataManager
     */
    public HomePresenter(DataManager dataManager) {
        super(dataManager);
        mDataManager = dataManager;
    }

    /**
     * 实现HomeContract.Presenter接口中的抽象方法
     * @param isShowError
     */
    @Override
    public void getBannerData(boolean isShowError) {

    }
}
