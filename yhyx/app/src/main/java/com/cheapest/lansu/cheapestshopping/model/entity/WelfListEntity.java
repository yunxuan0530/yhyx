package com.cheapest.lansu.cheapestshopping.model.entity;

import java.util.List;

/*
* 文件名：WelfListEntity
* 描    述：
* 作    者：lansu
* 时    间：2018/5/16 14:49
* 版    权：lansus
*/
public class WelfListEntity {
    /**
     * datas : [{"id":1,"customerId":1,"money":9.9,"detail":"简单说明","createTime":"2017-12-12 12:12","modifyTime":"2018-12-12 12:12"}]
     * total : 1
     * size : 10
     * page : 1
     * pages : 1
     * curSize : 1
     */

    private int total;
    private int size;
    private int page;
    private int pages;
    private int curSize;
    private List<DatasBean> datas;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCurSize() {
        return curSize;
    }

    public void setCurSize(int curSize) {
        this.curSize = curSize;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * id : 1
         * customerId : 1
         * money : 9.9
         * detail : 简单说明
         * createTime : 2017-12-12 12:12
         * modifyTime : 2018-12-12 12:12
         */

        private int id;
        private int customerId;
        private double money;
        private String detail;
        private String createTime;
        private String modifyTime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCustomerId() {
            return customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
        }
    }
}
