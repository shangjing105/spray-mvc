package com.shang.spary.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @描述
 * @作者 杨立忠
 * @版本 V1.0
 * @创建时间：2014-8-6 上午10:05:01
 */
public class SerializeUtil {
	public static byte[] serialize(Object object) {
		ObjectOutputStream oos = null;

		ByteArrayOutputStream baos = null;

		try {

			// 序列化

			baos = new ByteArrayOutputStream();

			oos = new ObjectOutputStream(baos);

			oos.writeObject(object);

			byte[] bytes = baos.toByteArray();

			return bytes;

		} catch (Exception e) {

		}

		return null;

	}

	public static Object unserialize(byte[] bytes) {

		ByteArrayInputStream bais = null;

		try {

			// 反序列化

			bais = new ByteArrayInputStream(bytes);

			ObjectInputStream ois = new ObjectInputStream(bais);

			return ois.readObject();

		} catch (Exception e) {

		}

		return null;

	}
}