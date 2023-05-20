package orm.training.main;

import orm.training.dao.JobDaoImpl;
import orm.training.entity.Jobs;

public class TestMain {
	public static void main(String[] args) throws Exception {
		JobDaoImpl jobDao = new JobDaoImpl();
		Jobs job = new Jobs("J03", "Java Dev3", 1000, 2000);
		jobDao.save(job);
	}
}
