# Discord Notifier
A plugin to send questing, skilling, and drop notifications to a discord webhook.

Currently, the plugin only supports quest notifications, but will be updated soon with other notifications, such as skilling and drops.

## Quest Notifications
You may filter what notifications are sent with the following options:
- **Enable Quest Notifications** Whether to send any quest notifications
- **Send Screenshot (WIP)** Whether a screenshot is added to the notification at the time of completion
- **Enabled Quest Types** Which quest types to send notifications for, separated by f2p/members and difficulty levels
  - Freetoplay
  - Member
  - Novice
  - Intermediate
  - Experienced
  - Master
  - Grandmaster
  - Special
- **Quest Point Minimum** The minimum quest points for a quest required to send a notification
- **On Quest Start** Whether to send a notification when a quest begins as well as when it's completed