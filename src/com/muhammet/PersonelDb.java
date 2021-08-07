package com.muhammet;

import java.util.List;

// bir s�n�f�n interface ile s�zle�me yapmas�d�r.
// bir interface s�n�f� implament edilir ise
// o interface i�inde bulunan t�m methodlar 
// kullan�lmak zorundad�r.
public class PersonelDb implements ICrud{

	@Override
	public void Kaydet() {
			System.out.println("Personel kay�t edildi");	
	}
	@Override
	public void Guncelle() {
		
	}

	@Override
	public boolean Delete(long id) {		
		return false;
	}

	@Override
	public List<Object> Listele() {
		return null;
	}

	public boolean Kaydet(Object personel) {
		return true;
	}
	
}
