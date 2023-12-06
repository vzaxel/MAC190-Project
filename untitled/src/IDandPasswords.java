import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("axel","1234");
        logininfo.put("Professor","PASSWORD");
        logininfo.put("Axel","1234");
        logininfo.put("Daniel","zxy");
        logininfo.put("john","doe");
        logininfo.put("jane","doe");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
