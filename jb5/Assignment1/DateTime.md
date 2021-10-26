## Date Time API

**1. Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?**
The class I would use would be the LocalDateTime class. This class can track date and time to every nanosecond.

**2. Given a random date, how would you find the date of the previous Thursday?**
By using the previous(DayOfWeek) method of a TemporalAdjuster class in the java.time library.

**3. What is the difference between a ZoneId and a ZoneOffset?**
ZoneId describes a time-zone identifier and provides rules for converting between an Instant and LocalDateTime object.\
ZoneOffset describes a time-zone offset that is equal to the amount of time between a specific time zone and a Coordinated\
Universal Time.

**4. How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?**
If you have a ZoneId you can convert an Instant to a ZonedDateTime by using the .ofInstant() method.
