# SI_Lab2_213039

# Control Flow Control ( CFG ) 

![image](https://github.com/VedaNarashanova/SI_Lab2_213039/assets/128639214/40b37459-9be1-4783-a2f6-f3fb07355b6b)

# Цикломатската комплексност

Edges (E):

Е = 24

Nodes (N):

N = 15

Користејќи ја формулата V(G) = E - N + 2, можеме да ја пресметаме цикломатската сложеност:

V(G) = 24 - 15 + 2
V(G) = 11

Цикломатската сложеност на дадениот CFG е 11.

# Every Branch

<table><thead><tr><th>Branch</th><th>Completed</th></tr></thead><tbody><tr><td>[2]</td><td>*</td></tr><tr><td>[4]</td><td>*</td></tr><tr><td>[7]</td><td>*</td></tr><tr><td>[9]</td><td>*</td></tr><tr><td>[11]</td><td>*</td></tr><tr><td>[13]</td><td>*</td></tr><tr><td>[18]</td><td>*</td></tr><tr><td>[20]</td><td>*</td></tr><tr><td>[21]</td><td>*</td></tr><tr><td>[22]</td><td>*</td></tr></tbody></table>

Објаснување:
<ol>
  <li>Гранка [2] се завршува кога условот (user == null || user.getPassword() == null || user.getEmail() == null) е точен.</li>
  <li>Гранка [4] се завршува кога условот user.getUsername() == null е точен.</li>
  <li>Гранка [7] се завршува кога условот user.getEmail().contains("@") && user.getEmail().contains(".") е точен.</li>
  <li>Гранка [9] се завршува кога условот i < allUsers.size() во циклусот е точен.</li>
  <li>Гранка [11] се завршува кога условот existingUser.getEmail() == user.getEmail() е точен.</li>
  <li>Гранка [13] се завршува кога условот existingUser.getUsername() == user.getUsername() е точен.</li>
  <li>Гранка [18] се завршува кога условот passwordLower.contains(user.getUsername().toLowerCase()) || password.length() < 8 е точен.</li>
  <li>Гранка [20] се завршува кога условот !passwordLower.contains(" ") е точен.</li>
  <li>Гранка [21] се завршува кога условот i < specialCharacters.length() во циклусот е точен.</li>
  <li>Гранка [22] се завршува кога условот password.contains(String.valueOf(specialCharacters.charAt(i))) е точен.</li>
</ol>

# Multiple Condition

Multiple Condition критериумот на условот if (user == null || user.getPassword() == null || user.getEmail() == null): 

<ol>
  <li>
    <p>Тест случај за <code>user == null</code>:</p>
    <ul>
      <li>Влез: <code>user = null</code></li>
      <li>Очекуван излез: <code>RuntimeException("Обавезна информација недостасува!")</code></li>
    </ul>
  </li>
  <li>
    <p>Тест случај за <code>user.getPassword() == null</code>:</p>
    <ul>
      <li>Влез: <code>user.getPassword() = null</code></li>
      <li>Очекуван излез: <code>RuntimeException("Обавезна информација недостасува!")</code></li>
    </ul>
  </li>
  <li>
    <p>Тест случај за <code>user.getEmail() == null</code>:</p>
    <ul>
      <li>Влез: <code>user.getEmail() = null</code></li>
      <li>Очекуван излез: <code>RuntimeException("Обавезна информација недостасува!")</code></li>
    </ul>
  </li>
  <li>
    <p>Тест случај за <code>user.getUsername() == null</code>:</p>
    <ul>
      <li>Влез: <code>user.getUsername() = null</code></li>
      <li>Очекуван излез: <code>user.getUsername() = user.getEmail()</code></li>
    </ul>
  </li>
  <li>
    <p>Тест случај за <code>user.getEmail()</code> без "@" и "." знаци:</p>
    <ul>
      <li>Влез: <code>user.getEmail() = "email"</code></li>
      <li>Очекуван излез: <code>same = 1</code></li>
    </ul>
  </li>
  <li>
    <p>Тест случај за <code>user.getEmail()</code> со постоечка е-пошта во <code>allUsers</code>:</p>
    <ul>
      <li>Влез: <code>user.getEmail() = "existingEmail"</code></li>
      <li>Очекуван излез: <code>same &gt; 0</code></li>
    </ul>
  </li>
  <li>
    <p>Тест случај за <code>passwordLower.contains(user.getUsername().toLowerCase())</code>:</p>
    <ul>
      <li>Влез: <code>passwordLower = "password"</code>, <code>user.getUsername() = "pass"</code></li>
      <li>Очекуван излез: <code>false</code></li>
    </ul>
  </li>
  <li>
    <p>Тест случај за <code>password.length() &lt; 8</code>:</p>
    <ul>
      <li>Влез: <code>password = "pass"</code>, <code>password.length() = 4

</code></li>
      <li>Очекуван излез: <code>false</code></li>
    </ul>
  </li>
  <li>
    <p>Тест случај за <code>!passwordLower.contains(" ")</code> и нема специјални знаци во лозинката:</p>
    <ul>
      <li>Влез: <code>passwordLower = "password"</code></li>
      <li>Очекуван излез: <code>false</code></li>
    </ul>
  </li>
  <li>
    <p>Тест случај за <code>!passwordLower.contains(" ")</code> и специјален знак во лозинката:</p>
    <ul>
      <li>Влез: <code>passwordLower = "pass@word"</code>, <code>specialCharacters = "!#$%&amp;'()*+,-./:;&lt;=&gt;?@[]^_</code>{|}"`</li>
      <li>Очекуван излез: <code>same == 0</code></li>
    </ul>
  </li>
</ol>
