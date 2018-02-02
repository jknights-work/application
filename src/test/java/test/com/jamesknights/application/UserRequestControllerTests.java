/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.jamesknights.application;


import com.jamesknights.common.service.ServiceException;
import com.jamesknights.common.user.repository.UserRepository;
import com.jamesknights.common.user.service.impl.LocalUserService;
import static org.aspectj.bridge.MessageUtil.fail;
import org.junit.*;
import static org.junit.Assert.assertNotNull;
import org.junit.runner.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.MockitoAnnotations.initMocks;
import org.springframework.test.context.junit4.SpringRunner;


/**
 *
 * @author James Knights <james@i-studio.co.uk>
 */
@RunWith(SpringRunner.class)    
public class UserRequestControllerTests {
    
    @Mock
    private UserRepository userRepository;
    
    @InjectMocks
    private final LocalUserService userService = new LocalUserService("userService", userRepository);
    
    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }
    
    @Test
    public void testUserRequestController () {
        
        if (!userService.isRunning()) {
            try {
                userService.start();
            } catch (ServiceException e) {
                fail("Unable to start Service", e);
            }
            
            assertNotNull(userService);
            assertNotNull(userRepository);
            
        }
    
    }

    
}
