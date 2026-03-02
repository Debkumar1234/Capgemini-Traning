package SocialMediaInteractionPlatform;

import java.util.HashSet;
import java.util.Set;

public class User {
	int id;
	String name;
	Set<User> followers = new HashSet<User>();
	
	User(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void update(String message, User followee) {
		System.out.println(name + " received notification: " + followee.name + " posted: \"" + message + "\"."); 
	}
	
	public void addFollower(User user) {
		followers.add(user);
	}
	
	public void removeFollower(User user) {
		followers.remove(user);
	}
	
	public void notifyFollowers(String message) {
		for(User follower : followers) {
			follower.update(message, this);
		}
	}
	
	public void post(String content) {
		System.out.println(name + " posted: \"" + content + "\".");
		notifyFollowers(content);
	}
	
	public void follow(User user) {
		user.addFollower(this);
	}
	
	public void unfollow(User user) {
		user.removeFollower(this);
	}
}
