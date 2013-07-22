package com.tomyzhou.pull;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;

//�Զ����ٲ����ؼ�
public class FallView extends LinearLayout {

	private List<LinearLayout> list;
	private LinearLayout ll_list1;
	private LinearLayout ll_list2;
	private LinearLayout ll_list3; // ����

	/**
	 * 
	 * @param context
	 * @param viewList
	 *            ��Ҫ��ʾ��ͼƬ�б�
	 */
	public FallView(Context context, List<View> viewList) {
		super(context);
		list = new ArrayList<LinearLayout>();
		View view = View.inflate(context, R.layout.layout_fall, this);

		ll_list1 = (LinearLayout) view.findViewById(R.id.ll_list1);
		ll_list2 = (LinearLayout) view.findViewById(R.id.ll_list2);
		ll_list3 = (LinearLayout) view.findViewById(R.id.ll_list3);

		initView(viewList);
	}

	// ���ÿ��LinearLayout�����ͼƬ
	/**
	 * @param number
	 *            ÿ��LinearLayout����Image�ĸ���
	 */
	private void initView(List<View> viewList) {
		System.out.println(viewList.size());
		for (int i = 0; i < viewList.size(); i++) {
			View view = viewList.get(i);
			if (i % 3 == 0) {
				ll_list1.addView(view);
			}
			if (i % 3 == 1) {
				ll_list2.addView(view);
			}
			if (i % 3 == 2) {
				ll_list3.addView(view);
			}
		}
	}

}
