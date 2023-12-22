# Java_Development_Kit_seminar_4
## Класс "Employee" представляет сотрудника в справочнике и имеет следующие атрибуты:

- tabelNumber: Табельный номер сотрудника.
- phoneNumber: Номер телефона сотрудника.
- name: Имя сотрудника.
- workExperience: Стаж работы сотрудника.

## Класс "EmployeeList" представляет справочник сотрудников и имеет следующие атрибуты и методы:

- employees: Список сотрудников, хранящихся в справочнике.
- addEmployee(Employee employee): Добавляет сотрудника в справочник.
- printAll(): Печатает информацию о всех сотрудниках в справочнике.
- findByWorkExperience(int workExperience): Ищет сотрудника по стажу работы.
- findByName(String name): Ищет сотрудника по имени.
- findByTabelNumber(int tabelNumber): Ищет сотрудника по табельному номеру.
- findByPhoneNumber(String phoneNumber): Ищет сотрудника по номеру телефона.

Класс "EmployeeList" использует цикл for для перебора списка сотрудников и метод printEmployeeDetails, чтобы отобразить информацию о каждом сотруднике. Метод findByWorkExperience и findByName используют тот же подход для поиска сотрудников по конкретным критериям. Метод findByTabelNumber и findByPhoneNumber также используют цикл for для поиска сотрудников по табельному номеру и номеру телефона соответственно.