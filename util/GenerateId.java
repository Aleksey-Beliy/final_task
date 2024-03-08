package edu.training.it.final_task.util;

public final class GenerateId {

	private GenerateId() {
	}

	private static int nextId = 1;

	public static int nextId() {
		return nextId++;
	}

}
