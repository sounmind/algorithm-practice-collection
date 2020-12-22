from collections import deque


def solution(bridge_length, weight_bridge_can_hold, truck_weights):
    time = 0
    bridge = deque([0] * bridge_length)
    truck_weights = deque(truck_weights)
    sum_weight_on_bridge = 0

    while bridge:
        time += 1
        sum_weight_on_bridge -= bridge.popleft()
        if truck_weights:
            if sum_weight_on_bridge + truck_weights[0] <= weight_bridge_can_hold:
                new_truck = truck_weights.popleft()
                bridge.append(new_truck)
                sum_weight_on_bridge += new_truck
            else:
                bridge.append(0)
        else:
            time += len(bridge)
            return time


print(solution(2, 10, [7, 4, 5, 6]))
print(solution(100, 100, [10]))
print(solution(100, 100, [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]))
