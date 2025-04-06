package io.lab.imHarish03.notification;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

	private final Map<String, NotificationService> serviceMap;

	public NotificationManager(@Qualifier("emailService") NotificationService emailService,
			@Qualifier("smsService") NotificationService smsService,
			@Qualifier("slackService") NotificationService slackService) {

		this.serviceMap = new HashMap<>();
		this.serviceMap.put("email", emailService);
		this.serviceMap.put("sms", smsService);
		this.serviceMap.put("slack", slackService);
	}

	public void notify(String type, String message) {
		NotificationService service = serviceMap.get(type.toLowerCase());
		if (service == null) {
			throw new IllegalArgumentException("Invalid Notification Type: " + type);
		}
		service.sendNotification(message);
	}
}
