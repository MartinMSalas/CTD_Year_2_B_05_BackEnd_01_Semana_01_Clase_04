package src.clase04.parte02.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.clase04.parte02.Item;
import src.clase04.parte02.WeightQualityAnalist;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  public void testPackageOK(){
    // Given
    Item package01 = new Item("food",1500, 1250,"good" );
    QualityAnalist qa01 = new LotQualityAnalist();
    QualityAnalist qa02 = new WeightQualityAnalist();
    QualityAnalist qa03 = new ContainerQualityAnalist();

    qa01.setNextQualityAnalist(qa02);
    qa02.setNextQualityAnalist(qa03);
    boolean expectedMessage = true;
    // When
    boolean obtainedMessage = qa01.qualityCheck(package01);

    // Then
    Assertions.assertTrue(obtainedMessage);
  }
  @Test
  public void testPackageBadLoot(){
    // Given
    Item package01 = new Item("food",1, 1250,"good" );
    QualityAnalist qa01 = new LotQualityAnalist();
    QualityAnalist qa02 = new WeightQualityAnalist();
    QualityAnalist qa03 = new ContainerQualityAnalist();

    qa01.setNextQualityAnalist(qa02);
    qa02.setNextQualityAnalist(qa03);
    boolean expectedMessage = true;
    // When
    boolean obtainedMessage = qa01.qualityCheck(package01);

    // Then
    Assertions.assertFalse(obtainedMessage);
  }
  @Test
  public void testPackageBadWeight(){
    // Given
    Item package01 = new Item("food",1500, 5000,"good" );
    QualityAnalist qa01 = new LotQualityAnalist();
    QualityAnalist qa02 = new WeightQualityAnalist();
    QualityAnalist qa03 = new ContainerQualityAnalist();

    qa01.setNextQualityAnalist(qa02);
    qa02.setNextQualityAnalist(qa03);
    boolean expectedMessage = true;
    // When
    boolean obtainedMessage = qa01.qualityCheck(package01);

    // Then
    Assertions.assertFalse(obtainedMessage);
  }
  @Test
  public void testPackageBadPackaging(){
    // Given
    Item package01 = new Item("food",1500, 1250,"bad" );
    QualityAnalist qa01 = new LotQualityAnalist();
    QualityAnalist qa02 = new WeightQualityAnalist();
    QualityAnalist qa03 = new ContainerQualityAnalist();

    qa01.setNextQualityAnalist(qa02);
    qa02.setNextQualityAnalist(qa03);

    // When
    boolean obtainedMessage = qa01.qualityCheck(package01);

    // Then
    Assertions.assertFalse(obtainedMessage);
  }

}