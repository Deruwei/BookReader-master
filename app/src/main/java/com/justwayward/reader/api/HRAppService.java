package com.justwayward.reader.api;

import com.justwayward.reader.bean.BooksByCats;
import com.justwayward.reader.bean.CategoryListLv2;

import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wdr on 2017/8/15.
 */

public class HRAppService {
    ///svrdo.php
    /**
     * 按分类获取书籍列表
     *
     * @param gender male、female
     * @param type   hot(热门)、new(新书)、reputation(好评)、over(完结)
     * @param major  玄幻
     * @param minor  东方玄幻、异界大陆、异界争霸、远古神话
     * @param limit  50
     * @return
     *
     *  HashMap<String, String> params = new HashMap<String, String>();
    params.put("method", "mobilead.list");
    params.put("a_id", "");
    params.put("c_id", "");
    if (ad_type == 1) {// 名企推广
    params.put("c_type", "4");
    } else if (ad_type == 2) {// 炫公司
    params.put("c_type", "7");
    } else if (ad_type == 3) {// 专题活动
    params.put("c_type", "5");
    }
    SharedPreferencesUtils sUtils = new SharedPreferencesUtils(context);
    int industry_id = sUtils.getIntValue(Constants.INDUSTRY, 11);
    params.put("industry", "" + industry_id);
    params.put("page", "");
    params.put("page_nums", "20");
     */
    @POST("/svrdo.php")
    Observable<>
}
