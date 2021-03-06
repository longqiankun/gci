package com.uc.gci.ui;

import com.lqk.framework.inject.InjectInit;
import com.lqk.framework.inject.InjectLayer;
import com.lqk.lib.ui.header.HeaderConfig;
import com.lqk.lib.ui.header.HeaderConfig.BtnClick;
import com.uc.gci.R;


/**
 * @ClassName: NoticeAct
 * @Description: TODO
 * @author longqiankun
 * @date 2014-8-11 下午9:40:22
 * 
 */
@InjectLayer(value=R.layout.more,parent=com.lqk.lib.R.id.page_content)
public class MoreAct extends BaseHeaderActivity {
	
	/**
	 * 注解未injectInit的方法，相当于oncreate，生命周期和他一样
	 */
	@InjectInit
	public void init(){
		
	}
	
	@Override
	protected HeaderConfig getHeaderConfig(HeaderConfig config) {
		config.middleTile="更多";
		config.isShowIbLeft=true;
		config.isShowbtnLeft=true;
		return config;
	}

	@Override
	protected void btnAction(BtnClick btnClick) {
	}

	@Override
	public void setListener() {

	}

	@Override
	public void initData() {
	}

}
