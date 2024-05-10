package lab11.iterator.pseudocode;

public interface SocialNetwork {
    public ProfileIterator createFriendsIterator(String profileId);

    public ProfileIterator createCoworkersIterator(String profileId);
}
