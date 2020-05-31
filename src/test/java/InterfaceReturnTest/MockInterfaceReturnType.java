package InterfaceReturnTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockInterfaceReturnType {

    @Mock
    public InterfaceReturner interfaceReturner;

    @InjectMocks
    public InvocationTest invocationTest;

    @Before
    public void setup() {
        TestContext testContext1 = new TestContextImpl("Alha", "Hello");
        TestContext testContext2 = new TestContextImpl("AAAAAA", "Hola");

//        Mockito.when(interfaceReturner.getContext()).thenReturn(testContext1);
        Mockito.when(invocationTest.invokeContext()).thenReturn(testContext2);
    }

    @Test
    public void returnTestContext() {
        Assert.assertNotEquals("Alha", interfaceReturner.getContext().getName());
        Assert.assertEquals("Hola", invocationTest.invokeContext().getValue());
    }
}
