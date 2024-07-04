package com.Core.Java.Collectoin.List;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerExample {
	private static ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		// Producer
		executor.submit(() -> {
			for (int i = 0; i < 10; i++) {
				queue.add(i);
				System.out.println("Produced: " + i);
				try {
					Thread.sleep(100); // Simulate time-consuming task
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});

		// Consumer
		executor.submit(() -> {
			while (true) {
				Integer item = queue.poll();
				if (item != null) {
					System.out.println("Consumed: " + item);
				}
				try {
					Thread.sleep(50); // Simulate time-consuming task
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});

		executor.shutdown();
	}
}
