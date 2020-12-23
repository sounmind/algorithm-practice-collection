from collections import deque


def solution(skill_order, skill_trees):
    answer = len(skill_trees)
    skill_order = skill_order
    for skill_tree in skill_trees:
        skill_order_queue = deque(skill_order)
        for skill in skill_tree:
            if skill in skill_order_queue:
                if skill != skill_order_queue.popleft():
                    answer -= 1
                    break
    return answer