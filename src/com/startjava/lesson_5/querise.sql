-- выведите всю таблицу

SELECT * FROM jaegers;

-- отобразите только не уничтоженных роботов (у меня все уничтожены, по-этому отобразил только русских)

SELECT * FROM jaegers WHERE origin = 'Russia';

-- отобразите роботов нескольких серий, например Mark-1 и Mark-6

SELECT * FROM jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';

-- отсортируйте таблицу по убыванию по столбцу mark

SELECT * FROM jaegers ORDER BY mark DESC;

-- отобразите самого старого робота

SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);

-- отобразите роботов, которые уничтожили больше/меньше всех kaiju

SELECT * FROM jaegers WHERE kaijukill > (SELECT AVG(kaijukill) FROM jaegers) ORDER BY kaijukill DESC;
SELECT * FROM jaegers WHERE kaijukill < (SELECT AVG(kaijukill) FROM jaegers) ORDER BY kaijukill;

-- отобразите средний вес роботов

SELECT AVG(weight) FROM jaegers;

-- увеличьте на единицу количество уничтоженных kaiju у японских роботов

UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE origin = 'Japan';

-- удалите американских роботов

DELETE FROM jaegers WHERE origin = 'USA';