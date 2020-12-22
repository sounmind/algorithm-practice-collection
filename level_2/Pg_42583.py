from collections import deque


def solution(bridge_length, weight_bridge_can_hold, truck_weights):
    time = 0
    bridge = deque([0] * bridge_length)
    truck_weights = deque(truck_weights)

    while bridge:
        time += 1
        bridge.popleft()
        if truck_weights:
            if sum(bridge) + truck_weights[0] <= weight_bridge_can_hold:
                bridge.append(truck_weights.popleft())
            else:
                bridge.append(0)
        else:
            time += len(bridge)
            return time


print(solution(2, 10, [7, 4, 5, 6]))
print(solution(100, 100, [10]))
print(solution(100, 100, [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]))
