package net.cnki;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.cnki.mail.send.IMailService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailBootApplicationTests {
	@Autowired
    IMailService mailService;
	
//	@Test
//	public void contextLoads() {
//		mailService.sendSimpleMail("835435594@qq.com", "woden23", "<h1>ceshi</h1>");
//	}
	
	@Test
	public void sendHtmlMail() {
//		mailService.sendHtmlMail("835435594@qq.com","主题：你好html邮件","<html><body><h1 style='color:red'>helloWorld</h1></body></html>");
		mailService.sendSimpleMail("835435594@qq.com", "简单邮件标题", "测试简单邮件内容");
//		mailService.sendHtmlMail("xxx@qq.com","test","<html><body><h1>helloWorld</h1></body></html>");
//		mailService.sendHtmlMail("xxx@qq.com","test","<html><body><h1>helloWorld</h1><img src='cid:tpid' width='80%' height='600px'></body></html>","tpid","E:\\格物致知001.png");
//		mailService.sendAttachmentsMail("xxx@qq.com", "woden23", "<h1>ceshi</h1>", "E:\\格物致知001.png");
	}
	
//	@Test
//	public void sendAttachmentsMail() {
//		mailService.sendAttachmentsMail("835435594@qq.com", "woden23", "<h1>ceshi</h1>", "E:\\格物致知001.png");
//	}

}
