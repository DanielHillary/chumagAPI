package com.priestdev.chumag.controller;

import com.priestdev.chumag.entity.Notification;
import com.priestdev.chumag.entity.StandardResponse;
import com.priestdev.chumag.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping("/getfarmnotifications")
    public ResponseEntity<StandardResponse> getNotificationAboutFarm(@RequestParam("userId") String userId){
        return notificationService.getNotificationAboutFarm(userId);
    }

    @PutMapping("/updatenotification")
    public ResponseEntity<StandardResponse> updateNotification(@RequestBody Notification notification){
        return notificationService.updateNotification(notification);
    }
    @PostMapping("/markasread")
    public ResponseEntity<StandardResponse> markAsRead(@RequestParam("id") Long id){
        return notificationService.markAsRead(id);
    }
}
