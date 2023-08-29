-- 코드를 입력하세요
SELECT T1.TITLE                               AS TITLE
     , T1.BOARD_ID                            AS BOARD_ID
     , T2.REPLY_ID                            AS REPLY_ID
     , T2.WRITER_ID                           AS WRITER_ID
     , T2.CONTENTS                            AS CONTENTS
     , TO_CHAR(T2.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE
FROM   USED_GOODS_BOARD T1
INNER
JOIN   USED_GOODS_REPLY T2
ON     T2.BOARD_ID = T1.BOARD_ID
WHERE  1 = 1
AND    TO_CHAR(T1.CREATED_DATE, 'YYYY-MM') = '2022-10'
ORDER BY TO_CHAR(T2.CREATED_DATE, 'YYYY-MM-DD') ASC, T1.TITLE ASC;