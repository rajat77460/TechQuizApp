//sab kuch static, one time memory allocation
package techquizapp.pojo;
public class UserProfile {
    private static String userid;
    private static String usertype;

    public static String getUserid() {
        return userid;
    }

    public static void setUserid(String userid) {
        UserProfile.userid = userid;
    }

    public static String getUsertype() {
        return usertype;
    }

    public static void setUsertype(String usertype) {
        UserProfile.usertype = usertype;
    }   

}