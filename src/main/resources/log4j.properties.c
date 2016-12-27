# for debug
log4j.rootLogger = Info,console,D
#log4j.rootLogger = Info,console,D,E
# for online
#log4j.rootLogger = Info,D,E,MAIL

# console output
log4j.appender.console = org.apache.log4j.ConsoleAppender
log4j.appender.console.layout = org.apache.log4j.PatternLayout
log4j.appender.console.Target = System.out
log4j.appender.console.layout.ConversionPattern=[%d{yyyy MMM dd HH:mm:ss,SSS}] [%5p ] %c{1}:%L -- %m%n

## debug information output
log4j.appender.D = org.apache.log4j.DailyRollingFileAppender
log4j.appender.D.File = logs/logdemoinfo.log
#log4j.appender.D.File = logs/twsearchinfo.log
#log4j.appender.D.MaxBackupIndex = 100
log4j.appender.D.layout = org.apache.log4j.PatternLayout
log4j.appender.D.layout.ConversionPattern = %n[LOG] %d ==> %m <== %c{1}:%L
#log4j.appender.D.MaxFileSize=4MB
log4j.appender.D.Threshold = INO                           
log4j.appender.D.encoding=UTF-8
#
## error information output
#log4j.appender.E = org.apache.log4j.DailyRollingFileAppender
#log4j.appender.E.encoding=UTF-8                   
#log4j.appender.E.File = logs/error.log
#log4j.appender.E.Append = true
#log4j.appender.E.Threshold = ERROR
#log4j.appender.E.layout = org.apache.log4j.PatternLayout
#log4j.appender.E.layout.ConversionPattern = [%d{yyyy MMM dd HH:mm:ss,SSS}] [%5p ] %c{1}:%L -- %m%n
#log4j.appender.E.MaxFileSize=4MB
#log4j.appender.E.MaxBackupIndex=100

