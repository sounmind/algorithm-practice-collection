class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        letters, digits = [], []
        for log in logs:
            if log.split()[1].isdigit():
                digits.append(log)  # 숫자로 구성된 로그
            else:
                letters.append(log)  # 문자로 구성된 로그
        # 문자로 구성된 로그를 '식별자를 제외한 문자열'을 키로 정렬하고,
        # 그 문자열이 동일할 경우 '식별자'를 키로 정렬한다.
        letters.sort(key=lambda x: (x.split()[1:], x.split()[0]))
        return letters + digits