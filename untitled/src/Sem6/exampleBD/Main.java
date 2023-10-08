package Sem6.exampleBD;

// Пример класса, независимого от конкретной базы данных
//class UserRepository {
//    private DatabaseConnection dbConnection;
//
//    UserRepository(DatabaseConnection dbConnection) {
//        this.dbConnection = dbConnection;
//    }
//
//    User getUserById(int userId) {
//        // Логика получения пользователя из базы данных
//    }
//
//    void saveUser(User user) {
//        // Логика сохранения пользователя в базе данных
//    }
//}
//
//// Пример класса, независимого от пользовательского интерфейса
//class UserWebService {
//    void displayUserInfo(User user) {
//        // Логика отображения информации о пользователе в веб-интерфейсе
//    }
//
//    void updateUserProfile(User user) {
//        // Логика обновления профиля пользователя через веб-интерфейс
//    }
//}