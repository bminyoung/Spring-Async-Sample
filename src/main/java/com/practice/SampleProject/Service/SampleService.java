package com.practice.SampleProject.Service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
	
	@Async
	public void asyncSample(){
		try {
			Thread.sleep(1000);
			System.out.println("Async : Some works during 1 second");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void syncSample(){
		try {
			Thread.sleep(1000);
			System.out.println("Sync : Some works during 1 second");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
