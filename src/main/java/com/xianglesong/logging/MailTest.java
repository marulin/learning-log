package com.xianglesong.logging;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailTest {

	public static void main(String[] args) throws AddressException,
			MessagingException {
		String host = "smtp.126.com";// 发送邮件服务器
		String from = "sensorycn@126.com";
		String to = "sensorycn@qq.com";
		// new properties
		Properties props = new Properties();
		// Setup mail server
		props.put("mail.smtp.host", host);// 设置smtp主机
		props.put("mail.smtp.auth", "true");// 使用smtp身份验证
		// Get session
		Session session = Session.getDefaultInstance(props, null);
		// Define message
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		message.setSubject("我的测试邮件");// 标题
		message.setText("This is test JavaMail");// 内容
		// http协议部分会自动转换成超链接
		message.saveChanges();
		// Send message
		Transport transport = session.getTransport("smtp");
		System.out.println("正在连接");
		transport.connect(host, "sensorycn@126.com", "password");
		System.out.println("正在发送");
		transport.sendMessage(message, message.getAllRecipients());
		System.out.println("邮件发送成功");
	}

}
