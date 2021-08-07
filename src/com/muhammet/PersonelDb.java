package com.muhammet;

import java.util.List;

// bir sýnýfýn interface ile sözleþme yapmasýdýr.
// bir interface sýnýfý implament edilir ise
// o interface içinde bulunan tüm methodlar 
// kullanýlmak zorundadýr.
public class PersonelDb implements ICrud{

	@Override
	public void Kaydet() {
			System.out.println("Personel kayýt edildi");	
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
