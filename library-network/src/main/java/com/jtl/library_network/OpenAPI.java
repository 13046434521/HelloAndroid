package com.jtl.library_network;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/1/11 18:33
 * Detail（详情）：网址注解，而不是枚举。减少内存消耗
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.PARAMETER})
public @interface OpenAPI {
    String baseUrl= "http://baobab.kaiyanapp.com/";
    // 发现更多
    String discovery="api/v7/index/tab/discovery";
    // 每日推荐
    String allRec="api/v5/index/tab/allRec";
    // 日报精选
    String feed="api/v5/index/tab/feed";
    // 推荐
    String rec="api/v7/community/tab/rec";
    // 关注
    String follow="api/v6/community/tab/follow";
    // 主题
    String tabList="api/v7/tag/tabList";
    // 通知
    String messages="api/v3/messages";
    // 互动
    String list="api/v7/topic/list";
    // 相关推荐
    String videoRelated="api/v4/video/related?id=186856";
    // 评论
    String videoReply="api/v2/replies/video?videoId=186856";
}
