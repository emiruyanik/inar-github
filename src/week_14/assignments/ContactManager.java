package week_14.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactManager {
    private Map<String, String> nameAndPhone;

    public ContactManager() {
        this.nameAndPhone = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        this.nameAndPhone.put(name, phoneNumber);
    }

    public String searchByName(String name) {
        if (this.nameAndPhone.containsKey(name)) {
            return this.nameAndPhone.get(name);
        }
        return "invalid name";
    }

    public String searchByPhone(String phone) {
        List<String> list = new ArrayList<>(this.nameAndPhone.keySet());
        if (this.nameAndPhone.containsValue(phone)) {
            for (String s : list) {
                if (this.nameAndPhone.get(s).equals(phone)) {
                    return s;
                }
            }
        }
        return "invalid phone";
    }
}
