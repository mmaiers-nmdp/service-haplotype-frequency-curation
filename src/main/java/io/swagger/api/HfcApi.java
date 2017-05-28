package io.swagger.api;

import io.swagger.model.CohortData;
import io.swagger.model.Error;
import io.swagger.model.HFCurationListResponse;
import io.swagger.model.HFCurationRequest;
import io.swagger.model.HFCurationResponse;
import io.swagger.model.HaplotypeFrequencyData;
import io.swagger.model.LabelData;
import io.swagger.model.PopulationData;
import io.swagger.model.PopulationResponse;
import io.swagger.model.PopulationSubmissionResponse;
import io.swagger.model.ScopeData;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T11:57:21.787-05:00")

@Api(value = "hfc", description = "the hfc API")
public interface HfcApi {

    @ApiOperation(value = "", notes = "Gets a list of all submission data sets ", response = HFCurationListResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = HFCurationListResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error ocurred", response = HFCurationListResponse.class) })
    @RequestMapping(value = "/hfc",
        method = RequestMethod.GET)
    default ResponseEntity<HFCurationListResponse> hfcGet() {
        // do some magic!
        return new ResponseEntity<HFCurationListResponse>(HttpStatus.OK);
    }


    @ApiOperation(value = "", notes = "Get a list of all populations ", response = PopulationResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = PopulationResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error ocurred", response = PopulationResponse.class) })
    @RequestMapping(value = "/hfc/population",
        method = RequestMethod.GET)
    default ResponseEntity<PopulationResponse> hfcPopulationGet() {
        // do some magic!
        return new ResponseEntity<PopulationResponse>(HttpStatus.OK);
    }


    @ApiOperation(value = "", notes = "Returns a population with its attached submissions", response = PopulationSubmissionResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the population including all attached submissions", response = PopulationSubmissionResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error ocurred", response = PopulationSubmissionResponse.class) })
    @RequestMapping(value = "/hfc/population/{populationId}",
        method = RequestMethod.GET)
    default ResponseEntity<PopulationSubmissionResponse> hfcPopulationPopulationIdGet(@ApiParam(value = "The population id",required=true ) @PathVariable("populationId") String populationId) {
        // do some magic!
        return new ResponseEntity<PopulationSubmissionResponse>(HttpStatus.OK);
    }


    @ApiOperation(value = "", notes = "Storing of a new Haplotype Frequency set. ", response = HFCurationResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = HFCurationResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error ocurred", response = HFCurationResponse.class) })
    @RequestMapping(value = "/hfc",
        method = RequestMethod.POST)
    default ResponseEntity<HFCurationResponse> hfcPost(@ApiParam(value = "Haplotype Frequency Curation Data" ,required=true ) @RequestBody HFCurationRequest hfCurationRequest) {
        // do some magic!
        return new ResponseEntity<HFCurationResponse>(HttpStatus.OK);
    }


    @ApiOperation(value = "", notes = "Returns the list of haplotypes attached to the given submission", response = CohortData.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the cohort data and genotypes if available", response = CohortData.class),
        @ApiResponse(code = 500, message = "An unexpected error ocurred", response = CohortData.class) })
    @RequestMapping(value = "/hfc/{submissionId}/cohort",
        method = RequestMethod.GET)
    default ResponseEntity<CohortData> hfcSubmissionIdCohortGet(@ApiParam(value = "The submission id",required=true ) @PathVariable("submissionId") String submissionId) {
        // do some magic!
        return new ResponseEntity<CohortData>(HttpStatus.OK);
    }


    @ApiOperation(value = "", notes = "Returns a submission of haplotypes", response = HFCurationResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the data set containing all references", response = HFCurationResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error ocurred", response = HFCurationResponse.class) })
    @RequestMapping(value = "/hfc/{submissionId}",
        method = RequestMethod.GET)
    default ResponseEntity<HFCurationResponse> hfcSubmissionIdGet(@ApiParam(value = "The submission id that the haplotype frequencies were submitted under",required=true ) @PathVariable("submissionId") String submissionId) {
        // do some magic!
        return new ResponseEntity<HFCurationResponse>(HttpStatus.OK);
    }


    @ApiOperation(value = "", notes = "Returns the list of haplotypes attached to the given submission", response = HaplotypeFrequencyData.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the haplotype frequency data", response = HaplotypeFrequencyData.class),
        @ApiResponse(code = 500, message = "An unexpected error ocurred", response = HaplotypeFrequencyData.class) })
    @RequestMapping(value = "/hfc/{submissionId}/haplotypes",
        method = RequestMethod.GET)
    default ResponseEntity<HaplotypeFrequencyData> hfcSubmissionIdHaplotypesGet(@ApiParam(value = "The submission id",required=true ) @PathVariable("submissionId") String submissionId) {
        // do some magic!
        return new ResponseEntity<HaplotypeFrequencyData>(HttpStatus.OK);
    }


    @ApiOperation(value = "", notes = "Returns the labels associated to the submission", response = LabelData.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns label set", response = LabelData.class),
        @ApiResponse(code = 500, message = "An unexpected error ocurred", response = LabelData.class) })
    @RequestMapping(value = "/hfc/{submissionId}/labels",
        method = RequestMethod.GET)
    default ResponseEntity<LabelData> hfcSubmissionIdLabelsGet(@ApiParam(value = "The submission id",required=true ) @PathVariable("submissionId") String submissionId) {
        // do some magic!
        return new ResponseEntity<LabelData>(HttpStatus.OK);
    }


    @ApiOperation(value = "", notes = "Returns the population of the given submission", response = PopulationData.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the population", response = PopulationData.class),
        @ApiResponse(code = 500, message = "An unexpected error ocurred", response = PopulationData.class) })
    @RequestMapping(value = "/hfc/{submissionId}/population",
        method = RequestMethod.GET)
    default ResponseEntity<PopulationData> hfcSubmissionIdPopulationGet(@ApiParam(value = "The submission id",required=true ) @PathVariable("submissionId") String submissionId) {
        // do some magic!
        return new ResponseEntity<PopulationData>(HttpStatus.OK);
    }


    @ApiOperation(value = "", notes = "Returns the scope of the genotypes used for creating the submitted haplotypes", response = ScopeData.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns scope set", response = ScopeData.class),
        @ApiResponse(code = 500, message = "An unexpected error ocurred", response = ScopeData.class) })
    @RequestMapping(value = "/hfc/{submissionId}/scope",
        method = RequestMethod.GET)
    default ResponseEntity<ScopeData> hfcSubmissionIdScopeGet(@ApiParam(value = "The submission id",required=true ) @PathVariable("submissionId") String submissionId) {
        // do some magic!
        return new ResponseEntity<ScopeData>(HttpStatus.OK);
    }

}
