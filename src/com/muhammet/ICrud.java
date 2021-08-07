package com.muhammet;

import java.util.List;

public interface ICrud {

	// Programcý Sözleþmesi 
	// Kodlamada birlik saðlamak içni kullanýlýr.
	// Kodlarýn Anlaþýlabilirliðini arttýrýr.
	// Eksik kodlama olmasýnýn önüne geçer.
	//  
	// Create - Oluþtur, ekle 
	// Read   - oku, listele
	// Update - güncelle	
	// Delete - sil
	// Interface içinde tanýmlama(method) yaparken
	// method un genel tanýmý yapýlýr.
	// gövde kýsmý yazýlmaz.
	// Interface içinde kodlama yapmazsýnýz
	// genel hatlarý ile kalýplarý çkartýrsýnýz.
	public void Kaydet();
	public void Guncelle();
	public boolean Delete(long id);
	public List<Object> Listele();
	
}
