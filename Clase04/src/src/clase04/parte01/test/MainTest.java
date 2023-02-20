package src.clase04.parte01.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.clase04.parte01.Document;
import src.clase04.parte01.GovernmentEmployee;
import src.clase04.parte01.MinisterGovernmentEmployee;
import src.clase04.parte01.PresidentGovernmentEmployee;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  public void testDeputyReadDocument(){
    System.out.println("---------------------------------------------------------------------------------");
    // Given
    Document document01 = new Document(1,"Test doc level 01");
    GovernmentEmployee employee01 = new DeputyGovernmentEmployee();
    GovernmentEmployee employee02 = new MinisterGovernmentEmployee();
    GovernmentEmployee employee03 = new PresidentGovernmentEmployee();
    employee01.setNextEmployee(employee02);
    employee02.setNextEmployee(employee03);
    boolean expectedMessage = true;
    // When
    boolean obtainedMessage = employee01.processDocument(document01);
    // Then
    Assertions.assertTrue(expectedMessage==obtainedMessage);
  }

  @Test
  public void testMinistryReadDocument(){
    System.out.println("---------------------------------------------------------------------------------");
    // Given
    Document document01 = new Document(2,"Test doc level 02");
    GovernmentEmployee employee01 = new DeputyGovernmentEmployee();
    GovernmentEmployee employee02 = new MinisterGovernmentEmployee();
    GovernmentEmployee employee03 = new PresidentGovernmentEmployee();
    employee01.setNextEmployee(employee02);
    employee02.setNextEmployee(employee03);
    boolean expectedMessage = true;
    // When
    boolean obtainedMessage = employee01.processDocument(document01);
    // Then
    Assertions.assertTrue(expectedMessage==obtainedMessage);
  }

  @Test
  public void testPresidentReadDocument(){
    System.out.println("---------------------------------------------------------------------------------");
    // Given
    Document document01 = new Document(3,"Test doc level 02");
    GovernmentEmployee employee01 = new DeputyGovernmentEmployee();
    GovernmentEmployee employee02 = new MinisterGovernmentEmployee();
    GovernmentEmployee employee03 = new PresidentGovernmentEmployee();
    employee01.setNextEmployee(employee02);
    employee02.setNextEmployee(employee03);
    boolean expectedMessage = true;
    // When
    boolean obtainedMessage = employee01.processDocument(document01);
    // Then
    Assertions.assertTrue(expectedMessage==obtainedMessage);
  }


}