package com.sparta.grr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SpartanRepositoryTest {
    SpartanRepository spartanRepository = new SpartanRepository();
    Spartan mockSpartan1 = Mockito.mock(Spartan.class);
    Spartan mockSpartan2 = Mockito.mock(Spartan.class);

    @BeforeEach
    public void setup(){
        spartanRepository.addSpartan(mockSpartan1);
        spartanRepository.addSpartan(mockSpartan2);
    }

    @Test
    @DisplayName("Test Adding Spartans")
    public void testAddSpartan(){
        Assertions.assertEquals(2,spartanRepository.getNumSpartans());
    }

    @Test
    @DisplayName("Testing find spartan")
    public void testFindSpartan(){
        Mockito.when(mockSpartan2.getId())
                .thenReturn(27);
        Assertions.assertEquals(mockSpartan2, spartanRepository.findSpartan(27));
    }
    @Test
    @DisplayName("Testing get spartans created in the last 24 Hours")
    public void testGetSpartansLast24Hours(){
        Mockito.when(mockSpartan2.getStartDate())
                .thenReturn(LocalDate.now().minusDays(2));
        Mockito.when(mockSpartan1.getStartDate())
                .thenReturn(LocalDate.now())
                .thenReturn(LocalDate.now().minusDays(2));//we can call then return to change the value as it's called for things that may iterate
        ArrayList<Spartan> expected = new ArrayList<>(List.of(mockSpartan1));
        Assertions.assertEquals(expected, spartanRepository.getSpartansCreatedLast24Hours());
    }

    @Test
    @DisplayName("Testing changing a spartans name wrong handles exception")
    public void testChangingASpartansNameWongHandlesException(){
        Mockito.when(mockSpartan1.getId())
                .thenReturn(12);
        Mockito.doThrow(new IllegalArgumentException())
                .when(mockSpartan1)
                .setName(null);

        Assertions.assertFalse(spartanRepository.changeName(12, null));
    }

    @Test
    @DisplayName("Check get Id is called once per spartan")
    public void checkGetIdCalledOncePerSpartan(){
        spartanRepository.findSpartan(20);
        Mockito.verify(mockSpartan1, Mockito.times(1)).getId();
        Mockito.verify(mockSpartan2, Mockito.times(1)).getId();
    }


    @Test
    @DisplayName("Check methods in getAllSpartans are called in order")
    public void checkMethodsInGetAllSpartansAreCalledInOrder(){
        spartanRepository.getAllSpartans();
        InOrder inOrder = Mockito.inOrder(mockSpartan1);
        inOrder.verify(mockSpartan1).getId();
        inOrder.verify(mockSpartan1).getName();
    }

    @Test
    @DisplayName("Test correct parameters into setName")
    public void testCorrectParametersAreAcceptedIntoSetName(){
        Mockito.when(mockSpartan1.getId())
                        .thenReturn(3);
        spartanRepository.changeName(3,"Doris");
        Mockito.verify(mockSpartan1).setName("Doris");
    }





}
