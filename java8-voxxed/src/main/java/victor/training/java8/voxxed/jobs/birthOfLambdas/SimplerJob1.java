package victor.training.java8.voxxed.jobs.birthOfLambdas;

import victor.training.java8.voxxed.jobs.JobParameters;
import victor.training.java8.voxxed.jobs.JobResults;

public class SimplerJob1 {

	public JobResults doWork(JobParameters params) {
		System.out.println("Do Job1 with params");
		return JobResults.success();
	}

}