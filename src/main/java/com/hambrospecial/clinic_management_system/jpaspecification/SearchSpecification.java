package com.hambrospecial.clinic_management_system.jpaspecification;

import com.hambrospecial.clinic_management_system.models.Patient;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class SearchSpecification {
    private SearchSpecification(){}
//    public static Specification<Patient> searchPatients(Patient request) {
//        return (Root<Patient> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
//            List<Predicate> predicates = new ArrayList<>();
//
//            if (request.() != null) {
//                predicates.add(cb.equal(root.get("approvalRequestRef"), request.getApprovalRequestRef()));
//            }
//
//            if (request.getWorkflowId() != null) {
//                predicates.add(cb.equal(root.get("workflow").get("id"), request.getWorkflowId()));
//            }
//
//            if (request.getNextStepId() != null) {
//                predicates.add(cb.equal(root.get("nextStep").get("id"), request.getNextStepId()));
//            }
//
//            if (request.getNextStepFieldId() != null) {
//                predicates.add(cb.equal(root.get("nextStepField").get("id"), request.getNextStepFieldId()));
//            }
//
//            if (request.getRequesterId() != null && !request.getRequesterId().isEmpty()) {
//                predicates.add(cb.equal(root.get("requesterId"), request.getRequesterId()));
//            }
//
//            if (request.getNextStepLevel() != null && !request.getNextStepLevel().isEmpty()) {
//                predicates.add(cb.equal(root.get("nextStepLevel"), request.getNextStepLevel()));
//            }
//
//            if (request.getNextStepFieldLevel() != null && !request.getNextStepFieldLevel().isEmpty()) {
//                predicates.add(cb.equal(root.get("nextStepFieldLevel"), request.getNextStepFieldLevel()));
//            }
//
//            if (request.getStatus() != null) {
//                predicates.add(cb.equal(root.get("status"), request.getStatus()));
//            }
//
//            if (request.getCreatedAtStart() != null) {
//                predicates.add(cb.greaterThanOrEqualTo(root.get("createdAt"), request.getCreatedAtStart()));
//            }
//
//            if (request.getCreatedAtEnd() != null) {
//                predicates.add(cb.lessThanOrEqualTo(root.get("createdAt"), request.getCreatedAtEnd()));
//            }
//
//            query.orderBy(cb.desc(root.get("createdAt")));
//
//            return cb.and(predicates.toArray(new Predicate[0]));
//        };
//    }
}