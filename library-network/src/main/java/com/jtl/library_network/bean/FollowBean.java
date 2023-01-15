package com.jtl.library_network.bean;

import java.util.List;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/1/11 19:58
 * Detail（详情）：社区关注
 */
public class FollowBean {

    private Integer count;
    private Integer total;
    private String nextPageUrl;
    private Boolean adExist;
    private List<ItemListDTOX> itemList;

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

    public List<ItemListDTOX> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListDTOX> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListDTOX {
        private String type;
        private DataDTOX data;
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

        public DataDTOX getData() {
            return data;
        }

        public void setData(DataDTOX data) {
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

        public static class DataDTOX {
            private String dataType;
            private Object header;
            private Integer count;
            private Object adTrack;
            private Object footer;
            private List<ItemListDTO> itemList;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public Object getHeader() {
                return header;
            }

            public void setHeader(Object header) {
                this.header = header;
            }

            public Integer getCount() {
                return count;
            }

            public void setCount(Integer count) {
                this.count = count;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }

            public Object getFooter() {
                return footer;
            }

            public void setFooter(Object footer) {
                this.footer = footer;
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
                    private String title;
                    private String subTitle;
                    private String bgPicture;
                    private String actionUrl;

                    public String getDataType() {
                        return dataType;
                    }

                    public void setDataType(String dataType) {
                        this.dataType = dataType;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getSubTitle() {
                        return subTitle;
                    }

                    public void setSubTitle(String subTitle) {
                        this.subTitle = subTitle;
                    }

                    public String getBgPicture() {
                        return bgPicture;
                    }

                    public void setBgPicture(String bgPicture) {
                        this.bgPicture = bgPicture;
                    }

                    public String getActionUrl() {
                        return actionUrl;
                    }

                    public void setActionUrl(String actionUrl) {
                        this.actionUrl = actionUrl;
                    }
                }
            }
        }
    }
}
