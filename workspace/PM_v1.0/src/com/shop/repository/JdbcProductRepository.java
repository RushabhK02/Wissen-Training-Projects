package com.shop.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shop.db.ConnectionFactory;
import com.shop.model.Product;

public class JdbcProductRepository implements ProductRepository {

	public void save(Product product) {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			// 3. create JDBC statements with SQL
			String sql = "insert into shop_db.PRODUCTS(name,price,makeDate,image,description) values (?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, product.getName());
			ps.setDouble(2, product.getPrice());
			ps.setDate(3, new Date(product.getDate().getTime()));
			ps.setString(4, product.getImage());
			ps.setString(5, product.getDescription());

			// 4. execute statement
			int count = ps.executeUpdate();

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Product find(int id) {
		Connection connection = null;
		Product product = null;
		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			// 3. create JDBC statements with SQL
			String sql = "select * from shop_db.PRODUCTS where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				product.setDate(rs.getDate(4));
				product.setImage(rs.getString(5));
				product.setDescription(rs.getString(6));
			}

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return product;

	}

	@Override
	public List<Product> findAll() {
		Connection connection = null;
		List<Product> products = new ArrayList<Product>();
		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			// 3. create JDBC statements with SQL
			String sql = "select * from shop_db.PRODUCTS";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				product.setDate(rs.getDate(4));
				product.setImage(rs.getString(5));
				product.setDescription(rs.getString(6));

				products.add(product);
			}

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return products;

	}

	@Override
	public void update(Product product) {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			// 3. create JDBC statements with SQL
			String sql = "update shop_db.PRODUCTS set name=?,price=?,makeDate=?,image=?,description=? where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, product.getName());
			ps.setDouble(2, product.getPrice());
			ps.setDate(3, new Date(product.getDate().getTime()));
			ps.setString(4, product.getImage());
			ps.setString(5, product.getDescription());
			ps.setInt(6, product.getId());

			// 4. execute statement
			int count = ps.executeUpdate();

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}


	@Override
	public void delete(int id) {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			// 3. create JDBC statements with SQL
			String sql = "delete from shop_db.PRODUCTS where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);

			// 4. execute statement
			int count = ps.executeUpdate();

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}


}
