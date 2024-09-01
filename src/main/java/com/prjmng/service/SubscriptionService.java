package com.prjmng.service;

import com.prjmng.domain.PlanType;
import com.prjmng.model.Subscription;
import com.prjmng.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
