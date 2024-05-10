package lab11.iterator.pseudocode;

public class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;

    public void config() {
        if (network instanceof Facebook) {
            this.network = new Facebook(null);
        }
        this.spammer = new SocialSpammer(network);
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getName());
        spammer.send(iterator, "Very important message");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getName());
        spammer.send(iterator, "Very important message");
    }
}
