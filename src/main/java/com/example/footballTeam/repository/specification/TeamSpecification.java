package com.example.footballTeam.repository.specification;

import com.example.footballTeam.model.Team;
import lombok.experimental.UtilityClass;
import org.springframework.data.jpa.domain.Specification;

public final class TeamSpecification {
    public static Specification<Team> all() {
        return (root, q, cb) -> cb.isTrue(cb.literal(Boolean.TRUE));
    }

    public static Specification<Team> withName(String name) {
        return (root, q, cb) -> cb.equal(root.get("name"), name);
    }
    public static Specification<Team> withBudget(int budget) {
        return (root, q, cb) -> cb.equal(root.get("budget"), budget);
    }
    public static Specification<Team> withBudgetGreaterThen(int b){
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("budget"),b);
    }
}
