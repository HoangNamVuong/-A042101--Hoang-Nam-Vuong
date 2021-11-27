package dictionary.service;

import dictionary.model.Dictionary;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class DictionaryServiceImpl {
  private static Map<Integer, Dictionary> dictonaryMap = new HashMap<>();
  static {
      dictonaryMap.put(1,new Dictionary("hello","xin chao"));
      dictonaryMap.put(2,new Dictionary("dog","cho"));
      dictonaryMap.put(3,new Dictionary("cat","meo"));
      dictonaryMap.put(4,new Dictionary("good bye","tam biet"));
  }

  public List<Dictionary> findAll() {
      return new ArrayList<>(dictonaryMap.values());
  }
}
