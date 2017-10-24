package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Report
 *
 */
@Entity

public class Report implements Serializable {

	private ReportPk reportPk;

	@EmbeddedId
	public ReportPk getReportPk() {
		return reportPk;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setReportPk(ReportPk reportPk) {
		this.reportPk = reportPk;
	}

	private static final long serialVersionUID = 1L;

	public Report() {
		super();
	}

	private String reason;
}
