package com.nkseguridad.app.Report;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.Path;
import com.itextpdf.text.pdf.parser.clipper.Paths;
import com.nkseguridad.app.Entity.DetallesDocumentoVenta;
import com.nkseguridad.app.Entity.DocumentoVenta;
import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Service.IImpuestoService;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;


public class PDFDocumentGenerator {
	
	private static Font COURIER = new Font(Font.FontFamily.COURIER, 20, Font.BOLD,BaseColor.BLUE);
	private static Font COURIER_SMALL = new Font(Font.FontFamily.COURIER, 14, Font.BOLD);
	private static Font COURIER_SMALL_FOOTER = new Font(Font.FontFamily.COURIER, 10, Font.BOLD);
	private static Font COURIER_SMALL_DETAIL = new Font(Font.FontFamily.COURIER, 10, Font.NORMAL);
	
	public static final String IMG1 = "/images/Phoenix-Logo.png";
	
	
	

	private static void leaveEmptyLine(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}
	
	public static ByteArrayInputStream DocumentReport(DocumentoVenta documentventa) {

		
		
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		try {
			
			Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
			PdfPTable table = null;
			PdfPCell hcell;
			
			PdfWriter.getInstance(document, out);
			document.open();
			
			//String localDateString = LocalDateTime.now().format(DateTimeFormatter.ofPattern(localDateFormat));
			

			table = new PdfPTable(3);
			table.setWidthPercentage(100);			
			table.setWidths(new int[] { 8, 15, 12 });
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));			
			hcell.setBorder(0);	
			table.addCell(hcell);//createImageCell(IMG1)
			
			hcell = new PdfPCell(new Phrase("Fenix Tecnologia", COURIER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setColspan(4);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("Servicios Informaticos", COURIER_SMALL));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("R.U.T.: 76.326.028-3", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			hcell.setBorder(1);
			table.addCell(hcell);			
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("Pumahue 1618 Puerto Montt", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("COTIZACION", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("+56 9 42061497 / frach2015@gmail.com", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("N° "+documentventa.getNumerodocumento(), COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			Paragraph p1 = new Paragraph();
			leaveEmptyLine(p1, 1);

			document.add(table);
			document.add(p1);
			
			
			
			table = new PdfPTable(3);
			table.setWidthPercentage(100);			
			table.setWidths(new int[] { 6, 18, 12 });			
			
			hcell = new PdfPCell(new Phrase("R.U.T:", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase(""+documentventa.getContacto().getNumeroidentificacion(), COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			String strDateFormat = "EEEE d 'de' MMMM 'de' YYYY"; // El formato de fecha está especificado  
	        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
	        
			
			hcell = new PdfPCell(new Phrase(""+objSDF.format(documentventa.getFechaemision()), COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("Razon Social:", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase(""+documentventa.getContacto().getNombreprimero()+" "+documentventa.getContacto().getApellidoprimero(), COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("Venta: "+documentventa.getFormapago().getNombre(), COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("Giro:", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("Dirección:", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase(""+documentventa.getContacto().getDireccionfiscal(), COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("Contacto:", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase(""+documentventa.getContacto().getCorreoe(), COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			p1 = new Paragraph();
			leaveEmptyLine(p1, 1);

			document.add(table);
			document.add(p1);
			
			table = new PdfPTable(5);
			table.setWidthPercentage(100);
			table.setWidths(new int[] { 5, 15, 5, 10, 10 });

			
			hcell = new PdfPCell(new Phrase("Código", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("Item", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("Cant.", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("P.unitario", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("Total Item", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(hcell);
			
			//document.add(table);
			Double totalpreciosiniva = 0.0;
			Double totaliva = 0.0;
			Double total = 0.0;
			Impuesto impuestoUpdate = null;
			Double porciva = 0.0;
			
			for (DetallesDocumentoVenta detalle : documentventa.getLstdetallesdocumentoventas()) {

				Impuesto impuesto = detalle.getImpuesto();
				PdfPCell cell;
				cell = new PdfPCell(new Phrase(detalle.getArticulo().getCodigo().toString(),COURIER_SMALL_DETAIL));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(detalle.getArticulo().getNomarticulo(),COURIER_SMALL_DETAIL));
				cell.setPaddingLeft(5);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(detalle.getCantidad().toString(),COURIER_SMALL_DETAIL));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setPaddingRight(5);
				table.addCell(cell);
				
				cell = new PdfPCell(new Phrase(detalle.getPreciounitariosiniva().toString(),COURIER_SMALL_DETAIL));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setPaddingRight(5);
				table.addCell(cell);
				porciva = impuesto.getNormal();
				Double preciototalitem = detalle.getCantidad() * detalle.getPreciounitariosiniva();
				totalpreciosiniva += preciototalitem;
				Double ivaitem = preciototalitem * (impuesto.getNormal()/100);
				totaliva += ivaitem;
				cell = new PdfPCell(new Phrase(preciototalitem.toString(),COURIER_SMALL_DETAIL));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setPaddingRight(5);
				table.addCell(cell);
			}
			total = totalpreciosiniva + totaliva;
			//document.add(p1);
			document.add(table);
			
			document.add(p1);
			
			table = new PdfPTable(5);
			table.setWidthPercentage(100);
			table.setWidths(new int[] { 5, 15, 5, 10, 10 });

			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("Neto :", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase(totalpreciosiniva.toString(), COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("IVA("+porciva+"%):", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(hcell);
			
			
			hcell = new PdfPCell(new Phrase(totaliva.toString(), COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
			hcell.setBorder(0);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase("Total:", COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(hcell);
			
			hcell = new PdfPCell(new Phrase(total.toString(), COURIER_SMALL_FOOTER));
			hcell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(hcell);
			
			document.add(table);

			document.close();

		} catch (DocumentException ex) {

			Logger.getLogger(PDFDocumentGenerator.class.getName()).log(Level.SEVERE, null, ex);
		}

		return new ByteArrayInputStream(out.toByteArray());
	}

	
}

