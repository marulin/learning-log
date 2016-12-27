log4j.rootLogger=DEBUG, stdout, R, mail

#console
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.layout=org.apache.log4j.PatternLayout

# Pattern to output the caller's file name and line number.
log4j.appender.stdout.layout.ConversionPattern=%-4r [%t] %5p %c %x - %m - %X{userName}%n


#R
log4j.appender.R=org.apache.log4j.RollingFileAppender
log4j.appender.R.File=logR.log

log4j.appender.R.MaxFileSize=100KB
# Keep one backup file
log4j.appender.R.MaxBackupIndex=7

log4j.appender.R.layout=org.apache.log4j.PatternLayout
log4j.appender.R.layout.ConversionPattern=%-4r [%t] %5p %c %x - %m - %X{userName}%n

#mail
log4j.appender.mail=org.apache.log4j.net.SMTPAppender
log4j.appender.mail.Threshold=INFO
#log4j.appender.mail.Threshold=Error
#log4j.appender.mail.BufferSize=10

log4j.appender.mail.SMTPHost=smtp.126.com
log4j.appender.mail.SMTPUsername=sensorycn@126.com
log4j.appender.mail.SMTPPassword=password
log4j.appender.mail.From=sensorycn@126.com
#user1,user2
log4j.appender.mail.To=sensorycn@126.com
log4j.appender.mail.Subject=Log4J 测试
log4j.appender.mail.smtp.auth=true
#log4j.appender.mail.starttls.enable=true

#cc
#log4j.appender.MAIL.Bcc=xxx@xxx.xxx
log4j.appender.mail.SMTPDebug=true
log4j.appender.mail.layout=org.apache.log4j.PatternLayout
log4j.appender.mail.layout.ConversionPattern=[%-5p] %d(%r) --> [%t] %l: %m %x %n

