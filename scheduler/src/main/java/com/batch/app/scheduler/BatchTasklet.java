package com.batch.app.scheduler;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.batch.app.mail.Report;

@Component
public class BatchTasklet implements Tasklet {
 
  @Value("${batch.message}") private String message;
  
  @Autowired
  private Report report;
 
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
    System.out.println(message);
    report.sendMail();
    return RepeatStatus.FINISHED;
  }


}
