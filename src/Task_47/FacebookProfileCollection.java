package Task_47;

import java.util.List;
import java.util.ArrayList;

class FacebookProfileCollection implements SocialMediaProfileCollection {
    private List<Profile> profiles = new ArrayList<>();

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public ProfileIterator createIterator() {
        return new FacebookProfileIterator(profiles);
    }
}
