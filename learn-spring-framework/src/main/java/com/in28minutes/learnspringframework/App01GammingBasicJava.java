package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GammingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var game = new PacmanGame(); // 1: 객체 생성

		var gameRunner = new GameRunner(game);
		// 2: 객체 생성 + 의존성을 연결
		// 게임은 GameRunner 클래스의 의존성 

		gameRunner.run();
	}

}
