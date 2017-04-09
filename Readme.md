Тестовое Задание
================


Использовались инструменты/программы
------------------------------------

 * Maven
 * Intellij IDEA
 * Google Chrome (over chromedriver)

Библиотеки
----------

 * selenide (ru.selenide.org)
 * JUnit

Установка зависимостей
----------------------

```
mvn test
```

Для работы в Intellij IDEA
```
mvn idea:idea
```

Запуск теста
------------

```
mvn -Dtest=FindLine -Dselenide.browser=chrome test
```
