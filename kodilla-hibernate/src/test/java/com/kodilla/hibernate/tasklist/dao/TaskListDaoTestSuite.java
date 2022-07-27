package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test: task";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Learning", "Learn for tomorrow exam.");

        //When
        taskListDao.save(taskList);

        //Then
        String name = taskList.getListName();
        List<TaskList> readTask = taskListDao.findByListName(name);

        //CleanUp
        taskListDao.delete(taskList);


    }
}
