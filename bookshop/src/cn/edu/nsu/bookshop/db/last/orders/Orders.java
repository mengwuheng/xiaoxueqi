package cn.edu.nsu.bookshop.db.last.orders;

public class Orders {
	private int orders_id;
	private int users_id;
	private String orders_time;
	private float orders_totalMoney;
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(orders_id+"\t").append(users_id+"\t").append(orders_time+"\t").append(orders_totalMoney+"\t");
		return sb.toString();
	}

	public int getOrders_id() {
		return orders_id;
	}

	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}

	public int getUsers_id() {
		return users_id;
	}

	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}

	public String getOrders_time() {
		return orders_time;
	}

	public void setOrders_time(String orders_time) {
		this.orders_time = orders_time;
	}

	public float getOrders_totalMoney() {
		return orders_totalMoney;
	}

	public void setOrders_totalMoney(float orders_totalMoney) {
		this.orders_totalMoney = orders_totalMoney;
	}
	
	
}
