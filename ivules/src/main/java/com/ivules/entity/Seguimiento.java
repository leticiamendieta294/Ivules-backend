package com.ivules.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

@Entity
public class Seguimiento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_seguimiento")
	@SequenceGenerator(name="seq_seguimiento",sequenceName="seq_seguimiento",allocationSize=1)
	private Integer idSeguimiento;
	
	@Column(name = "fecha")
	private LocalDateTime fecha;
		
	@Column(name = "numero")
	private Integer numero;
	
	@Column(name = "fecha_creacion")
	private LocalDateTime fechaCreacion;	
	
	@Column(name = "usuario_creacion", length = 15)
	@Size(max=15, message="maximo 15 caracteres")
	private String usuarioCreacion;
	
	@Column(name = "fecha_modificacion")
	private LocalDateTime fechaModificacion;
	
	@Column(name = "usuario_modificacion", length = 15)
	@Size(max=15, message="maximo 15 caracteres")
	private String usuarioModificacion;
	
	@Column(name = "historia_ivu_ultima_visita_proyecto", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String historiaIVUUltimaVisitaProyecto;
	
	@Column(name = "menopausia", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String menopausia;
	
	@Column(name = "edad_menopausia", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String edadMenopausia;
	
	@Column(name = "anhos_histerectomia", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String anhosHisterectomia;
	
	
	public String getMenopausia() {
		return menopausia;
	}

	public void setMenopausia(String menopausia) {
		this.menopausia = menopausia;
	}

	public String getEdadMenopausia() {
		return edadMenopausia;
	}

	public void setEdadMenopausia(String edadMenopausia) {
		this.edadMenopausia = edadMenopausia;
	}

	@Column(name = "como_hizo_diagnostico", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String comoHizoDiagnostico;
	
	@Column(name = "urocultivo_positivo", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String urocultivoPositivo;
	
	
	@Column(name = "tratocon_antibioticos", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String tratoconAntibioticos;
	
	
	@Column(name = "tratocon_antibioticos_especificar", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String tratoconAntibioticosEspecificar;
	
	
	
	public String getUrocultivoPositivo() {
		return urocultivoPositivo;
	}

	public void setUrocultivoPositivo(String urocultivoPositivo) {
		this.urocultivoPositivo = urocultivoPositivo;
	}

	@Column(name = "tipo_individuo", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String tipoIndividuo;
	
	@Column(name = "tiempo_evolucion_les", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String tiempoEvolucionLes;
	
	@Column(name = "tratamiento_glucocorticoides", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String tratamientoGlucocorticoides;
	
	@Column(name = "dosis_diaria_cantidad_mg", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String dosisDiariaCantidadMg;
	
	@Column(name = "dosis_acumulada_desde_ultima_visita", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String dosisAcumuladaUltimaVisita;
	
	@Column(name = "tratamiento_inmunosupresores_is", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String tratamientoInmunosupresoresIs;
	
	@Column(name = "tipo_is", length = 10000)
	@Size(max=10000, message="maximo 10000 caracteres")
	private String tipoIs;
	
    @Column(name = "tipo_is_texto")	
	private String tipoISTexto;
	
	@Column(name = "otro_tipo_is", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String otroTipoIs;
	@Column(name = "dosis", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String dosis;
	
	@Column(name = "presenta_manifestacion_renal", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String presentaManifestacionRenal;
	
	@Column(name = "estado_encuentra", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String estadoEncuentra;
	
	@Column(name = "sledai_puntos0_30", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sledaiPuntos0A30;
	
	@Column(name = "fecha_diagnostico", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String fechaDiagnostico;
	
	@Column(name = "presento_sintomas", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String presentoSintomas;
	
	@Column(name = "sintomas_IVU", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String sintomasIVU;
	
	
	@Column(name = "otro_sintomas_IVU", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String otroSintomasIVU;
	
	@Column(name = "tipo_microbio", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String tipoMicrobio;
	
	@Column(name = "germen_asilado", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String germenAislado;
	
	@Column(name = "germen_aislado_texto", length = 100000)
	
	private String germenAisladoTexto;
	
	@Column(name = "otro_germen_aislado", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String otroGermenAislado;
	
	
	@Column(name = "tipo_antibiotico", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String tipoAntibiotico;
	
	@Column(name = "tipo_IVU", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String tipoIVU;
	
	
	@Column(name = "clasificacion_IVU", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String clasificacionIVU;
	
	
	@Column(name = "severidad_IVU", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String severidadIVU;
	
	@Column(name = "nro_IVUs", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String nroIVUs;
	
	@Column(name = "factores_riesgo_sexualmente_activo", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoSexualmenteActivo;
	
	@Column(name = "factores_riesgo_estreñimiento_cronico", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoEstreñimientoCronico;
	
	@Column(name = "factores_riesgo_incontinencia_urinaria", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoIncontinenciaUrinaria;
	
	@Column(name = "factores_riesgo_sondaje_vesical_previo", length = 100)
	@Size(max=100, message="maximo 100 caracteres")	
	private String factoresRiesgoSondajeVesicalPrevio;
	
	
	@Column(name = "factores_riesgo_procedimiento_urinario_ginec_previo", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoProcedimientoUrinarioGinecPrevio;
	
	
	@Column(name = "procedimiento_urinario_ginec_previo_especificar", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String procedimientoUrinarioGinecPrevioEspecificar;
	
	
	@Column(name = "recibio_profilaxis_acorde_guias", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String recibioProfilaxisAcordeGuias;
	
	
	@Column(name = "factores_riesgo_antecedentes_ivu", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoAntecedentesIvu;
	
	@Column(name = "factores_riesgo_antibioticoterapia_ultima_visita", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoAntibioticoterapiaUltimaVisita;
	
	
	@Column(name = "antibioticoterapia_ultima_visita_especificar", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String antibioticoterapiaUltimaVisitaEspecificar;
	
	@Column(name = "factores_riesgo_anomaliasanatomicastractourinarioespecificar", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String factoresRiesgoAnomaliasAnatomicasTractoEspecificar;

	@Column(name = "factores_riesgo_embarazo", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoEmbarazo;
	
	@Column(name = "otros_factores_riesgo", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String otrosFactoresRiesgo;
	
	
	@Column(name = "factores_riesgo_litiasis_renal", length = 100)
	@Size(max=100, message="maximo 100 caracteres")	
	private String factoresRiesgoLitiasisRenal;
	
	
	@Column(name = "factores_riesgo_corticoides", length = 100)
	@Size(max=100, message="maximo 100 caracteres")	
	private String factoresRiesgoCorticoides;
	
	
	
	@Column(name = "factores_riesgo_cancer", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoCancer;

	
	
	@Column(name = "factores_riesgo_sindromeSjogren", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoSindromeSjogren;
	
	@Column(name = "factores_riesgo_tipo_estreñimientocronico", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoTipoEstreñimientoCronico;
	
	@Column(name = "factores_riesgo_frecuencia_urinaria_baja", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoFrecuenciaUrinariaBaja;
	
	@Column(name = "factores_riesgo_actividad_sexual_nroveces", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoActividadSexualNroVeces;
	
	@Column(name = "factores_riesgo_tipo_incontinencia_urinaria", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoTipoIncontinenciaUrinaria;
	
	
	@Column(name = "factores_riesgo_enfermedad_renal_cronica", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoEnfermedadRenalCronica;
	
	@Column(name = "factores_riesgo_hiperplasia_prostatica_benigna", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoHiperplasiaProstaticaBenigna;
	
	@Column(name = "factores_riesgo_diabetes", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoDiabetes;
	
	@Column(name = "factores_riesgo_anomaliasanatomicastractourinario", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoAnomaliasAnatomicasTractoUrinario;
	

	
	@Column(name = "factores_riesgo_leucopenia", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoLeucopenia;
	
	@Column(name = "factores_riesgo_tipo_leucopenia", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoTipoLeucopenia;
	
	@Column(name = "firma_encargado", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String firmaEncargado;
	
	@Column(name = "tipoActividadSexual", length = 1000)
	@Size(max=100, message="maximo 1000 caracteres")
	private String tipoActividadSexual;
	
	@Column(name = "factores_riesgo_baja_ingestaliquidos", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoBajaIngestaliquidos;
	
	@Column(name = "factores_riesgo_otras_causas_inmunodepresion", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String factoresRiesgoOtrasCausasInmunodepresion;
	
	@Column(name = "otras_causas_inmunodepresion_especificar", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String OtrasCausasInmunodepresionEspecificar;
	
	public String getTipoActividadSexual() {
		return tipoActividadSexual;
	}

	public void setTipoActividadSexual(String tipoActividadSexual) {
		this.tipoActividadSexual = tipoActividadSexual;
	}
	@Column(name = "infeccionVaginal", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String infeccionVaginal;
	
	@Column(name = "nroInfeccionVaginalAnual", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String nroInfeccionVaginalAnual;
	
	@Column(name = "antiDNA_positivo", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String antiDNAPositivo;
	
	
	@Column(name = "complementos_bajos", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String complementosBajos;
	
	
	@Column(name = "bacteriuria_asintomatica_ultima_visita", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String bacteriuriaAsintomaticaUltimaVisita;
	
	@Column(name = "tratamiento_bacteriuria_asintomatica", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String tratamientoBacteriuriaAsintomatica;
	
	@Column(name = "tratamiento_bacteriuria_asintomatica_especificar", length = 10000)
	@Size(max=100, message="maximo 10000 caracteres")
	private String tratamientoBacteriuriaAsintomaticaEspecificar;
	
	
	/*Sintomas*/
	
	public String getInfeccionVaginal() {
		return infeccionVaginal;
	}

	public void setInfeccionVaginal(String infeccionVaginal) {
		this.infeccionVaginal = infeccionVaginal;
	}

	public String getNroInfeccionVaginalAnual() {
		return nroInfeccionVaginalAnual;
	}

	public void setNroInfeccionVaginalAnual(String nroInfeccionVaginalAnual) {
		this.nroInfeccionVaginalAnual = nroInfeccionVaginalAnual;
	}

	@Column(name = "sintoma_disuria", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaDisuria;


	@Column(name = "sintoma_polaquiuria", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaPolaquiuria;

	@Column(name = "sintoma_tenesmo", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaTenesmo;
  
	@Column(name = "sintoma_hematuria", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaHematuria;

	@Column(name = "sintoma_presion_abdomen", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaPresionAbdomen; //Presión o retorcijones en la parte inferior del abdomen

	@Column(name = "sintoma_urgencia", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaUrgencia;

	@Column(name = "sintoma_fiebre", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaFiebre;
	
	@Column(name = "sintoma_vomito", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaVomito;
	
	@Column(name = "sintoma_dolor_lumbar", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaDolorLumbar;
	
	@Column(name = "fecha_ingreso", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String fechaIngreso;
	
	
	@Column(name = "laboratorio_uno", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String laboratorioUno;
	
	@Column(name = "laboratorio_dos", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String laboratorioDos;
	
	@Column(name = "laboratorio_tres", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String laboratorioTres;
	
	@Column(name = "laboratorio_cuatro", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String laboratorioCuatro;

	/*-------------NUEVOS SINTOMAS-----------------------*/

	@Column(name = "sintomas_urinarios", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String sintomasUrinarios;
	
	@Column(name = "sintoma_urinario_disuria", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaUrinarioDisuria;


	@Column(name = "sintoma_urinario_polaquiuria", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaUrinarioPolaquiuria;

	@Column(name = "sintoma_urinario_tenesmo", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaUrinarioTenesmo;
  
	@Column(name = "sintoma_urinario_urgencia_miccional", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaUrinarioUrgenciaMiccional;

	@Column(name = "sintoma_urinario_fiebre", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaUrinarioFiebre;
	
	
	@Column(name = "sintoma_urinario_dolor_suprapubico", length = 100)
	@Size(max=100, message="maximo 100 caracteres")
	private String sintomaUrinarioDolorSuprapubico;
	
	
	@Column(name = "otro_sintomas_urinarios", length = 100000)
	@Size(max=100000, message="maximo 100000 caracteres")
	private String otroSintomasUrinarios;
	
	
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id", referencedColumnName = "personaId" )
    private Personas personas;
	
	

	@PrePersist
	private void create() {
		this.fechaCreacion = LocalDateTime.now();
	}
	
	@PreUpdate
	private void update() {
		this.fechaModificacion = LocalDateTime.now();
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}


	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Integer getIdSeguimiento() {
		return idSeguimiento;
	}

	public void setIdSeguimiento(Integer idSeguimiento) {
		this.idSeguimiento = idSeguimiento;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Personas getPersona() {
		return personas;
	}

	public void setPersona(Personas personas) {
		this.personas = personas;
	}

	public Personas getPersonas() {
		return personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

	

	
	public String getHistoriaIVUUltimaVisitaProyecto() {
		return historiaIVUUltimaVisitaProyecto;
	}

	public void setHistoriaIVUUltimaVisitaProyecto(String historiaIVUUltimaVisitaProyecto) {
		this.historiaIVUUltimaVisitaProyecto = historiaIVUUltimaVisitaProyecto;
	}

	public String getTipoIndividuo() {
		return tipoIndividuo;
	}

	public void setTipoIndividuo(String tipoIndividuo) {
		this.tipoIndividuo = tipoIndividuo;
	}

	public String getTiempoEvolucionLes() {
		return tiempoEvolucionLes;
	}

	public void setTiempoEvolucionLes(String tiempoEvolucionLes) {
		this.tiempoEvolucionLes = tiempoEvolucionLes;
	}

	public String getTratamientoGlucocorticoides() {
		return tratamientoGlucocorticoides;
	}

	public void setTratamientoGlucocorticoides(String tratamientoGlucocorticoides) {
		this.tratamientoGlucocorticoides = tratamientoGlucocorticoides;
	}

	public String getDosisDiariaCantidadMg() {
		return dosisDiariaCantidadMg;
	}

	public void setDosisDiariaCantidadMg(String dosisDiariaCantidadMg) {
		this.dosisDiariaCantidadMg = dosisDiariaCantidadMg;
	}

	
	public String getDosisAcumuladaUltimaVisita() {
		return dosisAcumuladaUltimaVisita;
	}

	public void setDosisAcumuladaUltimaVisita(String dosisAcumuladaUltimaVisita) {
		this.dosisAcumuladaUltimaVisita = dosisAcumuladaUltimaVisita;
	}

	public String getTratamientoInmunosupresoresIs() {
		return tratamientoInmunosupresoresIs;
	}

	public void setTratamientoInmunosupresoresIs(String tratamientoInmunosupresoresIs) {
		this.tratamientoInmunosupresoresIs = tratamientoInmunosupresoresIs;
	}

	public String getTipoIs() {
		return tipoIs;
	}

	public void setTipoIs(String tipoIs) {
		this.tipoIs = tipoIs;
	}

	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public String getPresentaManifestacionRenal() {
		return presentaManifestacionRenal;
	}

	public void setPresentaManifestacionRenal(String presentaManifestacionRenal) {
		this.presentaManifestacionRenal = presentaManifestacionRenal;
	}

	public String getEstadoEncuentra() {
		return estadoEncuentra;
	}

	public void setEstadoEncuentra(String estadoEncuentra) {
		this.estadoEncuentra = estadoEncuentra;
	}

	public String getSledaiPuntos0A30() {
		return sledaiPuntos0A30;
	}

	public void setSledaiPuntos0A30(String sledaiPuntos0A30) {
		this.sledaiPuntos0A30 = sledaiPuntos0A30;
	}

	public String getFechaDiagnostico() {
		return fechaDiagnostico;
	}

	public void setFechaDiagnostico(String fechaDiagnostico) {
		this.fechaDiagnostico = fechaDiagnostico;
	}

	public String getPresentoSintomas() {
		return presentoSintomas;
	}

	public void setPresentoSintomas(String presentoSintomas) {
		this.presentoSintomas = presentoSintomas;
	}

	public String getSintomasIVU() {
		return sintomasIVU;
	}

	public void setSintomasIVU(String sintomasIVU) {
		this.sintomasIVU = sintomasIVU;
	}

	public String getTipoMicrobio() {
		return tipoMicrobio;
	}

	public void setTipoMicrobio(String tipoMicrobio) {
		this.tipoMicrobio = tipoMicrobio;
	}

	public String getGermenAislado() {
		return germenAislado;
	}

	public void setGermenAislado(String germenAislado) {
		this.germenAislado = germenAislado;
	}

	public String getTipoAntibiotico() {
		return tipoAntibiotico;
	}

	public void setTipoAntibiotico(String tipoAntibiotico) {
		this.tipoAntibiotico = tipoAntibiotico;
	}

	public String getTipoIVU() {
		return tipoIVU;
	}

	public void setTipoIVU(String tipoIVU) {
		this.tipoIVU = tipoIVU;
	}


	

	public String getNroIVUs() {
		return nroIVUs;
	}

	public void setNroIVUs(String nroIVUs) {
		this.nroIVUs = nroIVUs;
	}

	
	public String getFactoresRiesgoSexualmenteActivo() {
		return factoresRiesgoSexualmenteActivo;
	}

	public void setFactoresRiesgoSexualmenteActivo(String factoresRiesgoSexualmenteActivo) {
		this.factoresRiesgoSexualmenteActivo = factoresRiesgoSexualmenteActivo;
	}

	public String getFactoresRiesgoEstreñimientoCronico() {
		return factoresRiesgoEstreñimientoCronico;
	}

	public void setFactoresRiesgoEstreñimientoCronico(String factoresRiesgoEstreñimientoCronico) {
		this.factoresRiesgoEstreñimientoCronico = factoresRiesgoEstreñimientoCronico;
	}

	public String getFactoresRiesgoIncontinenciaUrinaria() {
		return factoresRiesgoIncontinenciaUrinaria;
	}

	public void setFactoresRiesgoIncontinenciaUrinaria(String factoresRiesgoIncontinenciaUrinaria) {
		this.factoresRiesgoIncontinenciaUrinaria = factoresRiesgoIncontinenciaUrinaria;
	}

	public String getFactoresRiesgoSondajeVesicalPrevio() {
		return factoresRiesgoSondajeVesicalPrevio;
	}

	public void setFactoresRiesgoSondajeVesicalPrevio(String factoresRiesgoSondajeVesicalPrevio) {
		this.factoresRiesgoSondajeVesicalPrevio = factoresRiesgoSondajeVesicalPrevio;
	}

	public String getFactoresRiesgoProcedimientoUrinarioGinecPrevio() {
		return factoresRiesgoProcedimientoUrinarioGinecPrevio;
	}

	public void setFactoresRiesgoProcedimientoUrinarioGinecPrevio(String factoresRiesgoProcedimientoUrinarioGinecPrevio) {
		this.factoresRiesgoProcedimientoUrinarioGinecPrevio = factoresRiesgoProcedimientoUrinarioGinecPrevio;
	}

	

	public String getFactoresRiesgoAntibioticoterapiaUltimaVisita() {
		return factoresRiesgoAntibioticoterapiaUltimaVisita;
	}

	public void setFactoresRiesgoAntibioticoterapiaUltimaVisita(String factoresRiesgoAntibioticoterapiaUltimaVisita) {
		this.factoresRiesgoAntibioticoterapiaUltimaVisita = factoresRiesgoAntibioticoterapiaUltimaVisita;
	}

	public String getAntibioticoterapiaUltimaVisitaEspecificar() {
		return antibioticoterapiaUltimaVisitaEspecificar;
	}

	public void setAntibioticoterapiaUltimaVisitaEspecificar(String antibioticoterapiaUltimaVisitaEspecificar) {
		this.antibioticoterapiaUltimaVisitaEspecificar = antibioticoterapiaUltimaVisitaEspecificar;
	}

	public String getFactoresRiesgoEmbarazo() {
		return factoresRiesgoEmbarazo;
	}

	public void setFactoresRiesgoEmbarazo(String factoresRiesgoEmbarazo) {
		this.factoresRiesgoEmbarazo = factoresRiesgoEmbarazo;
	}

	public String getOtrosFactoresRiesgo() {
		return otrosFactoresRiesgo;
	}

	public void setOtrosFactoresRiesgo(String otrosFactoresRiesgo) {
		this.otrosFactoresRiesgo = otrosFactoresRiesgo;
	}

	public String getOtroTipoIs() {
		return otroTipoIs;
	}

	public void setOtroTipoIs(String otroTipoIs) {
		this.otroTipoIs = otroTipoIs;
	}

	

	public String getOtroSintomasIVU() {
		return otroSintomasIVU;
	}

	public void setOtroSintomasIVU(String otroSintomasIVU) {
		this.otroSintomasIVU = otroSintomasIVU;
	}

	public String getOtroGermenAislado() {
		return otroGermenAislado;
	}

	public void setOtroGermenAislado(String otroGermenAislado) {
		this.otroGermenAislado = otroGermenAislado;
	}

	public String getFactoresRiesgoLitiasisRenal() {
		return factoresRiesgoLitiasisRenal;
	}

	public void setFactoresRiesgoLitiasisRenal(String factoresRiesgoLitiasisRenal) {
		this.factoresRiesgoLitiasisRenal = factoresRiesgoLitiasisRenal;
	}

	
	public String getFactoresRiesgoTipoEstreñimientoCronico() {
		return factoresRiesgoTipoEstreñimientoCronico;
	}

	public void setFactoresRiesgoTipoEstreñimientoCronico(String factoresRiesgoTipoEstreñimientoCronico) {
		this.factoresRiesgoTipoEstreñimientoCronico = factoresRiesgoTipoEstreñimientoCronico;
	}

	public String getFactoresRiesgoFrecuenciaUrinariaBaja() {
		return factoresRiesgoFrecuenciaUrinariaBaja;
	}

	public void setFactoresRiesgoFrecuenciaUrinariaBaja(String factoresRiesgoFrecuenciaUrinariaBaja) {
		this.factoresRiesgoFrecuenciaUrinariaBaja = factoresRiesgoFrecuenciaUrinariaBaja;
	}

	public String getFactoresRiesgoActividadSexualNroVeces() {
		return factoresRiesgoActividadSexualNroVeces;
	}

	public void setFactoresRiesgoActividadSexualNroVeces(String factoresRiesgoActividadSexualNroVeces) {
		this.factoresRiesgoActividadSexualNroVeces = factoresRiesgoActividadSexualNroVeces;
	}

	public String getFactoresRiesgoTipoIncontinenciaUrinaria() {
		return factoresRiesgoTipoIncontinenciaUrinaria;
	}

	public void setFactoresRiesgoTipoIncontinenciaUrinaria(String factoresRiesgoTipoIncontinenciaUrinaria) {
		this.factoresRiesgoTipoIncontinenciaUrinaria = factoresRiesgoTipoIncontinenciaUrinaria;
	}


	public String getFactoresRiesgoEnfermedadRenalCronica() {
		return factoresRiesgoEnfermedadRenalCronica;
	}

	public void setFactoresRiesgoEnfermedadRenalCronica(String factoresRiesgoEnfermedadRenalCronica) {
		this.factoresRiesgoEnfermedadRenalCronica = factoresRiesgoEnfermedadRenalCronica;
	}

	public String getFactoresRiesgoHiperplasiaProstaticaBenigna() {
		return factoresRiesgoHiperplasiaProstaticaBenigna;
	}

	public void setFactoresRiesgoHiperplasiaProstaticaBenigna(String factoresRiesgoHiperplasiaProstaticaBenigna) {
		this.factoresRiesgoHiperplasiaProstaticaBenigna = factoresRiesgoHiperplasiaProstaticaBenigna;
	}

	public String getFactoresRiesgoDiabetes() {
		return factoresRiesgoDiabetes;
	}

	public void setFactoresRiesgoDiabetes(String factoresRiesgoDiabetes) {
		this.factoresRiesgoDiabetes = factoresRiesgoDiabetes;
	}

	public String getFactoresRiesgoAnomaliasAnatomicasTractoUrinario() {
		return factoresRiesgoAnomaliasAnatomicasTractoUrinario;
	}

	public void setFactoresRiesgoAnomaliasAnatomicasTractoUrinario(String factoresRiesgoAnomaliasAnatomicasTractoUrinario) {
		this.factoresRiesgoAnomaliasAnatomicasTractoUrinario = factoresRiesgoAnomaliasAnatomicasTractoUrinario;
	}

	

	public String getFactoresRiesgoLeucopenia() {
		return factoresRiesgoLeucopenia;
	}

	public void setFactoresRiesgoLeucopenia(String factoresRiesgoLeucopenia) {
		this.factoresRiesgoLeucopenia = factoresRiesgoLeucopenia;
	}

	public String getFactoresRiesgoTipoLeucopenia() {
		return factoresRiesgoTipoLeucopenia;
	}

	public void setFactoresRiesgoTipoLeucopenia(String factoresRiesgoTipoLeucopenia) {
		this.factoresRiesgoTipoLeucopenia = factoresRiesgoTipoLeucopenia;
	}



	public String getFirmaEncargado() {
		return firmaEncargado;
	}

	public void setFirmaEncargado(String firmaEncargado) {
		this.firmaEncargado = firmaEncargado;
	}

	public String getFactoresRiesgoSindromeSjogren() {
		return factoresRiesgoSindromeSjogren;
	}

	public void setFactoresRiesgoSindromeSjogren(String factoresRiesgoSindromeSjogren) {
		this.factoresRiesgoSindromeSjogren = factoresRiesgoSindromeSjogren;
	}

	public String getSintomaDisuria() {
		return sintomaDisuria;
	}

	public void setSintomaDisuria(String sintomaDisuria) {
		this.sintomaDisuria = sintomaDisuria;
	}

	public String getSintomaPolaquiuria() {
		return sintomaPolaquiuria;
	}

	public void setSintomaPolaquiuria(String sintomaPolaquiuria) {
		this.sintomaPolaquiuria = sintomaPolaquiuria;
	}

	public String getSintomaTenesmo() {
		return sintomaTenesmo;
	}

	public void setSintomaTenesmo(String sintomaTenesmo) {
		this.sintomaTenesmo = sintomaTenesmo;
	}

	public String getSintomaHematuria() {
		return sintomaHematuria;
	}

	public void setSintomaHematuria(String sintomaHematuria) {
		this.sintomaHematuria = sintomaHematuria;
	}

	public String getSintomaPresionAbdomen() {
		return sintomaPresionAbdomen;
	}

	public void setSintomaPresionAbdomen(String sintomaPresionAbdomen) {
		this.sintomaPresionAbdomen = sintomaPresionAbdomen;
	}

	public String getSintomaUrgencia() {
		return sintomaUrgencia;
	}

	public void setSintomaUrgencia(String sintomaUrgencia) {
		this.sintomaUrgencia = sintomaUrgencia;
	}

	public String getSintomaFiebre() {
		return sintomaFiebre;
	}

	public void setSintomaFiebre(String sintomaFiebre) {
		this.sintomaFiebre = sintomaFiebre;
	}

	public String getSintomaVomito() {
		return sintomaVomito;
	}

	public void setSintomaVomito(String sintomaVomito) {
		this.sintomaVomito = sintomaVomito;
	}

	public String getSintomaDolorLumbar() {
		return sintomaDolorLumbar;
	}

	public void setSintomaDolorLumbar(String sintomaDolorLumbar) {
		this.sintomaDolorLumbar = sintomaDolorLumbar;
	}

	public String getFactoresRiesgoBajaIngestaliquidos() {
		return factoresRiesgoBajaIngestaliquidos;
	}

	public void setFactoresRiesgoBajaIngestaliquidos(String factoresRiesgoBajaIngestaliquidos) {
		this.factoresRiesgoBajaIngestaliquidos = factoresRiesgoBajaIngestaliquidos;
	}

	public String getRecibioProfilaxisAcordeGuias() {
		return recibioProfilaxisAcordeGuias;
	}

	public void setRecibioProfilaxisAcordeGuias(String recibioProfilaxisAcordeGuias) {
		this.recibioProfilaxisAcordeGuias = recibioProfilaxisAcordeGuias;
	}

	public String getFactoresRiesgoCancer() {
		return factoresRiesgoCancer;
	}

	public void setFactoresRiesgoCancer(String factoresRiesgoCancer) {
		this.factoresRiesgoCancer = factoresRiesgoCancer;
	}

	public String getFactoresRiesgoOtrasCausasInmunodepresion() {
		return factoresRiesgoOtrasCausasInmunodepresion;
	}

	public void setFactoresRiesgoOtrasCausasInmunodepresion(String factoresRiesgoOtrasCausasInmunodepresion) {
		this.factoresRiesgoOtrasCausasInmunodepresion = factoresRiesgoOtrasCausasInmunodepresion;
	}

	public String getOtrasCausasInmunodepresionEspecificar() {
		return OtrasCausasInmunodepresionEspecificar;
	}

	public void setOtrasCausasInmunodepresionEspecificar(String otrasCausasInmunodepresionEspecificar) {
		OtrasCausasInmunodepresionEspecificar = otrasCausasInmunodepresionEspecificar;
	}

	public String getAntiDNAPositivo() {
		return antiDNAPositivo;
	}

	public void setAntiDNAPositivo(String antiDNAPositivo) {
		this.antiDNAPositivo = antiDNAPositivo;
	}

	public String getComplementosBajos() {
		return complementosBajos;
	}

	public void setComplementosBajos(String complementosBajos) {
		this.complementosBajos = complementosBajos;
	}


	
	
	public String getComoHizoDiagnostico() {
		return comoHizoDiagnostico;
	}

	public void setComoHizoDiagnostico(String comoHizoDiagnostico) {
		this.comoHizoDiagnostico = comoHizoDiagnostico;
	}

	public String getClasificacionIVU() {
		return clasificacionIVU;
	}

	public void setClasificacionIVU(String clasificacionIVU) {
		this.clasificacionIVU = clasificacionIVU;
	}

	public String getSeveridadIVU() {
		return severidadIVU;
	}

	public void setSeveridadIVU(String severidadIVU) {
		this.severidadIVU = severidadIVU;
	}
	
	
	public String getFactoresRiesgoAntecedentesIvu() {
		return factoresRiesgoAntecedentesIvu;
	}

	public void setFactoresRiesgoAntecedentesIvu(String factoresRiesgoAntecedentesIvu) {
		this.factoresRiesgoAntecedentesIvu = factoresRiesgoAntecedentesIvu;
	}

	public String getFactoresRiesgoCorticoides() {
		return factoresRiesgoCorticoides;
	}

	public void setFactoresRiesgoCorticoides(String factoresRiesgoCorticoides) {
		this.factoresRiesgoCorticoides = factoresRiesgoCorticoides;
	}

	public String getBacteriuriaAsintomaticaUltimaVisita() {
		return bacteriuriaAsintomaticaUltimaVisita;
	}

	public void setBacteriuriaAsintomaticaUltimaVisita(String bacteriuriaAsintomaticaUltimaVisita) {
		this.bacteriuriaAsintomaticaUltimaVisita = bacteriuriaAsintomaticaUltimaVisita;
	}

	public String getTratamientoBacteriuriaAsintomatica() {
		return tratamientoBacteriuriaAsintomatica;
	}

	public void setTratamientoBacteriuriaAsintomatica(String tratamientoBacteriuriaAsintomatica) {
		this.tratamientoBacteriuriaAsintomatica = tratamientoBacteriuriaAsintomatica;
	}

	public String getTratamientoBacteriuriaAsintomaticaEspecificar() {
		return tratamientoBacteriuriaAsintomaticaEspecificar;
	}

	public void setTratamientoBacteriuriaAsintomaticaEspecificar(String tratamientoBacteriuriaAsintomaticaEspecificar) {
		this.tratamientoBacteriuriaAsintomaticaEspecificar = tratamientoBacteriuriaAsintomaticaEspecificar;
	}

	public String getTratoconAntibioticos() {
		return tratoconAntibioticos;
	}

	public void setTratoconAntibioticos(String tratoconAntibioticos) {
		this.tratoconAntibioticos = tratoconAntibioticos;
	}

	public String getTratoconAntibioticosEspecificar() {
		return tratoconAntibioticosEspecificar;
	}

	public void setTratoconAntibioticosEspecificar(String tratoconAntibioticosEspecificar) {
		this.tratoconAntibioticosEspecificar = tratoconAntibioticosEspecificar;
	}

	public String getProcedimientoUrinarioGinecPrevioEspecificar() {
		return procedimientoUrinarioGinecPrevioEspecificar;
	}

	public void setProcedimientoUrinarioGinecPrevioEspecificar(String procedimientoUrinarioGinecPrevioEspecificar) {
		this.procedimientoUrinarioGinecPrevioEspecificar = procedimientoUrinarioGinecPrevioEspecificar;
	}

	public String getFactoresRiesgoAnomaliasAnatomicasTractoEspecificar() {
		return factoresRiesgoAnomaliasAnatomicasTractoEspecificar;
	}

	public void setFactoresRiesgoAnomaliasAnatomicasTractoEspecificar(
			String factoresRiesgoAnomaliasAnatomicasTractoEspecificar) {
		this.factoresRiesgoAnomaliasAnatomicasTractoEspecificar = factoresRiesgoAnomaliasAnatomicasTractoEspecificar;
	}

	public String getAnhosHisterectomia() {
		return anhosHisterectomia;
	}

	public void setAnhosHisterectomia(String anhosHisterectomia) {
		this.anhosHisterectomia = anhosHisterectomia;
	}

	public String getTipoISTexto() {
		return tipoISTexto;
	}

	public void setTipoISTexto(String tipoISTexto) {
		this.tipoISTexto = tipoISTexto;
	}



	public String getGermenAisladoTexto() {
		return germenAisladoTexto;
	}

	public void setGermenAisladoTexto(String germenAisladoTexto) {
		this.germenAisladoTexto = germenAisladoTexto;
	}

	public String getLaboratorioUno() {
		return laboratorioUno;
	}

	public void setLaboratorioUno(String laboratorioUno) {
		this.laboratorioUno = laboratorioUno;
	}

	public String getLaboratorioDos() {
		return laboratorioDos;
	}

	public void setLaboratorioDos(String laboratorioDos) {
		this.laboratorioDos = laboratorioDos;
	}

	public String getLaboratorioTres() {
		return laboratorioTres;
	}

	public void setLaboratorioTres(String laboratorioTres) {
		this.laboratorioTres = laboratorioTres;
	}

	public String getLaboratorioCuatro() {
		return laboratorioCuatro;
	}

	public void setLaboratorioCuatro(String laboratorioCuatro) {
		this.laboratorioCuatro = laboratorioCuatro;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getSintomasUrinarios() {
		return sintomasUrinarios;
	}

	public void setSintomasUrinarios(String sintomasUrinarios) {
		this.sintomasUrinarios = sintomasUrinarios;
	}

	public String getSintomaUrinarioDisuria() {
		return sintomaUrinarioDisuria;
	}

	public void setSintomaUrinarioDisuria(String sintomaUrinarioDisuria) {
		this.sintomaUrinarioDisuria = sintomaUrinarioDisuria;
	}

	public String getSintomaUrinarioPolaquiuria() {
		return sintomaUrinarioPolaquiuria;
	}

	public void setSintomaUrinarioPolaquiuria(String sintomaUrinarioPolaquiuria) {
		this.sintomaUrinarioPolaquiuria = sintomaUrinarioPolaquiuria;
	}

	public String getSintomaUrinarioTenesmo() {
		return sintomaUrinarioTenesmo;
	}

	public void setSintomaUrinarioTenesmo(String sintomaUrinarioTenesmo) {
		this.sintomaUrinarioTenesmo = sintomaUrinarioTenesmo;
	}

	public String getSintomaUrinarioUrgenciaMiccional() {
		return sintomaUrinarioUrgenciaMiccional;
	}

	public void setSintomaUrinarioUrgenciaMiccional(String sintomaUrinarioUrgenciaMiccional) {
		this.sintomaUrinarioUrgenciaMiccional = sintomaUrinarioUrgenciaMiccional;
	}

	public String getSintomaUrinarioFiebre() {
		return sintomaUrinarioFiebre;
	}

	public void setSintomaUrinarioFiebre(String sintomaUrinarioFiebre) {
		this.sintomaUrinarioFiebre = sintomaUrinarioFiebre;
	}

	public String getSintomaUrinarioDolorSuprapubico() {
		return sintomaUrinarioDolorSuprapubico;
	}

	public void setSintomaUrinarioDolorSuprapubico(String sintomaUrinarioDolorSuprapubico) {
		this.sintomaUrinarioDolorSuprapubico = sintomaUrinarioDolorSuprapubico;
	}

	public String getOtroSintomasUrinarios() {
		return otroSintomasUrinarios;
	}

	public void setOtroSintomasUrinarios(String otroSintomasUrinarios) {
		this.otroSintomasUrinarios = otroSintomasUrinarios;
	}
	
	
	
	
	
	

}
