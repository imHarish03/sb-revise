package io.lab.imHarish03.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("slackService")
//@Profile("slackService")
public class SlackNotification implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("📢 Slack: " + message);
	}

}
