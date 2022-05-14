/**
 *
 * @param {string[]} ids
 * @param {string[]} reports
 * @param {number} k
 * @returns
 */
function solution(ids, reports, banThreshold) {
  const userById = {};
  const receivedEmailCounts = Array(ids.length).fill(0);

  ids.forEach((id) => {
    userById[id] = {
      reportedBy: new Set(),
      reportedTo: new Set(),
    };
  });

  reports.forEach((report) => {
    const [reporter, reported] = report.split(" ");

    if (!userById[reported].reportedBy.has(reporter)) {
      userById[reported].reportedBy.add(reporter);
    }

    if (!userById[reporter].reportedTo.has(reported)) {
      userById[reporter].reportedTo.add(reported);
    }
  });

  const users = Object.values(userById);

  users.forEach((user, index) => {
    [...user.reportedTo].forEach((reportedUser) => {
      if (userById[reportedUser].reportedBy.size >= banThreshold) {
        receivedEmailCounts[index] += 1;
      }
    });
  });

  return receivedEmailCounts;
}
