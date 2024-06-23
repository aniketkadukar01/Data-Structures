package com.app.tester;

import com.app.queues.LinearQueue;

public class Tester {

	public static void main(String[] args) {
		LinearQueue q = new LinearQueue(4);

        q.insert(10);
        System.out.println(q.delete());

        System.out.println(q.insert(20));
        System.out.println(q.insert(30));
        System.out.println(q.insert(40));
        System.out.println(q.insert(50));

	}

}
