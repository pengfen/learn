package com.test.sort;

public class HeapSort {
	public static void sort(int[] data) {
		MaxHeap h = new MaxHeap();
		h.init(data);
		for (int i = 0; i < data.length; i++)
			h.remove();
		System.arraycopy(h.queue, 1, data, 0, data.length);
	}

	private static class MaxHeap {

		void init(int[] data) {
			this.queue = new int[data.length + 1];
			for (int i = 0; i < data.length; i++) {
				queue[++size] = data[i];
				fixUp(size);
			}
		}

		private int size = 0;

		private int[] queue;

		public int get() {
			return queue[1];

		}

		public void remove() {
			Sort.swap(queue, 1, size--);
			fixDown(1);
		}

		// fixdown
		private void fixDown(int k) {
			int j;
			while ((j = k << 1) <= size) {
				if (j < size && queue[j] < queue[j + 1])
					j++;
				if (queue[k] > queue[j]) // 不用交换

					break;
				Sort.swap(queue, j, k);
				k = j;
			}
		}

		private void fixUp(int k) {
			while (k > 1) {
				int j = k >> 1;
				if (queue[j] > queue[k])
					break;
				Sort.swap(queue, j, k);

				k = j;
			}
		}

	}
}
/*
 * 堆排序利用了大根堆（或小根堆）堆顶记录的关键字最大（或最小）这一特征， 使得在当前无序区中选取最大（或最小）关键字的记录变得简单。 　　
 * （1）用大根堆排序的基本思想 　　 ① 先将初始文件R[1..n]建成一个大根堆，此堆为初始的无序区 　　 ②
 * 再将关键字最大的记录R[1]（即堆顶）和无序区的最后一个 记录R[n]交换，由此得到新的无序区R[1..n-1]和有序区R[n]，
 * 且满足R[1..n-1].keys≤R[n].key 　　 ③由于交换后新的根R[1]可能违反堆性质，故应将当前无序区R[1..n-1]调整为堆。
 * 然后再次将R[1..n-1]中关键字最大的记录R[1]和该区间的最后一个记录R[n-1]交换，
 * 由此得到新的无序区R[1..n-2]和有序区R[n-1..n]，
 * 且仍满足关系R[1..n-2].keys≤R[n-1..n].keys，同样要将R[1..n-2]调整为堆。 　 直到无序区只有一个元素为止。 　　
 * （2）大根堆排序算法的基本操作： 　　 ① 初始化操作：将R[1..n]构造为初始堆； 　　 ②
 * 每一趟排序的基本操作：将当前无序区的堆顶记录R[1]和该区间的最后一个记录交换， 然后将新的无序区调整为堆（亦称重建堆）。
 */