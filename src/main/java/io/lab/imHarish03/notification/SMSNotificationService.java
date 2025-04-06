package io.lab.imHarish03.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("smsService")
public class SMSNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("SMS sent: " + message);
	}
}