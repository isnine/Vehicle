package name.wxz.modle;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobUser;

/**
 * Created by Nikcn on 2016/5/10.
 */
@SuppressWarnings("serial")
public class User extends BmobUser {
    //父类以及存在
    // private String id;
    // private String username;
    // private String password;
    private String username;
    private String password;
    private String name;
    private String number;
    private String oilclass;
    private String oil;

/*

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username =username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password =password;
    }
*/


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