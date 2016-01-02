package com.dtr.zbar.build;

public class ZBarDecoder {

	static {
		System.loadLibrary("ZBarDecoder");
	}

	/**
	 * 解码方法
	 * 
	 * @param data
	 *            图片数据
	 * @param width
	 *            原始宽度
	 * @param height
	 *            原始高度
	 * @return
	 */
	public native String decodeRaw(byte[] data, int width, int height);

	/**
	 * 解码方法(需要裁剪图片)
	 * 
	 * @param data
	 *            图片数据
	 * @param width
	 *            原始宽度
	 * @param height
	 *            原始高度
	 * @param x
	 *            截取的x坐标
	 * @param y
	 *            截取的y坐标
	 * @param cwidth
	 *            截取的区域宽度
	 * @param cheight
	 *            截取的区域高度
	 * @return
	 */
	public native String decodeCrop(byte[] data, int width, int height, int x, int y, int cwidth, int cheight);
}
