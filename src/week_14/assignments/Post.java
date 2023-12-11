package week_14.assignments;

import java.util.HashSet;
import java.util.Set;

public class Post {
    private String postId;
    private Set<String> stringSet;
    public Post(String postId){
        this.postId=postId;
        this.stringSet=new HashSet<>();
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void addTag(String tag){
        stringSet.add(tag);
    }
    public void removeTag(String tag){
        stringSet.remove(tag);
    }
    public boolean isExist(String tag){
        return stringSet.contains(tag);
    }
    public String listOfTags(){
        return stringSet.toString();
    }
}
