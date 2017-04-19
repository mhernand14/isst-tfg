package es.upm.dit.isst.tfg.model;

import java.io.Serializable;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class TFG implements Serializable {
	private static final long serialVersionUID = 01L;
	@Id
	private String autor;
	@Index
	private String tutor;
	
}
