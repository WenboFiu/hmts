package unit.testcase.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import edu.fiu.hmts.dao.hmts_repos.FunctionRoleMapper;
import edu.fiu.hmts.dao.hmts_repos.UserMapper;
import edu.fiu.hmts.domain.hmts_repos.FunctionRoleExample;
import edu.fiu.hmts.domain.hmts_repos.FunctionRoleKey;
import edu.fiu.hmts.domain.hmts_repos.User;
import edu.fiu.hmts.domain.hmts_repos.UserExample;
import edu.fiu.hmts.service.impl.UserService;
import edu.fiu.hmts.util.registerstrategy.MobileRegister;
import edu.fiu.hmts.util.registerstrategy.WebRegister;


/**
 * The Class UserServiceTest.
 * 
 * @author  Wenbo Wang
 * @version 1.0, April 2016
 */
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

	/** The user service. */
	@Spy
	@InjectMocks
	UserService userService;
	
	/** The user mapper. */
	@Mock
	UserMapper userMapper;
	
	/** The function role mapper. */
	@Mock
	FunctionRoleMapper functionRoleMapper;
	
	/** The web register. */
	@Mock
	WebRegister webRegister;
	
	/** The mobile register. */
	@Mock
	MobileRegister mobileRegister;
	
	/** The mob user s. */
	User userNU, webUserS, mobUserS;
	
	/** The user list f. */
	List<User> webUserList, mobUserList, userListF;
	
	/** The function role keys2. */
	List<FunctionRoleKey> functionRoleKeys, functionRoleKeys2;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		userNU = new User();
		userNU.setUserId(-1L);
		
		webUserS = new User();
		webUserS.setUsername("peter@gmail.com");
		webUserS.setPassword("123456");
		webUserS.setFirstName("Peter");
		webUserS.setLastName("John");
		webUserS.setPhone("(305)837-4827");
		webUserS.setRole("2");
		
		mobUserS = new User();
		mobUserS.setUsername("david@yahoo.com");
		mobUserS.setPassword("123456");
		mobUserS.setFirstName("David");
		mobUserS.setLastName("Chris");
		mobUserS.setPhone("(305)233-9483");
		mobUserS.setSecQuestionId(1);
		mobUserS.setSecAnswer("Paul");
		mobUserS.setRole("4");
		
		userListF = new ArrayList<>();
		mobUserList = new ArrayList<>();
		webUserList = new ArrayList<>();
		webUserList.add(webUserS);
		mobUserList.add(mobUserS);
		
		functionRoleKeys = new ArrayList<>();
		FunctionRoleKey functionRoleKey1 = new FunctionRoleKey();
		functionRoleKey1.setFunctionId(1);
		functionRoleKeys.add(functionRoleKey1);
		FunctionRoleKey functionRoleKey2 = new FunctionRoleKey();
		functionRoleKey2.setFunctionId(2);
		functionRoleKeys.add(functionRoleKey2);
		
		functionRoleKeys2 = new ArrayList<>();
	}

	/**
	 * Test web register success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testWebRegisterSuccess() {
		Mockito.when(webRegister.register(Mockito.any(String.class), Mockito.any(String.class)
				, Mockito.any(String.class), Mockito.any(String.class), Mockito.any(String.class)
				, Mockito.any(String.class), Mockito.any(int.class), Mockito.any(String.class))).thenReturn(webUserS);
		User user = userService.register("peter@gmail.com", "123456", "Peter"
				, "John", "(305)837-4827", "2", -1, "", 0);
		assertEquals("peter@gmail.com", user.getUsername());
		assertEquals("123456", user.getPassword());
		assertEquals("Peter", user.getFirstName());
		assertEquals("John", user.getLastName());
		assertEquals("(305)837-4827", user.getPhone());
		assertEquals("2", user.getRole());
	}
	
	/**
	 * Test web register no username.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testWebRegisterNoUsername() {
		Mockito.when(webRegister.register(Mockito.any(String.class), Mockito.any(String.class)
				, Mockito.any(String.class), Mockito.any(String.class), Mockito.any(String.class)
				, Mockito.any(String.class), Mockito.any(int.class), Mockito.any(String.class))).thenReturn(userNU);	
		User user = userService.register("", "123456", "Peter"
				, "John", "(305)837-4827", "2", -1, "", 0);
		assertEquals(null, user.getUsername());
		assertEquals(null, user.getPassword());
		assertEquals(null, user.getFirstName());
		assertEquals(null, user.getLastName());
		assertEquals(null, user.getPhone());
		assertEquals(null, user.getRole());
	}
	
	/**
	 * Test mobile register success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testMobileRegisterSuccess() {
		Mockito.when(mobileRegister.register(Mockito.any(String.class), Mockito.any(String.class)
				, Mockito.any(String.class), Mockito.any(String.class), Mockito.any(String.class)
				, Mockito.any(String.class), Mockito.any(int.class), Mockito.any(String.class))).thenReturn(mobUserS);
		User user = userService.register("david@yahoo.com", "123456", "David", "Chris", "(305)233-9483"
				, "4", 1, "Paul", 1);
		assertEquals("david@yahoo.com", user.getUsername());
		assertEquals("123456", user.getPassword());
		assertEquals("David", user.getFirstName());
		assertEquals("Chris", user.getLastName());
		assertEquals("(305)233-9483", user.getPhone());
		assertEquals("4", user.getRole());
		assertEquals(1, user.getSecQuestionId(), 1);
		assertEquals("Paul", user.getSecAnswer());
	}
	
	/**
	 * Test mobile register no username.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testMobileRegisterNoUsername() {
		Mockito.when(mobileRegister.register(Mockito.any(String.class), Mockito.any(String.class)
				, Mockito.any(String.class), Mockito.any(String.class), Mockito.any(String.class)
				, Mockito.any(String.class), Mockito.any(int.class), Mockito.any(String.class))).thenReturn(userNU);
		User user = userService.register("", "123456", "David", "Chris", "(305)233-9483"
				, "4", 1, "Paul", 1);
		assertEquals(null, user.getUsername());
		assertEquals(null, user.getPassword());
		assertEquals(null, user.getFirstName());
		assertEquals(null, user.getLastName());
		assertEquals(null, user.getPhone());
		assertEquals(null, user.getRole());
	}
	
	/**
	 * Test register invalid type.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testRegisterInvalidType() {
		Mockito.when(mobileRegister.register(Mockito.any(String.class), Mockito.any(String.class)
				, Mockito.any(String.class), Mockito.any(String.class), Mockito.any(String.class)
				, Mockito.any(String.class), Mockito.any(int.class), Mockito.any(String.class))).thenReturn(userNU);
		User user = userService.register("", "123456", "David", "Chris", "(305)233-9483"
				, "4", 1, "Paul", -1);
		assertEquals(null, user.getUsername());
		assertEquals(null, user.getPassword());
		assertEquals(null, user.getFirstName());
		assertEquals(null, user.getLastName());
		assertEquals(null, user.getPhone());
		assertEquals(null, user.getRole());
	}

	/**
	 * Test login web success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testLoginWebSuccess() {
		try {
			Mockito.when(userMapper.selectByExample(Mockito.any())).thenReturn(webUserList);
			Mockito.doReturn("1,2,").when(userService).rolesControl(Mockito.any());
			User user = userService.login("peter@gmail.com", "123456", 0);
			assertEquals("peter@gmail.com", user.getUsername());
			assertEquals("123456", user.getPassword());
			assertEquals("2", user.getRole());
			assertEquals("1,2,", user.getTag());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Test login web failed.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testLoginWebFailed() {
		Mockito.when(userMapper.selectByExample(Mockito.any())).thenReturn(userListF);
		User user = userService.login("peter@gmail.com", "111111", 0);
		assertEquals(-1L, user.getUserId(), 1);
		assertEquals(null, user.getUsername());
		assertEquals(null, user.getPassword());
		assertEquals(null, user.getRole());
	}
	
	/**
	 * Test login mob success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testLoginMobSuccess() {
		Mockito.when(userMapper.selectByExample(Mockito.any(UserExample.class))).thenReturn(mobUserList);
		Mockito.doReturn("").when(userService).rolesControl(Mockito.any());
		User user = userService.login("david@yahoo.com", "123456", 1);
		assertEquals("david@yahoo.com", user.getUsername());
		assertEquals("123456", user.getPassword());
		assertEquals("4", user.getRole());
	}
	
	/**
	 * Test login mob failed.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testLoginMobFailed() {
		Mockito.when(userMapper.selectByExample(Mockito.any(UserExample.class))).thenReturn(userListF);
		User user = userService.login("david@yahoo.com", "111111", 1);
		assertEquals(-1L, user.getUserId(), 1);
		assertEquals(null, user.getUsername());
		assertEquals(null, user.getPassword());
		assertEquals(null, user.getRole());
	}
	
	/**
	 * Test login invalid type.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testLoginInvalidType() {
		Mockito.when(userMapper.selectByExample(Mockito.any())).thenReturn(userListF);
		User user = userService.login("peter@gmail.com", "111111", -1);
		assertEquals(-1L, user.getUserId(), 1);
		assertEquals(null, user.getUsername());
		assertEquals(null, user.getPassword());
		assertEquals(null, user.getRole());
	}

	/**
	 * Test logout.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testLogout() {
		boolean res = userService.logout(1);
		assertEquals(true, res);
	}

	/**
	 * Test roles control.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testRolesControl() {
		Mockito.when(functionRoleMapper.selectByExample(Mockito.any(FunctionRoleExample.class))).thenReturn(functionRoleKeys);
		String res = userService.rolesControl(webUserS);
		assertEquals("1,2,", res);
	}
	
	/**
	 * Test display users success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testDisplayUsersSuccess() {
		Mockito.when(userMapper.selectByExample(Mockito.any())).thenReturn(webUserList);
		List<User> list = userService.displayUsers();
		assertEquals(1, list.size());
		assertEquals("peter@gmail.com", list.get(0).getUsername());
		assertEquals("Peter", list.get(0).getFirstName());
		assertEquals("John", list.get(0).getLastName());
		assertEquals("(305)837-4827", list.get(0).getPhone());
		assertEquals("2", list.get(0).getRole());
	}
	
	/**
	 * Test display users no user.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testDisplayUsersNoUser() {
		Mockito.when(userMapper.selectByExample(Mockito.any())).thenReturn(userListF);
		List<User> list = userService.displayUsers();
		assertEquals(0, list.size());
	}
}
