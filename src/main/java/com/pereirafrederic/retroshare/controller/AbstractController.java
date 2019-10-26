package com.pereirafrederic.retroshare.controller;

import net.bull.javamelody.MonitoredWithSpring;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
@MonitoredWithSpring
public abstract class AbstractController {

}
