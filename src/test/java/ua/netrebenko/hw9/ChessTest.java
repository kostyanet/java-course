package ua.netrebenko.hw9;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ChessTest {
    @InjectMocks
    Chess unit;

    @Mock
    CoordinatesConverter converterMock;

    @Test
    public void isStepValid_valid1() {
        Mockito.when(converterMock.getXDiff()).thenReturn(1);
        Mockito.when(converterMock.getYDiff()).thenReturn(2);
        boolean result = unit.isStepValid("c3", "b5");
        Assert.assertTrue(result);
    }

    @Test
    public void isStepValid_valid2() {
        Mockito.when(converterMock.getXDiff()).thenReturn(2);
        Mockito.when(converterMock.getYDiff()).thenReturn(1);
        boolean result = unit.isStepValid("c3", "a4");
        Assert.assertTrue(result);
    }

    @Test
    public void isStepValid_invalid1() {
        Mockito.when(converterMock.getXDiff()).thenReturn(2);
        Mockito.when(converterMock.getYDiff()).thenReturn(3);
        boolean result = unit.isStepValid("c3", "a6");
        Assert.assertFalse(result);
    }

    @Test
    public void isStepValid_invalid2() {
        Mockito.when(converterMock.getXDiff()).thenReturn(2);
        Mockito.when(converterMock.getYDiff()).thenReturn(2);
        boolean result = unit.isStepValid("c3", "a5");
        Assert.assertFalse(result);
    }
}
