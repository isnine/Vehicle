package name.wxz.modle;

import cn.bmob.v3.BmobUser;

/**
 * Created by Nikcn on 2016/5/10.
 * 表设置内容：
 * String Name
 * String address
 */
public class Person extends BmobUser {
    private String name;
    private String number;
    private String oilclass;
    private String oil;
    private String sex;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }



    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number =number;
    }

    public String getOilclass() {
        return oilclass;
    }
    public void setOilclass(String oilclass) {
        this.oilclass =oilclass;
    }

    public String getOil() {
        return oil;
    }
    public void setOil(String oil) {
        this.oil =oil;
    }
}