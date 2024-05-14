package es.sanclemente.cd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

public class UserServiceTest {

@Test
public void CasoFeliz() {
UserRepository userRepository = mock(UserRepository.class);
UserService userService = new UserService(userRepository);
when(userRepository.saveUser(any(User.class))).thenReturn(true);
boolean result = userService.createUser("usuario", "usuario@ejemplo.com");
assertTrue(result);
}

@Test
public void UsuarioVacio() {
UserRepository userRepository = mock(UserRepository.class);
UserService userService = new UserService(userRepository);
assertFalse(userService.createUser(null, "usuario@ejemplo.com"));
}

@Test
public void contraseñaVacia() {
UserRepository userRepository = mock(UserRepository.class);
UserService userService = new UserService(userRepository);
assertFalse(userService.createUser("usuario", null));
}

@Test
public void AmbosVacios() {
UserRepository userRepository = mock(UserRepository.class);
UserService userService = new UserService(userRepository);
assertFalse(userService.createUser(null, null));
}
}