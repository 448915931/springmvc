package com.tqf.test;

/**
 * Created by Tang-QiFeng on 2019/3/31
 */
public class TestDao {
    private TestBean testBean;

    public String getusername(){
        return testBean.getName();
    }
    public int getnum(){
        return testBean.getNum();
    }

    public TestBean getTestBean() {
        return testBean;
    }

    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }
}
