package com.company.Email.Concretes;

import com.company.Email.Abstracts.IMailSender;

public class MailSender implements IMailSender {
    @Override
    public void sendMail(String email) {
        System.out.println(email+" 'maili için doğrulama linki yollandı.");
    }
}
