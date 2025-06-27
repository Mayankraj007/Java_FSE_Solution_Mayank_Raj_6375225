package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Arrange: create mock and stub method
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act: inject mock into service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert: verify behavior and result
        assertEquals("Mock Data", result);
        verify(mockApi).getData();
    }
}
