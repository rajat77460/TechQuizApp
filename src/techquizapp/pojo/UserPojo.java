
package techquizapp.pojo;
public class UserPojo {
private String userid;
private String password;
private String usertype;

public UserPojo(){}

    public UserPojo(String userid, String password, String usertype) {
        this.userid = userid;
        this.password = password;
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "UserPojo{" + "userid=" + userid + ", password=" + password + ", usertype=" + usertype + '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }


}
