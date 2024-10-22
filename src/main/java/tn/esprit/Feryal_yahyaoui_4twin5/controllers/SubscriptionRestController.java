package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Subscription;
import tn.esprit.Feryal_yahyaoui_4twin5.services.SubscriptionServicesImpl;

@RequiredArgsConstructor
@RestController
@RequestMapping("/subscription")
public class SubscriptionRestController {
    @Autowired
    private final SubscriptionServicesImpl subscriptionServices;

    @PostMapping("/add") //
    public Subscription saveSubscription(@RequestBody Subscription subscription) {
        return subscriptionServices.addSubscription(subscription);
    }

    @GetMapping("/get/{numSub}")
    public Subscription getSubscription(@PathVariable Long numSub) {
        return subscriptionServices.retrieveSubscription(numSub);
    }
    @PutMapping("/update")
    public Subscription updateSubscription(@RequestBody Subscription subscription) {
        return subscriptionServices.updateSubscription(subscription);
    }
    @DeleteMapping("/delete/{numSubscription}")
    public void deleteSubscription(@PathVariable Long numSubscription) {
        subscriptionServices.removeSubscription(numSubscription);
    }
}
