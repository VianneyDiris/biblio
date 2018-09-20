package com.batch.app.scheduler;

import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.batch.app.mail.Report;
import com.vianney.ws.gestionrelance.GestionRelance;
import com.vianney.ws.gestionrelance.GestionRelanceService;
import com.vianney.ws.gestionrelance.Pret;

@Component
public class BatchTasklet implements Tasklet {
 
  @Value("${batch.message}") private String message;
  
//  @Autowired
//  private Report report;
 
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
    System.out.println(message);
    GestionRelanceService serviceRelance = new GestionRelanceService();
    GestionRelance service = serviceRelance.getGestionRelancePort();
    
    List<Pret> listNonRendu = service.getListPretNonRendu();
    System.out.println(listNonRendu.get(0).getOuvrage().getTitre());
    //report.sendMail();
    return RepeatStatus.FINISHED;
  }


}
