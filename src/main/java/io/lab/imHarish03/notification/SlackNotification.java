package io.lab.imHarish03.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("slack")
public class SlackNotification implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("📢 Slack: " + message);
	}

}
