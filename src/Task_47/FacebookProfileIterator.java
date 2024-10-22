package Task_47;

import java.util.List;

class FacebookProfileIterator implements ProfileIterator {
    private List<Profile> profiles;
    private int position;

    public FacebookProfileIterator(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public boolean hasNext() {
        return position < profiles.size();
    }

    public Profile next() {
        return profiles.get(position++);
    }
}
