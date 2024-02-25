package com.example.demo2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratePassword {
	
	public static void main(String[] args) {
		
		//ハッシュ化するパスワード
		String rawPassword = "admin";
		
		//パスワードをハッシュに変換
		String password = getEncodePassword(rawPassword);
		
		//ハッシュ化したパスワードを表示する
		System.out.println(password);
		
	}
	
	
	// ハッシュ化するためのメソッド
	// ここでは、BCryptPasswordEncoderクラスのencode()メソッドを使っている。
	private static String getEncodePassword(String rawPassword) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(rawPassword);
	}

}
