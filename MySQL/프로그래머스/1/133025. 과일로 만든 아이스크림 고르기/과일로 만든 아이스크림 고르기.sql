-- 코드를 입력하세요
SELECT F.flavor
from first_half F
join icecream_info on F.flavor = icecream_info.flavor
where F.total_order >3000 and icecream_info.ingredient_type = 'fruit_based'
order by total_order desc