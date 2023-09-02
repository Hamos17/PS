-- 코드를 입력하세요
SELECT TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) AS HOUR
     , COUNT(*)                             AS COUNT 
FROM   ANIMAL_OUTS
GROUP BY TO_CHAR(DATETIME, 'HH24')
HAVING 9 <= TO_CHAR(DATETIME, 'HH24') AND TO_CHAR(DATETIME, 'HH24') < 20
ORDER BY TO_CHAR(DATETIME, 'HH24');