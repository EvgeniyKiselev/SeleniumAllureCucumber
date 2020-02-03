#language: ru
Функционал: Валидация блока контакты на форме заполнения заявки на страхование путешественников http://www.sberbank.ru/ru/person

  Сценарий: Пользователь заходит на сайт, выбирает раздел страхование путешественников заполняет форму оформления заявки онлайн без указания контактных данных

    Когда выбран пункт меню "Страхование"
    И выбран вид страхования "Страхование путешественников"

    Тогда заголовок страницы - Страхование путешественников равен "Страхование путешественников"

    Когда выполнено нажатие на кнопку Оформить онлайн
    Когда выбрана Минимальная сумма страховой защиты
    И нажата кнопка Оформить

    Когда заполняются поля
      |Фамилия застрахованного|Prokofiev|
      |Имя застрахованного|Sergey|
      |Дата рождения застрахованного|18.08.1980|
      |Фамилия страхователя|Достоевский|
      |Имя страхователя|Федор|
      |Отчество страхователя|Михайлович|
      |Дата рождения страхователя|18.05.1980|
      |Серия паспорта|1111|
      |Номер паспорта|123456|
      |Дата выдачи паспорта|15.05.2013|
      |Кем выдан|Паспортный стол|

    Тогда значения полей равны:
      |Фамилия застрахованного|Prokofiev|
      |Имя застрахованного|Sergey|
      |Дата рождения застрахованного|18.08.1980|
      |Фамилия страхователя|Достоевский|
      |Имя страхователя|Федор|
      |Отчество страхователя|Михайлович|
      |Дата рождения страхователя|18.05.1980|
      |Серия паспорта|1111|
      |Номер паспорта|123456|
      |Дата выдачи паспорта|15.05.2013|
      |Кем выдан|Паспортный стол|

    Когда нажата кнопка продолжить
    Тогда выведено сообщение об ошибке

