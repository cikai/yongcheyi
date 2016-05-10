package com.mxnavi.yongcheyi.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.mxnavi.yongcheyi.model.resp.Article;
import com.mxnavi.yongcheyi.model.resp.NewsMessage;
import com.mxnavi.yongcheyi.model.resp.TextMessage;
import com.mxnavi.yongcheyi.controller.utils.MessageUtil;

/**
 * 核心服务类
 * 
 */
public class ArticleServiceForWeixin {
	/**
	 * 处理微信发来的请求
	 * 
	 * @param request
	 * @return
	 */
	public static String processRequest(HttpServletRequest request) {
		String respMessage = null;
		try {
			// xml请求解析
			Map<String, String> requestMap = MessageUtil.parseXml(request);

			// 发送方帐号（open_id）
			String fromUserName = requestMap.get("FromUserName");
			// 公众帐号
			String toUserName = requestMap.get("ToUserName");
			// 消息类型
			String msgType = requestMap.get("MsgType");

			// 文本消息处理
			TextMessage textMessage = new TextMessage();
			textMessage.setToUserName(fromUserName);
			textMessage.setFromUserName(toUserName);
			textMessage.setCreateTime(new Date().getTime());
			textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
			textMessage.setFuncFlag(0);
			
			// 默认回复此文本消息
			//textMessage.setContent("功能尚未实现!");
			//respMessage = MessageUtil.textMessageToXml(textMessage);

			// 图文消息
			NewsMessage newsMessage = new NewsMessage();
			newsMessage.setToUserName(fromUserName);
			newsMessage.setFromUserName(toUserName);
			newsMessage.setCreateTime(new Date().getTime());
			newsMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
			newsMessage.setFuncFlag(0);

			List<Article> articleList = new ArrayList<Article>();

			// 文本消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
				// 接收用户发送的文本消息内容
				String content = requestMap.get("Content");

				// 多图文消息
				if ("3".equals(content)) {
					Article article1 = new Article();
					article1.setTitle("测试3-1");

					Article article2 = new Article();
					article2.setTitle("测试3-2");

					Article article3 = new Article();
					article3.setTitle("测试3-3");

					articleList.add(article1);
					articleList.add(article2);
					articleList.add(article3);
					newsMessage.setArticleCount(articleList.size());
					newsMessage.setArticles(articleList);
					respMessage = MessageUtil.newsMessageToXml(newsMessage);
				}
			} else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
				// 事件类型
				String eventType = requestMap.get("Event");
				// 订阅
				if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
					textMessage.setContent("欢迎关注用车易微信公众平台!");
					respMessage = MessageUtil.textMessageToXml(textMessage);
				}
				// 事件响应
				else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
					// 事件KEY值，与创建自定义菜单时指定的KEY值对应
					String eventKey = requestMap.get("EventKey");
					if (eventKey.equals("WCNK")) {
						// 单图文消息
						Article article = new Article();
						article.setTitle("我拆你看 - 雷凌");
						articleList.add(article);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respMessage = MessageUtil.newsMessageToXml(newsMessage);
					} else if (eventKey.equals("CONTENT")) {
						// 多图文消息
						Article article1 = new Article();
						article1.setTitle("新款蒙奇奇卡通立体造型粗冰丝凉垫");

						Article article2 = new Article();
						article2.setTitle("御车宝 摩丝娃娃 车载摇头公仔");

						Article article3 = new Article();
						article3.setTitle("单车岁月 防水透气运动型抱枕");

						articleList.add(article1);
						articleList.add(article2);
						articleList.add(article3);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respMessage = MessageUtil.newsMessageToXml(newsMessage);
					} else if (eventKey.equals("ASK")) {
						textMessage.setContent("欢迎进入专家在线！请在下方留下您的问题，我们会及时为您解答！");
						respMessage = MessageUtil.textMessageToXml(textMessage);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respMessage;
	}

	/**
	 * emoji表情转换(hex -> utf-16)
	 * 
	 * @param hexEmoji
	 * @return
	 */
	public static String emoji(int hexEmoji) {
		return String.valueOf(Character.toChars(hexEmoji));
	}
}