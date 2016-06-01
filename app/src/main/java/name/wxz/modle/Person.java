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
    private String oil;
    private String sex;
    private String vehclenumber1;
    private String vehcleclass1;
    private String oilclass1;
    private String vehclenumber2;
    private String vehcleclass2;
    private String oilclass2;
    private String vehclenumber3;
    private String vehcleclass3;
    private String oilclass3;
    private Integer vehcles2;

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


    public String getOil() {
        return oil;
    }
    public void setOil(String oil) {
        this.oil =oil;
    }



    public void setVehcleNumber1(String vehclenumber) {
        this.vehclenumber1 = vehclenumber;
    }

    public void setVehcleclass1(String vehcleclass) {
        this.vehcleclass1 = vehcleclass;
    }

    public void setOilclass1(String oilclass) {
        this.oilclass1 =oilclass;
    }
    public void setVehcleNumber2(String vehclenumber) {
        this.vehclenumber2 = vehclenumber;
    }

    public void setVehcleclass2(String vehcleclass) {
        this.vehcleclass2 = vehcleclass;
    }

    public void setOilclass2(String oilclass) {
        this.oilclass2 =oilclass;
    }
    public void setVehcleNumber3(String vehclenumber) {
        this.vehclenumber3 = vehclenumber;
    }

    public void setVehcleclass3(String vehcleclass) {
        this.vehcleclass3 = vehcleclass;
    }

    public void setOilclass3(String oilclass) {
        this.oilclass3 =oilclass;
    }
}