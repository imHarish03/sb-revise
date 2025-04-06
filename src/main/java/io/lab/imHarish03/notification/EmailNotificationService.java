package io.lab.imHarish03.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("emailService")
public class EmailNotificationService implements NotificationService {
	@Override
	public void sendNotification(String message) {
		System.out.println("Email sent: " + message);
	}
}