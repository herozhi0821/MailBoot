package net.cnki.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.cnki.mail.send.IMailService;

@RestController
public class Controller {

	@Autowired
	IMailService mailService;
	
	@RequestMapping("sendMail")
	public void sendMail() {
//		mailService.sendSimpleMail("xxxxxx@qq.com", "简单邮件标题", "测试简单邮件内容");
//		mailService.sendHtmlMail("xxxxxx@@qq.com", "发送HTML邮件,无静态资源","<html><body><h1>helloWorld</h1></body></html>");
//		mailService.sendHtmlMail("xxxxxx@@qq.com", "发送HTML邮件,带有图片资源","<html><body><h1>helloWorld</h1><img src='cid:tpid' width='80%' height='600px'></body></html>","tpid","E:\\格物致知001.png");
//		mailService.sendAttachmentsMail("xxxxxx@@qq.com", "发送带附件的邮件", "<h1>发送带附件的邮件测试</h1>", "E:\\格物致知001.png");
		mailService.sendHtmlModelMail("xxxxxx@@qq.com", "发送HTML模板邮件", "参数1", "参数2","参数3", "参数4");
		
	}
	
	@RequestMapping("receiveMail")
	public void receiveMail() {
		
	}
}
