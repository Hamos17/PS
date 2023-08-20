-- 코드를 입력하세요
SELECT HISTORY_ID                                         AS HISTORY_ID
     , CAR_ID                                             AS CAR_ID
     , TO_CHAR(START_DATE, 'YYYY-MM-DD')                  AS START_DATE
     , TO_CHAR(END_DATE, 'YYYY-MM-DD')                    AS END_DATE
     , CASE WHEN END_DATE - START_DATE + 1 >= 30 THEN '장기 대여'
            ELSE '단기 대여' END                            AS RENT_TYPE
FROM  CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE 1 = 1
AND   TO_CHAR(START_DATE, 'YYYY-MM-DD') >= '2022-09-01'
AND   TO_CHAR(START_DATE, 'YYYY-MM-DD') <= '2022-09-30'
ORDER BY HISTORY_ID DESC;