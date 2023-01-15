package com.jtl.library_network.bean;

import java.util.List;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/1/11 18:57
 * Detail（详情）：首页发现更多
 */
public class DiscoveryBean {

    private Integer count;
    private Integer total;
    private Object nextPageUrl;
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

    public Object getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(Object nextPageUrl) {
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
            private Integer count;
            private List<ItemListDTO> itemList;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public Integer getCount() {
                return count;
            }

            public void setCount(Integer count) {
                this.count = count;
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
                    private String title;
                    private String description;
                    private String image;
                    private String actionUrl;
                    private Boolean shade;
                    private LabelDTO label;
                    private HeaderDTO header;
                    private Boolean autoPlay;
                    private List<?> adTrack;
                    private List<?> labelList;

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

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public String getActionUrl() {
                        return actionUrl;
                    }

                    public void setActionUrl(String actionUrl) {
                        this.actionUrl = actionUrl;
                    }

                    public Boolean isShade() {
                        return shade;
                    }

                    public void setShade(Boolean shade) {
                        this.shade = shade;
                    }

                    public LabelDTO getLabel() {
                        return label;
                    }

                    public void setLabel(LabelDTO label) {
                        this.label = label;
                    }

                    public HeaderDTO getHeader() {
                        return header;
                    }

                    public void setHeader(HeaderDTO header) {
                        this.header = header;
                    }

                    public Boolean isAutoPlay() {
                        return autoPlay;
                    }

                    public void setAutoPlay(Boolean autoPlay) {
                        this.autoPlay = autoPlay;
                    }

                    public List<?> getAdTrack() {
                        return adTrack;
                    }

                    public void setAdTrack(List<?> adTrack) {
                        this.adTrack = adTrack;
                    }

                    public List<?> getLabelList() {
                        return labelList;
                    }

                    public void setLabelList(List<?> labelList) {
                        this.labelList = labelList;
                    }

                    public static class LabelDTO {
                        private String text;
                        private String card;
                        private Object detail;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getCard() {
                            return card;
                        }

                        public void setCard(String card) {
                            this.card = card;
                        }

                        public Object getDetail() {
                            return detail;
                        }

                        public void setDetail(Object detail) {
                            this.detail = detail;
                        }
                    }

                    public static class HeaderDTO {
                        private Integer id;
                        private Object title;
                        private Object font;
                        private Object subTitle;
                        private Object subTitleFont;
                        private String textAlign;
                        private Object cover;
                        private Object label;
                        private Object actionUrl;
                        private Object labelList;
                        private Object rightText;
                        private Object icon;
                        private Object description;

                        public Integer getId() {
                            return id;
                        }

                        public void setId(Integer id) {
                            this.id = id;
                        }

                        public Object getTitle() {
                            return title;
                        }

                        public void setTitle(Object title) {
                            this.title = title;
                        }

                        public Object getFont() {
                            return font;
                        }

                        public void setFont(Object font) {
                            this.font = font;
                        }

                        public Object getSubTitle() {
                            return subTitle;
                        }

                        public void setSubTitle(Object subTitle) {
                            this.subTitle = subTitle;
                        }

                        public Object getSubTitleFont() {
                            return subTitleFont;
                        }

                        public void setSubTitleFont(Object subTitleFont) {
                            this.subTitleFont = subTitleFont;
                        }

                        public String getTextAlign() {
                            return textAlign;
                        }

                        public void setTextAlign(String textAlign) {
                            this.textAlign = textAlign;
                        }

                        public Object getCover() {
                            return cover;
                        }

                        public void setCover(Object cover) {
                            this.cover = cover;
                        }

                        public Object getLabel() {
                            return label;
                        }

                        public void setLabel(Object label) {
                            this.label = label;
                        }

                        public Object getActionUrl() {
                            return actionUrl;
                        }

                        public void setActionUrl(Object actionUrl) {
                            this.actionUrl = actionUrl;
                        }

                        public Object getLabelList() {
                            return labelList;
                        }

                        public void setLabelList(Object labelList) {
                            this.labelList = labelList;
                        }

                        public Object getRightText() {
                            return rightText;
                        }

                        public void setRightText(Object rightText) {
                            this.rightText = rightText;
                        }

                        public Object getIcon() {
                            return icon;
                        }

                        public void setIcon(Object icon) {
                            this.icon = icon;
                        }

                        public Object getDescription() {
                            return description;
                        }

                        public void setDescription(Object description) {
                            this.description = description;
                        }
                    }
                }
            }
        }
    }
}
