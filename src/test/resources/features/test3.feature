# language: ru

## data test
## base

@summa
Функция: Тест данных

 # Предыстория: Пользователь должен открыть сайт в браузере

  Структура сценария: data summa
    Если сложить <a> и <b>
    Тогда получим <c>

    Примеры:
    |a |b| c|
    |1 |2|3 |
    |-1|22|34|
    |3 |-5| -2|
    |2 |2 |4  |


  Сценарий: data test 2

    Дано следующие данные:
      |a |20  |31 | -12|
      |b |2   |3  | 10 |
      |c |22  |34 | 2  |


  Сценарий: data test 3

    Дано следующие данные 2:
      |20  |
      |2   |
      |22  |
      |31 |
      | 3  |
      |34 |

  Сценарий: data test 4

    Дано следующие данные 3:
      |a |b  |summa |
      |1 |2   |3  |
      |12 |22  |34 |
