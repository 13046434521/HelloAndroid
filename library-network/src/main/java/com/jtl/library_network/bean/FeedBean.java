package com.jtl.library_network.bean;

import java.util.List;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/1/11 19:54
 * Detail（详情）：首页日报精选
 */
public class FeedBean {

    private Integer count;
    private Integer total;
    private String nextPageUrl;
    private Boolean adExist;
    private List<ItemListDTO> itemList;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public Boolean isAdExist() {
        return adExist;
    }

    public void setAdExist(Boolean adExist) {
        this.adExist = adExist;
    }

    public List<ItemListDTO> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListDTO> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListDTO {
        private String type;
        private DataDTO data;
        private Object trackingData;
        private Object tag;
        private Integer id;
        private Integer adIndex;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataDTO getData() {
            return data;
        }

        public void setData(DataDTO data) {
            this.data = data;
        }

        public Object getTrackingData() {
            return trackingData;
        }

        public void setTrackingData(Object trackingData) {
            this.trackingData = trackingData;
        }

        public Object getTag() {
            return tag;
        }

        public void setTag(Object tag) {
            this.tag = tag;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getAdIndex() {
            return adIndex;
        }

        public void setAdIndex(Integer adIndex) {
            this.adIndex = adIndex;
        }

        public static class DataDTO {
            private String dataType;
            private Integer id;
            private String type;
            private String text;
            private Object subTitle;
            private Object actionUrl;
            private Object adTrack;
            private Object follow;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public Object getSubTitle() {
                return subTitle;
            }

            public void setSubTitle(Object subTitle) {
                this.subTitle = subTitle;
            }

            public Object getActionUrl() {
                return actionUrl;
            }

            public void setActionUrl(Object actionUrl) {
                this.actionUrl = actionUrl;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }

            public Object getFollow() {
                return follow;
            }

            public void setFollow(Object follow) {
                this.follow = follow;
            }
        }
    }
}
