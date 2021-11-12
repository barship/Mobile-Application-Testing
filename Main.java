package com.mooctest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AndroidKeyCode;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;


public class Main {
	
	
	/**
	 * 所有和AppiumDriver相关的操作都必须写在该函数中
	 * @param driver
	 */
	public void test(AppiumDriver driver) {
		    	try {
			Thread.sleep(6000);		//等待6s，待应用完全启动
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); //设置尝试定位控件的最长时间为8s,也就是最多尝试8s
      	 /*
    	 * 余下的测试逻辑请按照题目要求进行编写
    	 */

    	try {
    		//Thread.sleep(7000);
//    		driver.swipe(600, 500, 100, 500, 1000);
//    		Thread.sleep(1000);
//    		driver.swipe(600, 500, 100, 500, 1000);
//    		Thread.sleep(1000);
    		
    		//driver.findElementByXPath("com.anjuke.android.app:id/guidePages").click();
    		//driver.findElementByXPath("//android.widget.ImageView").click();
    		//driver.findElementByXPath("//android.widget.FrameLayout").click();
    		//driver.findElementByXPath("//android.support.v4.view.ViewPager").click();
    		driver.findElementById("com.anjuke.android.app:id/edittext").sendKeys("南京");
    		driver.findElementByXPath("//android.widget.TextView[@text='南京']").click();
    		Thread.sleep(1000);
    		
    		driver.findElementById("com.anjuke.android.app:id/price_address_text_view").click();
    		Thread.sleep(1000);
    		driver.findElementById("com.anjuke.android.app:id/bg_frame_layout").click();
    		Thread.sleep(500);
    		driver.findElementById("com.anjuke.android.app:id/title_bar_back_button").click();
    		Thread.sleep(500);
    		driver.findElementById("com.anjuke.android.app:id/new_house_tv").click();
    		driver.swipe(500, 1200, 500, 600, 1000);
    		Thread.sleep(1000);
    		driver.findElementById("com.anjuke.android.app:id/near_three_years_text_View").click();
    		driver.findElementById("com.anjuke.android.app:id/near_one_years_text_View").click();
    		driver.sendKeyEvent(AndroidKeyCode.BACK); 
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		
    		driver.findElementByXPath("//android.widget.TextView[@text='新房']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='房贷计算']").click();
    		driver.findElementById("com.anjuke.android.app:id/field_price_value").clear();
    		driver.findElementById("com.anjuke.android.app:id/field_price_value").sendKeys("500");
    		Thread.sleep(500);
    		driver.findElementById("com.anjuke.android.app:id/publish_btn").click();
    		Thread.sleep(500);
    		driver.findElementById("com.anjuke.android.app:id/btn_principle").click();
    		driver.findElementById("com.anjuke.android.app:id/btn_interest").click();
    		driver.findElementById("com.anjuke.android.app:id/refresh_layout").click();
    		Thread.sleep(500);
    		driver.findElementById("com.anjuke.android.app:id/btnright").click();
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		
    		driver.findElementsById("com.anjuke.android.app:id/thumb_img_iv").get(0).click();
    		driver.findElementById("com.anjuke.android.app:id/fav_btn").click();
    		driver.findElementById("com.anjuke.android.app:id/title_bar_back_button").click();
    		driver.findElementById("com.anjuke.android.app:id/price_change_fl").click();
    		driver.findElementById("com.anjuke.android.app:id/title_bar_back_button").click();
    		driver.findElementById("com.anjuke.android.app:id/kaipan_change_fl").click();
    		driver.findElementById("com.anjuke.android.app:id/title_bar_back_button").click();
    		driver.findElementById("com.anjuke.android.app:id/building_compare_button").click();
    		driver.findElementById("com.anjuke.android.app:id/building_compare_button_transparent").click();
    		Thread.sleep(1000);
    		driver.findElementsById("com.anjuke.android.app:id/item_new_house_building_compare_select_button").get(1).click();
    		driver.findElementsById("com.anjuke.android.app:id/item_new_house_building_compare_select_button").get(2).click();
    		driver.findElementById("com.anjuke.android.app:id/new_house_building_compare_list_begin_compare").click();
    		Thread.sleep(5000);
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		Thread.sleep(500);
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		Thread.sleep(500);
    		driver.findElementById("com.anjuke.android.app:id/back_btn_transparent").click();
    		Thread.sleep(500);
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		Thread.sleep(500);
    		
    		driver.findElementByXPath("//android.widget.TextView[@text='消息']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='通知']").click();
    		driver.findElementById("com.anjuke.android.app:id/right_two_image_button").click();
        	driver.findElementById("com.anjuke.android.app:id/title_bar_back_button").click();
        	driver.findElementById("com.anjuke.android.app:id/right_one_image_button").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='通讯录']").click();
        	driver.findElementById("com.anjuke.android.app:id/title_bar_back_button").click();
        	driver.findElementById("com.anjuke.android.app:id/right_one_image_button").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='发起群聊']").click();
        	driver.findElementById("com.anjuke.android.app:id/title_bar_back_button").click();
        	driver.findElementById("com.anjuke.android.app:id/right_one_image_button").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='找经纪人']").click();
        	driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
        	driver.findElementById("com.anjuke.android.app:id/right_one_image_button").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='扫一扫']").click();
        	// 这里要等5s！
        	Thread.sleep(5000);
    		driver.findElementById("com.anjuke.android.app:id/btn_cancel_scan").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='微聊']").click();
    		driver.findElementsById("com.anjuke.android.app:id/start_group_button").get(0).click();
    		driver.findElementById("com.anjuke.android.app:id/group_main_page_start_btn").click();
    		driver.findElementById("com.anjuke.android.app:id/title_bar_back_button").click();
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		Thread.sleep(500);
    		driver.findElementsById("com.anjuke.android.app:id/consultant_start_chat_button").get(0).click();
    		Thread.sleep(1000);
    		driver.findElementById("com.anjuke.android.app:id/title_bar_back_button").click();
    		driver.findElementById("com.anjuke.android.app:id/left_image_btn").click();
    		
    		driver.findElementByXPath("//android.widget.TextView[@text='有料']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='关注']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='推荐']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='本地']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='房价']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='攻略']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='律师在线']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='户型改造']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='商业地产']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='海外']").click();
    		//driver.findElementByXPath("//android.widget.TextView[@text='活动']").click();
    		
    		driver.findElementByXPath("//android.widget.TextView[@text='安居头条']").click();
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='挑好房']").click();
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='视频直播']").click();
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		
    		driver.findElementByXPath("//android.widget.TextView[@text='问答']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='卖房']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='贷款']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='交易过户']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='租房']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='买房']").click();
    		driver.findElementById("com.anjuke.android.app:id/float_quick_ask_layout").click();
    		driver.findElementById("com.anjuke.android.app:id/qa_submit_question_et").sendKeys("南大和园多少钱一平方");
    		driver.findElementById("com.anjuke.android.app:id/btnright").click();
    		driver.findElementById("com.anjuke.android.app:id/title_bar_back_button").click();
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		Thread.sleep(500);
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		Thread.sleep(500);
    		
    		driver.findElementByXPath("//android.widget.TextView[@text='推荐']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='租房']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='新房']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='商业地产']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='装修']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='二手房']").click();
    		
    		driver.findElementByXPath("//android.widget.TextView[@text='有料']").click();
    		driver.findElementByXPath("//android.widget.TextView[@text='购房百科']").click();
    		Thread.sleep(5000);
    		driver.findElementByXPath("//android.view.View[@content-desc='房产政策']").click();
    		driver.findElementByXPath("//android.view.View[@content-desc='购房流程']").click();
    		driver.findElementByXPath("//android.view.View[@content-desc='购房资格']").click();
    		driver.findElementByXPath("//android.view.View[@content-desc='看房选房']").click();
    		driver.findElementByXPath("//android.view.View[@content-desc='签约认购']").click();
    		driver.findElementByXPath("//android.view.View[@content-desc='贷款办理']").click();
    		driver.findElementByXPath("//android.view.View[@content-desc='缴税过户']").click();
    		driver.findElementByXPath("//android.view.View[@content-desc='收房验房']").click();
    		driver.findElementByXPath("//android.view.View[@content-desc='准备买房']").click();
    		driver.findElementById("com.anjuke.android.app:id/imagebtnleft").click();
    		
    	} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	/**
	 * AppiumDriver的初始化逻辑必须写在该函数中
	 * @return
	 */
	public AppiumDriver initAppiumTest() {
		
		AppiumDriver driver=null;
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apk");
        File app = new File(appDir, "Anjuke.apk");
        
        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("noSign", "true");

        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath()); 
        
        //设置app的主包名和主类名
        capabilities.setCapability("appPackage", "com.anjuke.android.app");
        capabilities.setCapability("appActivity", "com.anjuke.android.app.WelcomeActivity");
        //设置使用unicode键盘，支持输入中文和特殊字符
        capabilities.setCapability("unicodeKeyboard","true");
        //设置用例执行完成后重置键盘
        capabilities.setCapability("resetKeyboard","true");
        //初始化
        try {
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
        return driver;
	}
	
	public void start() {
		test(initAppiumTest());
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
	

}