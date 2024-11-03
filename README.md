**WebSystems Lab 2**

Task:

Лабораторна робота №2: Неперервна інтеграція та конвеєри

Мета:
Навчитися працювати з інструментами неперервної інтеграції, створювати конвеєри для автоматизації процесів збірки та тестування вебпроєктів.


Загальні вимоги:
Максимальна кількість балів за виконання роботи: 10 балів.
Обовʼязкові завдання (на 6 з 10 балів).
Додаткові завдання (на 4 з 10 балів).

Обов’язкові завдання (6 балів):

Робота з існуючим проєктом або створення нового:

Використайте результати лабораторної роботи №1 або створіть новий мінімальний вебпроєкт (ініціалізуйте новий репозиторій).

Оберіть один з інструментів неперервної інтеграції:

Jenkins
GitLab CI
GitHub Actions
CircleCI
TravisCI
Ви також можете вибрати інший інструмент за вашим бажанням.

Створення конвеєра для основної гілки:

Налаштуйте конвеєр (pipeline), який можна запустити на основній гілці main/ master.

Збірка проєкту:
Додайте до конвеєра кроки для збірки вашого проєкту. Кроки можуть варіюватися в залежності від обраної технології (наприклад, Maven або Gradle для Java, npm для Node.js).
Формування артефакту:
Налаштуйте крок конвеєра для створення результату збірки (артефакту). Це може бути зібраний jar-файл, zip-архів або інший тип файлу, який можна завантажити.
Артефакт у конвеєрі:
Налаштуйте збереження створеного артефакту як частини конвеєра, що може бути доступним для завантаження після завершення збірки. 


Додаткові завдання (4 бали):

Unit-тести:
Додайте принаймні один Unit-тест до вашого вебпроєкту.
Додайте до конвеєра новий крок для автоматичного запуску тестів.
Звіт результатів тестів:
Налаштуйте звіт про виконання тестів як артефакт, що може бути завантаженим, або інтегруйте результат тестів у інтерфейс інструменту неперервної інтеграції.
SonarQube для аналізу коду:
Встановіть та налаштуйте SonarQube (локально або у хмарі).
Покажіть можливість запуску аналізу коду локально з відправкою результатів до SonarQube.
Інтеграція SonarQube у конвеєр:
Додайте окремий крок в конвеєр для автоматичного аналізу коду за допомогою SonarQube і відправлення результатів на сервер SonarQube.