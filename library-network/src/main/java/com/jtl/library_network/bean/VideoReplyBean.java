package com.jtl.library_network.bean;

import java.util.List;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/1/11 20:01
 * Detail（详情）：视频评论
 */
public class VideoReplyBean {

    private TabInfoDTO tabInfo;

    public TabInfoDTO getTabInfo() {
        return tabInfo;
    }

    public void setTabInfo(TabInfoDTO tabInfo) {
        this.tabInfo = tabInfo;
    }

    public static class TabInfoDTO {
        private Integer defaultIdx;
        private List<TabListDTO> tabList;

        public Integer getDefaultIdx() {
            return defaultIdx;
        }

        public void setDefaultIdx(Integer defaultIdx) {
            this.defaultIdx = defaultIdx;
        }

        public List<TabListDTO> getTabList() {
            return tabList;
        }

        public void setTabList(List<TabListDTO> tabList) {
            this.tabList = tabList;
        }

        public static class TabListDTO {
            private Integer id;
            private String name;
            private String apiUrl;
            private Integer tabType;
            private Integer nameType;
            private Object adTrack;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getApiUrl() {
                return apiUrl;
            }

            public void setApiUrl(String apiUrl) {
                this.apiUrl = apiUrl;
            }

            public Integer getTabType() {
                return tabType;
            }

            public void setTabType(Integer tabType) {
                this.tabType = tabType;
            }

            public Integer getNameType() {
                return nameType;
            }

            public void setNameType(Integer nameType) {
                this.nameType = nameType;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }
        }
    }
}
