//package exam.security;
//
//import exam.model.User;
//import exam.repository.IUserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@Transactional
//public class MyUserDetailService implements UserDetailsService {
//    @Autowired
//    IUserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByName(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("username not found");
//        }
//        return new  MyUserDetail(user);
//    }
//}
