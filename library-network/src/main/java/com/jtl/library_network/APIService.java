package com.jtl.library_network;

import com.jtl.library_network.bean.AllRecommendBean;
import com.jtl.library_network.bean.DiscoveryBean;
import com.jtl.library_network.bean.FeedBean;
import com.jtl.library_network.bean.RecommendBean;
import com.jtl.library_network.bean.TabBean;
import com.jtl.library_network.bean.VideoRelateBean;
import com.jtl.library_network.bean.VideoReplyBean;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/1/11 18:51
 * Detail（详情）：
 */
public interface APIService {
    @GET(OpenAPI.discovery)
    Observable<DiscoveryBean> discovery();
    @GET(OpenAPI.allRec)
    Observable<AllRecommendBean> allRec();
    @GET(OpenAPI.feed)
    Observable<FeedBean> feed();
    @GET(OpenAPI.rec)
    Observable<RecommendBean> recommend();
    @GET(OpenAPI.follow)
    Observable<FeedBean> follow();
    @GET(OpenAPI.tabList)
    Observable<TabBean> tabList();

    //Observable<Message> messages();

    //Observable<DiscoveryBean> list();
    @GET(OpenAPI.videoRelated)
    Observable<VideoRelateBean> videoRelated();
    @GET(OpenAPI.videoReply)
    Observable<VideoReplyBean> videoReply();
}
