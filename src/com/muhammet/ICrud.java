package com.muhammet;

import java.util.List;

public interface ICrud {

	// Programc� S�zle�mesi 
	// Kodlamada birlik sa�lamak i�ni kullan�l�r.
	// Kodlar�n Anla��labilirli�ini artt�r�r.
	// Eksik kodlama olmas�n�n �n�ne ge�er.
	//  
	// Create - Olu�tur, ekle 
	// Read   - oku, listele
	// Update - g�ncelle	
	// Delete - sil
	// Interface i�inde tan�mlama(method) yaparken
	// method un genel tan�m� yap�l�r.
	// g�vde k�sm� yaz�lmaz.
	// Interface i�inde kodlama yapmazs�n�z
	// genel hatlar� ile kal�plar� �kart�rs�n�z.
	public void Kaydet();
	public void Guncelle();
	public boolean Delete(long id);
	public List<Object> Listele();
	
}
