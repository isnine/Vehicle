package name.wxz.modle;

import cn.bmob.v3.BmobObject;

/**
 * Created by Nikcn on 2016/5/10.
 * 表设置内容：
 * String Name
 * String address
 */
public class Person extends BmobObject {
    private String name;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}