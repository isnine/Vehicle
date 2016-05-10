package name.wxz.modle;

import cn.bmob.v3.BmobObject;

/**
 * Created by Nikcn on 2016/5/10.
 */
public class User extends BmobObject {
    //父类以及存在
    // private String id;
    // private String username;
    // private String password;

    private String name;
    private String number;
    private String oilclass;
    private String oil;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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