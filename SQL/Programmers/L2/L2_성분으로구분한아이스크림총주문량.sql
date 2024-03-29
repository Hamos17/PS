-- 코드를 입력하세요
SELECT T1.INGREDIENT_TYPE
     , SUM(T2.TOTAL_ORDER) AS TOTAL_ORDER
FROM   ICECREAM_INFO T1
INNER
JOIN   FIRST_HALF T2
ON     T2.FLAVOR = T1.FLAVOR
GROUP BY T1.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER;