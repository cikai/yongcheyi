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
					article1.setDescription("");
					article1.setPicUrl("http://ooo.0o0.ooo/2016/05/02/57280a3c4aa34.jpg");
					article1.setUrl("http://cikai.github.io");

					Article article2 = new Article();
					article2.setTitle("测试3-2");
					article2.setDescription("");
					article2.setPicUrl("http://ooo.0o0.ooo/2016/05/02/57280a3c4aa34.jpg");
					article2.setUrl("http://cikai.github.io");

					Article article3 = new Article();
					article3.setTitle("测试3-3");
					article3.setDescription("");
					article3.setPicUrl("http://ooo.0o0.ooo/2016/05/02/57280a3c4aa34.jpg");
					article3.setUrl("http://cikai.github.io");

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
						article.setDescription("雷凌 10.78-15.98万");
						article.setPicUrl(
								"http://car2.m.autoimg.cn/cardfs/product/g11/M02/0A/33/va_wp_autohomecar__wKjBzFZqxGqAOtu2AAkkFHP2CHY105.jpg");
						article.setUrl("http://m.autohome.com.cn/3462/#pvareaid=104702");
						articleList.add(article);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respMessage = MessageUtil.newsMessageToXml(newsMessage);
					} else if (eventKey.equals("CONTENT")) {
						// 多图文消息
						Article article1 = new Article();
						article1.setTitle("新款蒙奇奇卡通立体造型粗冰丝凉垫");
						article1.setDescription("夏季汽车坐垫 通用四季垫车垫");
						article1.setPicUrl("http://img.che777.com/images/201305/goods_img/20186_G_1369073077039.jpg");
						article1.setUrl("http://www.che777.com/%E6%B1%BD%E8%BD%A6%E5%BA%A7%E5%9E%AB/g20186.html");

						Article article2 = new Article();
						article2.setTitle("御车宝 摩丝娃娃 车载摇头公仔");
						article2.setDescription("商品编号：17167    支持车型：通用车型");
						article2.setPicUrl("http://img.che777.com/images/201109/goods_img/17167_G_1316986775400.jpg");
						article2.setUrl(
								"http://www.che777.com/%E5%A4%AA%E9%98%B3%E8%83%BD%E5%85%AC%E4%BB%94/g17167.html");

						Article article3 = new Article();
						article3.setTitle("单车岁月 防水透气运动型抱枕");
						article3.setDescription("商品编号：17167    支持车型：通用车型");
						article3.setPicUrl("http://img.che777.com/images/201112/goods_img/18492_P_1323107063206.jpg");
						article3.setUrl(
								"http://www.che777.com/%E7%A9%BA%E8%B0%83%E8%A2%AB%E6%8A%B1%E6%9E%95/g18492.html");

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