# language: ru
@loginTest
Функция: Тест логина и логаута

  Предыстория: Пользователь должен открыть сайт в браузере

  Сценарий: открытие главной страницы
    Если пользователь вводит логин "ppetrov" и пароль "Ppetrov1!"
    То пользователь успешно входит на сайт

  Сценарий: выход из профиля
    Если пользователь успешно вошёл на сайт "bla-bla.site"
    Тогда он выполняет Logout

  Сценарий: Ввод данных
    Если Вы ввели дату 25/03/2017
    И вторую дату 21 января,2020
    Тогда она отобразится