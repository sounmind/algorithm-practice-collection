from collections import deque


def solution(bridge_length, weight_bridge_can_hold, truck_weights):
    time = 0
    bridge = deque([0] * bridge_length)
    i = 0
    while True:
        print(bridge)
        time += 1
        bridge.popleft()
        if i < len(truck_weights):
            if sum(bridge) + truck_weights[i] <= weight_bridge_can_hold:
                bridge.append(truck_weights[i])
                i += 1
            else:
                bridge.append(0)
        else:
            break

    return time + len(bridge)


print(solution(2, 10, [7, 4, 5, 6]))
print(solution(100, 100, [10]))
print(solution(100, 100, [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]))
