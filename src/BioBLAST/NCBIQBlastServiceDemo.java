package BioBLAST;


import static org.biojava3.ws.alignment.qblast.BlastAlignmentParameterEnum.ENTREZ_QUERY;
import java.io.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.biojava3.core.sequence.io.util.IOUtils;
import org.biojava3.ws.alignment.qblast.*;

public class NCBIQBlastServiceDemo {

	private static final String SEQUENCE = "MKWVTFISLLFLFSSAYSRGVFRRDAHKSEVAHRFKDLGEENFKALVLIAFAQYLQQCP"; // Blast
																											// query
																											// sequence

	public static void main(String[] args) {

		BlastOutput BO;

		NCBIQBlastService service = new NCBIQBlastService();

		// set alignment options
		NCBIQBlastAlignmentProperties props = new NCBIQBlastAlignmentProperties();
		props.setBlastProgram(BlastProgramEnum.blastp);
		props.setBlastDatabase("swissprot");
		props.setAlignmentOption(ENTREZ_QUERY,
				"\"serum albumin\"[Protein name] AND mammals[Organism]");

		// set output options
		NCBIQBlastOutputProperties outputProps = new NCBIQBlastOutputProperties();
		// in this example we use default values set by constructor (XML format,
		// pairwise alignment, 100 descriptions and alignments)

		// Example of two possible ways of setting output options
		// outputProps.setAlignmentNumber(200);
		// outputProps.setOutputOption(BlastOutputParameterEnum.ALIGNMENTS,
		// "200");

		String rid = null; // blast request ID
		FileWriter writer = null;
		BufferedReader reader = null;
		try {
			// send blast request and save request id
			rid = service.sendAlignmentRequest(SEQUENCE, props);

			// ---------------MyCode brakes the BioJava example here
			// -----------------------
			System.out.println("The newly submitted BLAST had a RID: " + rid);// This
																				// is
																				// just
																				// to
																				// display
																				// where
																				// goes
																				// the
																				// RID
																				// after
																				// you
																				// have
																				// submitted
																				// a
																				// new
																				// BLAST
			// ---------------MyCode brakes the BioJava example here
			// -----------------------\\

			// wait until results become available. Alternatively, one can do
			// other computations/send other alignment requests
			while (!service.isReady(rid)) {
				System.out
						.println("Waiting for results. Sleeping for 5 seconds");// This
																				// is
																				// very
																				// annoying,
																				// so
																				// you
																				// might
																				// want
																				// to
																				// comment
																				// out
																				// the
																				// "Waiting..."
				Thread.sleep(5000);
			}

			// read results when they are ready
			InputStream in = service.getAlignmentResults(rid, outputProps);

			// ---------------MyCode brakes the BioJava example here
			// -----------------------
			BO = NCBIQBlastServiceDemo.catchBLASTOutput(in);
			System.out.println(BO.getBlastOutputDb());
			System.out.println(BO.getBlastOutputIterations().getIteration()
					.get(0).getIterationHits().getHit().get(0).getHitDef());
			// we only had one BLAST query, so we are expecting only one
			// iteration, that's why .get(o).
			// same thing about the .getHit().get(0) - we are asking for the
			// best Hit, which is first on the list
			// etc, just use the BO getters
			// ---------------MyCode brakes the BioJava example here
			// -----------------------\\

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// clean up
			IOUtils.close(writer);
			IOUtils.close(reader);

			// delete given alignment results from blast server (optional
			// operation)
			service.sendDeleteRequest(rid);
		}
	}

	// ---------------MyCode brakes the BioJava example here
	// -----------------------
	private static BlastOutput catchBLASTOutput(InputStream in)
			throws Exception {
		JAXBContext jc = JAXBContext.newInstance(BlastOutput.class);
		Unmarshaller u = jc.createUnmarshaller();
		return (BlastOutput) u.unmarshal(in);
	}
	// ---------------MyCode brakes the BioJava example here
	// -----------------------\\
}