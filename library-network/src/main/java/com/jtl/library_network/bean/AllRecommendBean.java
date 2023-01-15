package com.jtl.library_network.bean;

import java.util.List;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/1/11 19:06
 * Detail（详情）：首页推荐
 */
public class AllRecommendBean {
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
        private DataDTOXX data;
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

        public DataDTOXX getData() {
            return data;
        }

        public void setData(DataDTOXX data) {
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

        public static class DataDTOXX {
            private String dataType;
            private HeaderDTO header;
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

            public HeaderDTO getHeader() {
                return header;
            }

            public void setHeader(HeaderDTO header) {
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

            public static class HeaderDTO {
                private Integer id;
                private String title;
                private String font;
                private String subTitle;
                private String subTitleFont;
                private String textAlign;
                private Object cover;
                private Object label;
                private String actionUrl;
                private Object labelList;
                private String rightText;

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

                public String getFont() {
                    return font;
                }

                public void setFont(String font) {
                    this.font = font;
                }

                public String getSubTitle() {
                    return subTitle;
                }

                public void setSubTitle(String subTitle) {
                    this.subTitle = subTitle;
                }

                public String getSubTitleFont() {
                    return subTitleFont;
                }

                public void setSubTitleFont(String subTitleFont) {
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

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getLabelList() {
                    return labelList;
                }

                public void setLabelList(Object labelList) {
                    this.labelList = labelList;
                }

                public String getRightText() {
                    return rightText;
                }

                public void setRightText(String rightText) {
                    this.rightText = rightText;
                }
            }

            public static class ItemListDTO {
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
                    private HeaderDTOX header;
                    private ContentDTO content;
                    private List<?> adTrack;

                    public String getDataType() {
                        return dataType;
                    }

                    public void setDataType(String dataType) {
                        this.dataType = dataType;
                    }

                    public HeaderDTOX getHeader() {
                        return header;
                    }

                    public void setHeader(HeaderDTOX header) {
                        this.header = header;
                    }

                    public ContentDTO getContent() {
                        return content;
                    }

                    public void setContent(ContentDTO content) {
                        this.content = content;
                    }

                    public List<?> getAdTrack() {
                        return adTrack;
                    }

                    public void setAdTrack(List<?> adTrack) {
                        this.adTrack = adTrack;
                    }

                    public static class HeaderDTOX {
                        private Integer id;
                        private String title;
                        private Object font;
                        private Object subTitle;
                        private Object subTitleFont;
                        private String textAlign;
                        private Object cover;
                        private Object label;
                        private String actionUrl;
                        private Object labelList;
                        private Object rightText;
                        private String icon;
                        private String iconType;
                        private Object description;
                        private Long time;
                        private Boolean showHateVideo;

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

                        public String getActionUrl() {
                            return actionUrl;
                        }

                        public void setActionUrl(String actionUrl) {
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

                        public String getIcon() {
                            return icon;
                        }

                        public void setIcon(String icon) {
                            this.icon = icon;
                        }

                        public String getIconType() {
                            return iconType;
                        }

                        public void setIconType(String iconType) {
                            this.iconType = iconType;
                        }

                        public Object getDescription() {
                            return description;
                        }

                        public void setDescription(Object description) {
                            this.description = description;
                        }

                        public Long getTime() {
                            return time;
                        }

                        public void setTime(Long time) {
                            this.time = time;
                        }

                        public Boolean isShowHateVideo() {
                            return showHateVideo;
                        }

                        public void setShowHateVideo(Boolean showHateVideo) {
                            this.showHateVideo = showHateVideo;
                        }
                    }

                    public static class ContentDTO {
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
                            private String library;
                            private ConsumptionDTO consumption;
                            private String resourceType;
                            private Object slogan;
                            private ProviderDTO provider;
                            private String category;
                            private AuthorDTO author;
                            private CoverDTO cover;
                            private String playUrl;
                            private Object thumbPlayUrl;
                            private Integer duration;
                            private WebUrlDTO webUrl;
                            private Long releaseTime;
                            private Object campaign;
                            private Object waterMarks;
                            private Boolean ad;
                            private String type;
                            private String titlePgc;
                            private String descriptionPgc;
                            private Object remark;
                            private Boolean ifLimitVideo;
                            private Integer searchWeight;
                            private Object brandWebsiteInfo;
                            private VideoPosterBeanDTO videoPosterBean;
                            private Integer idx;
                            private Object shareAdTrack;
                            private Object favoriteAdTrack;
                            private Object webAdTrack;
                            private Long date;
                            private Object promotion;
                            private Object label;
                            private String descriptionEditor;
                            private Boolean collected;
                            private Boolean reallyCollected;
                            private Boolean played;
                            private Object lastViewTime;
                            private Object playlists;
                            private Object src;
                            private Object recallSource;
                            private Object recall_source;
                            private List<TagsDTO> tags;
                            private List<?> playInfo;
                            private List<?> adTrack;
                            private List<?> labelList;
                            private List<?> subtitles;

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

                            public String getLibrary() {
                                return library;
                            }

                            public void setLibrary(String library) {
                                this.library = library;
                            }

                            public ConsumptionDTO getConsumption() {
                                return consumption;
                            }

                            public void setConsumption(ConsumptionDTO consumption) {
                                this.consumption = consumption;
                            }

                            public String getResourceType() {
                                return resourceType;
                            }

                            public void setResourceType(String resourceType) {
                                this.resourceType = resourceType;
                            }

                            public Object getSlogan() {
                                return slogan;
                            }

                            public void setSlogan(Object slogan) {
                                this.slogan = slogan;
                            }

                            public ProviderDTO getProvider() {
                                return provider;
                            }

                            public void setProvider(ProviderDTO provider) {
                                this.provider = provider;
                            }

                            public String getCategory() {
                                return category;
                            }

                            public void setCategory(String category) {
                                this.category = category;
                            }

                            public AuthorDTO getAuthor() {
                                return author;
                            }

                            public void setAuthor(AuthorDTO author) {
                                this.author = author;
                            }

                            public CoverDTO getCover() {
                                return cover;
                            }

                            public void setCover(CoverDTO cover) {
                                this.cover = cover;
                            }

                            public String getPlayUrl() {
                                return playUrl;
                            }

                            public void setPlayUrl(String playUrl) {
                                this.playUrl = playUrl;
                            }

                            public Object getThumbPlayUrl() {
                                return thumbPlayUrl;
                            }

                            public void setThumbPlayUrl(Object thumbPlayUrl) {
                                this.thumbPlayUrl = thumbPlayUrl;
                            }

                            public Integer getDuration() {
                                return duration;
                            }

                            public void setDuration(Integer duration) {
                                this.duration = duration;
                            }

                            public WebUrlDTO getWebUrl() {
                                return webUrl;
                            }

                            public void setWebUrl(WebUrlDTO webUrl) {
                                this.webUrl = webUrl;
                            }

                            public Long getReleaseTime() {
                                return releaseTime;
                            }

                            public void setReleaseTime(Long releaseTime) {
                                this.releaseTime = releaseTime;
                            }

                            public Object getCampaign() {
                                return campaign;
                            }

                            public void setCampaign(Object campaign) {
                                this.campaign = campaign;
                            }

                            public Object getWaterMarks() {
                                return waterMarks;
                            }

                            public void setWaterMarks(Object waterMarks) {
                                this.waterMarks = waterMarks;
                            }

                            public Boolean isAd() {
                                return ad;
                            }

                            public void setAd(Boolean ad) {
                                this.ad = ad;
                            }

                            public String getType() {
                                return type;
                            }

                            public void setType(String type) {
                                this.type = type;
                            }

                            public String getTitlePgc() {
                                return titlePgc;
                            }

                            public void setTitlePgc(String titlePgc) {
                                this.titlePgc = titlePgc;
                            }

                            public String getDescriptionPgc() {
                                return descriptionPgc;
                            }

                            public void setDescriptionPgc(String descriptionPgc) {
                                this.descriptionPgc = descriptionPgc;
                            }

                            public Object getRemark() {
                                return remark;
                            }

                            public void setRemark(Object remark) {
                                this.remark = remark;
                            }

                            public Boolean isIfLimitVideo() {
                                return ifLimitVideo;
                            }

                            public void setIfLimitVideo(Boolean ifLimitVideo) {
                                this.ifLimitVideo = ifLimitVideo;
                            }

                            public Integer getSearchWeight() {
                                return searchWeight;
                            }

                            public void setSearchWeight(Integer searchWeight) {
                                this.searchWeight = searchWeight;
                            }

                            public Object getBrandWebsiteInfo() {
                                return brandWebsiteInfo;
                            }

                            public void setBrandWebsiteInfo(Object brandWebsiteInfo) {
                                this.brandWebsiteInfo = brandWebsiteInfo;
                            }

                            public VideoPosterBeanDTO getVideoPosterBean() {
                                return videoPosterBean;
                            }

                            public void setVideoPosterBean(VideoPosterBeanDTO videoPosterBean) {
                                this.videoPosterBean = videoPosterBean;
                            }

                            public Integer getIdx() {
                                return idx;
                            }

                            public void setIdx(Integer idx) {
                                this.idx = idx;
                            }

                            public Object getShareAdTrack() {
                                return shareAdTrack;
                            }

                            public void setShareAdTrack(Object shareAdTrack) {
                                this.shareAdTrack = shareAdTrack;
                            }

                            public Object getFavoriteAdTrack() {
                                return favoriteAdTrack;
                            }

                            public void setFavoriteAdTrack(Object favoriteAdTrack) {
                                this.favoriteAdTrack = favoriteAdTrack;
                            }

                            public Object getWebAdTrack() {
                                return webAdTrack;
                            }

                            public void setWebAdTrack(Object webAdTrack) {
                                this.webAdTrack = webAdTrack;
                            }

                            public Long getDate() {
                                return date;
                            }

                            public void setDate(Long date) {
                                this.date = date;
                            }

                            public Object getPromotion() {
                                return promotion;
                            }

                            public void setPromotion(Object promotion) {
                                this.promotion = promotion;
                            }

                            public Object getLabel() {
                                return label;
                            }

                            public void setLabel(Object label) {
                                this.label = label;
                            }

                            public String getDescriptionEditor() {
                                return descriptionEditor;
                            }

                            public void setDescriptionEditor(String descriptionEditor) {
                                this.descriptionEditor = descriptionEditor;
                            }

                            public Boolean isCollected() {
                                return collected;
                            }

                            public void setCollected(Boolean collected) {
                                this.collected = collected;
                            }

                            public Boolean isReallyCollected() {
                                return reallyCollected;
                            }

                            public void setReallyCollected(Boolean reallyCollected) {
                                this.reallyCollected = reallyCollected;
                            }

                            public Boolean isPlayed() {
                                return played;
                            }

                            public void setPlayed(Boolean played) {
                                this.played = played;
                            }

                            public Object getLastViewTime() {
                                return lastViewTime;
                            }

                            public void setLastViewTime(Object lastViewTime) {
                                this.lastViewTime = lastViewTime;
                            }

                            public Object getPlaylists() {
                                return playlists;
                            }

                            public void setPlaylists(Object playlists) {
                                this.playlists = playlists;
                            }

                            public Object getSrc() {
                                return src;
                            }

                            public void setSrc(Object src) {
                                this.src = src;
                            }

                            public Object getRecallSource() {
                                return recallSource;
                            }

                            public void setRecallSource(Object recallSource) {
                                this.recallSource = recallSource;
                            }

                            public Object getRecall_source() {
                                return recall_source;
                            }

                            public void setRecall_source(Object recall_source) {
                                this.recall_source = recall_source;
                            }

                            public List<TagsDTO> getTags() {
                                return tags;
                            }

                            public void setTags(List<TagsDTO> tags) {
                                this.tags = tags;
                            }

                            public List<?> getPlayInfo() {
                                return playInfo;
                            }

                            public void setPlayInfo(List<?> playInfo) {
                                this.playInfo = playInfo;
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

                            public List<?> getSubtitles() {
                                return subtitles;
                            }

                            public void setSubtitles(List<?> subtitles) {
                                this.subtitles = subtitles;
                            }

                            public static class ConsumptionDTO {
                                private Integer collectionCount;
                                private Integer shareCount;
                                private Integer replyCount;
                                private Integer realCollectionCount;

                                public Integer getCollectionCount() {
                                    return collectionCount;
                                }

                                public void setCollectionCount(Integer collectionCount) {
                                    this.collectionCount = collectionCount;
                                }

                                public Integer getShareCount() {
                                    return shareCount;
                                }

                                public void setShareCount(Integer shareCount) {
                                    this.shareCount = shareCount;
                                }

                                public Integer getReplyCount() {
                                    return replyCount;
                                }

                                public void setReplyCount(Integer replyCount) {
                                    this.replyCount = replyCount;
                                }

                                public Integer getRealCollectionCount() {
                                    return realCollectionCount;
                                }

                                public void setRealCollectionCount(Integer realCollectionCount) {
                                    this.realCollectionCount = realCollectionCount;
                                }
                            }

                            public static class ProviderDTO {
                                private String name;
                                private String alias;
                                private String icon;

                                public String getName() {
                                    return name;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public String getAlias() {
                                    return alias;
                                }

                                public void setAlias(String alias) {
                                    this.alias = alias;
                                }

                                public String getIcon() {
                                    return icon;
                                }

                                public void setIcon(String icon) {
                                    this.icon = icon;
                                }
                            }

                            public static class AuthorDTO {
                                private Integer id;
                                private String icon;
                                private String name;
                                private String description;
                                private String link;
                                private Long latestReleaseTime;
                                private Integer videoNum;
                                private Object adTrack;
                                private FollowDTO follow;
                                private ShieldDTO shield;
                                private Integer approvedNotReadyVideoCount;
                                private Boolean ifPgc;
                                private Integer recSort;
                                private Boolean expert;

                                public Integer getId() {
                                    return id;
                                }

                                public void setId(Integer id) {
                                    this.id = id;
                                }

                                public String getIcon() {
                                    return icon;
                                }

                                public void setIcon(String icon) {
                                    this.icon = icon;
                                }

                                public String getName() {
                                    return name;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public String getDescription() {
                                    return description;
                                }

                                public void setDescription(String description) {
                                    this.description = description;
                                }

                                public String getLink() {
                                    return link;
                                }

                                public void setLink(String link) {
                                    this.link = link;
                                }

                                public Long getLatestReleaseTime() {
                                    return latestReleaseTime;
                                }

                                public void setLatestReleaseTime(Long latestReleaseTime) {
                                    this.latestReleaseTime = latestReleaseTime;
                                }

                                public Integer getVideoNum() {
                                    return videoNum;
                                }

                                public void setVideoNum(Integer videoNum) {
                                    this.videoNum = videoNum;
                                }

                                public Object getAdTrack() {
                                    return adTrack;
                                }

                                public void setAdTrack(Object adTrack) {
                                    this.adTrack = adTrack;
                                }

                                public FollowDTO getFollow() {
                                    return follow;
                                }

                                public void setFollow(FollowDTO follow) {
                                    this.follow = follow;
                                }

                                public ShieldDTO getShield() {
                                    return shield;
                                }

                                public void setShield(ShieldDTO shield) {
                                    this.shield = shield;
                                }

                                public Integer getApprovedNotReadyVideoCount() {
                                    return approvedNotReadyVideoCount;
                                }

                                public void setApprovedNotReadyVideoCount(Integer approvedNotReadyVideoCount) {
                                    this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
                                }

                                public Boolean isIfPgc() {
                                    return ifPgc;
                                }

                                public void setIfPgc(Boolean ifPgc) {
                                    this.ifPgc = ifPgc;
                                }

                                public Integer getRecSort() {
                                    return recSort;
                                }

                                public void setRecSort(Integer recSort) {
                                    this.recSort = recSort;
                                }

                                public Boolean isExpert() {
                                    return expert;
                                }

                                public void setExpert(Boolean expert) {
                                    this.expert = expert;
                                }

                                public static class FollowDTO {
                                    private String itemType;
                                    private Integer itemId;
                                    private Boolean followed;

                                    public String getItemType() {
                                        return itemType;
                                    }

                                    public void setItemType(String itemType) {
                                        this.itemType = itemType;
                                    }

                                    public Integer getItemId() {
                                        return itemId;
                                    }

                                    public void setItemId(Integer itemId) {
                                        this.itemId = itemId;
                                    }

                                    public Boolean isFollowed() {
                                        return followed;
                                    }

                                    public void setFollowed(Boolean followed) {
                                        this.followed = followed;
                                    }
                                }

                                public static class ShieldDTO {
                                    private String itemType;
                                    private Integer itemId;
                                    private Boolean shielded;

                                    public String getItemType() {
                                        return itemType;
                                    }

                                    public void setItemType(String itemType) {
                                        this.itemType = itemType;
                                    }

                                    public Integer getItemId() {
                                        return itemId;
                                    }

                                    public void setItemId(Integer itemId) {
                                        this.itemId = itemId;
                                    }

                                    public Boolean isShielded() {
                                        return shielded;
                                    }

                                    public void setShielded(Boolean shielded) {
                                        this.shielded = shielded;
                                    }
                                }
                            }

                            public static class CoverDTO {
                                private String feed;
                                private String detail;
                                private String blurred;
                                private Object sharing;
                                private Object homepage;

                                public String getFeed() {
                                    return feed;
                                }

                                public void setFeed(String feed) {
                                    this.feed = feed;
                                }

                                public String getDetail() {
                                    return detail;
                                }

                                public void setDetail(String detail) {
                                    this.detail = detail;
                                }

                                public String getBlurred() {
                                    return blurred;
                                }

                                public void setBlurred(String blurred) {
                                    this.blurred = blurred;
                                }

                                public Object getSharing() {
                                    return sharing;
                                }

                                public void setSharing(Object sharing) {
                                    this.sharing = sharing;
                                }

                                public Object getHomepage() {
                                    return homepage;
                                }

                                public void setHomepage(Object homepage) {
                                    this.homepage = homepage;
                                }
                            }

                            public static class WebUrlDTO {
                                private String raw;
                                private String forWeibo;

                                public String getRaw() {
                                    return raw;
                                }

                                public void setRaw(String raw) {
                                    this.raw = raw;
                                }

                                public String getForWeibo() {
                                    return forWeibo;
                                }

                                public void setForWeibo(String forWeibo) {
                                    this.forWeibo = forWeibo;
                                }
                            }

                            public static class VideoPosterBeanDTO {
                                private Double scale;
                                private String url;
                                private String fileSizeStr;

                                public Double getScale() {
                                    return scale;
                                }

                                public void setScale(Double scale) {
                                    this.scale = scale;
                                }

                                public String getUrl() {
                                    return url;
                                }

                                public void setUrl(String url) {
                                    this.url = url;
                                }

                                public String getFileSizeStr() {
                                    return fileSizeStr;
                                }

                                public void setFileSizeStr(String fileSizeStr) {
                                    this.fileSizeStr = fileSizeStr;
                                }
                            }

                            public static class TagsDTO {
                                private Integer id;
                                private String name;
                                private String actionUrl;
                                private Object adTrack;
                                private String desc;
                                private String bgPicture;
                                private String headerImage;
                                private String tagRecType;
                                private Object childTagList;
                                private Object childTagIdList;
                                private Boolean haveReward;
                                private Boolean ifNewest;
                                private Object newestEndTime;
                                private Integer communityIndex;

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

                                public String getActionUrl() {
                                    return actionUrl;
                                }

                                public void setActionUrl(String actionUrl) {
                                    this.actionUrl = actionUrl;
                                }

                                public Object getAdTrack() {
                                    return adTrack;
                                }

                                public void setAdTrack(Object adTrack) {
                                    this.adTrack = adTrack;
                                }

                                public String getDesc() {
                                    return desc;
                                }

                                public void setDesc(String desc) {
                                    this.desc = desc;
                                }

                                public String getBgPicture() {
                                    return bgPicture;
                                }

                                public void setBgPicture(String bgPicture) {
                                    this.bgPicture = bgPicture;
                                }

                                public String getHeaderImage() {
                                    return headerImage;
                                }

                                public void setHeaderImage(String headerImage) {
                                    this.headerImage = headerImage;
                                }

                                public String getTagRecType() {
                                    return tagRecType;
                                }

                                public void setTagRecType(String tagRecType) {
                                    this.tagRecType = tagRecType;
                                }

                                public Object getChildTagList() {
                                    return childTagList;
                                }

                                public void setChildTagList(Object childTagList) {
                                    this.childTagList = childTagList;
                                }

                                public Object getChildTagIdList() {
                                    return childTagIdList;
                                }

                                public void setChildTagIdList(Object childTagIdList) {
                                    this.childTagIdList = childTagIdList;
                                }

                                public Boolean isHaveReward() {
                                    return haveReward;
                                }

                                public void setHaveReward(Boolean haveReward) {
                                    this.haveReward = haveReward;
                                }

                                public Boolean isIfNewest() {
                                    return ifNewest;
                                }

                                public void setIfNewest(Boolean ifNewest) {
                                    this.ifNewest = ifNewest;
                                }

                                public Object getNewestEndTime() {
                                    return newestEndTime;
                                }

                                public void setNewestEndTime(Object newestEndTime) {
                                    this.newestEndTime = newestEndTime;
                                }

                                public Integer getCommunityIndex() {
                                    return communityIndex;
                                }

                                public void setCommunityIndex(Integer communityIndex) {
                                    this.communityIndex = communityIndex;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
