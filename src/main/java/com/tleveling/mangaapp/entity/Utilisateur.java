package com.tleveling.mangaapp.entity;


import java.util.Objects;

public class Utilisateur {
	private Integer idUtilisateur;
	private String pseudo;
	private String mdp;
	private String nom;
	private String prenom;
	private String roles;

	public Utilisateur() {
	}

	public Utilisateur(Integer idUtilisateur, String pseudo, String mdp, String nom, String prenom, String roles) {
		this(pseudo, mdp, nom, prenom, roles);
		this.idUtilisateur = idUtilisateur;

	}

	public Utilisateur(String pseudo, String mdp, String nom, String prenom, String roles) {

		this.pseudo = pseudo;
		this.mdp = mdp;
		this.nom = nom;
		this.prenom = prenom;
		this.roles = roles;
	}

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Utilisateur that = (Utilisateur) o;
		return Objects.equals(idUtilisateur, that.idUtilisateur);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idUtilisateur);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Utilisateur{");
		sb.append("idUtilisateur=").append(idUtilisateur);
		sb.append(", pseudo='").append(pseudo).append('\'');
		sb.append(", mdp='").append(mdp).append('\'');
		sb.append(", nom='").append(nom).append('\'');
		sb.append(", prenom='").append(prenom).append('\'');
		sb.append(", roles='").append(roles).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
