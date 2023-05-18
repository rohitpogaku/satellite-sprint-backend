package com.satinfo.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "message")
	public class message {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "m_id")
	    private int m_id;

	    @Column(name = "m_name")
	    private String m_name;

	    @Column(name = "m_contact")
	    private String m_contact;

	    @Column(name = "m_email")
	    private String m_email;

	    @Column(name = "m_text")
	    private String m_text;

		public message() {
		
		}

		public message(int m_id, String m_name, String m_contact, String m_email, String m_text) {
			super();
			this.m_id = m_id;
			this.m_name = m_name;
			this.m_contact = m_contact;
			this.m_email = m_email;
			this.m_text = m_text;
		}

		public int getM_id() {
			return m_id;
		}

		public void setM_id(int m_id) {
			this.m_id = m_id;
		}

		public String getM_name() {
			return m_name;
		}

		public void setM_name(String m_name) {
			this.m_name = m_name;
		}

		public String getM_contact() {
			return m_contact;
		}

		public void setM_contact(String m_contact) {
			this.m_contact = m_contact;
		}

		public String getM_email() {
			return m_email;
		}

		public void setM_email(String m_email) {
			this.m_email = m_email;
		}

		public String getM_text() {
			return m_text;
		}

		public void setM_text(String m_text) {
			this.m_text = m_text;
		}

		@Override
		public String toString() {
			return "message [m_id=" + m_id + ", m_name=" + m_name + ", m_contact=" + m_contact + ", m_email=" + m_email
					+ ", m_text=" + m_text + "]";
		}
	
	}
	
