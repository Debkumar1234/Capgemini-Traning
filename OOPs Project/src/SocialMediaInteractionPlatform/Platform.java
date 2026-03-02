package SocialMediaInteractionPlatform;

import java.util.Map;
import java.util.HashMap;

public class Platform {
	private Map<Integer, User> users = new HashMap<>();
	
	public void addUser(Integer id, String name) {
		users.put(id, new User(id, name));
		System.out.println(name + " added successfully.");
	}
	
	public void follow(Integer followerId, Integer followeeId) {
		User follower = users.get(followerId);
		User followee = users.get(followeeId);
		
		follower.follow(followee);
		
		System.out.println(follower.name + " is now following "+ followee.name + ".");
	}
	
	public void unfollow(Integer followerId, Integer followeeId) {
		User follower = users.get(followerId);
		User followee = users.get(followeeId);
		
		follower.unfollow(followee);
		
		System.out.println(follower.name + " has unnfollowed "+ followee.name + ".");
	}
	
	public void post(Integer userId, String content) {
		User user = users.get(userId);
		user.post(content);
	}
 }
