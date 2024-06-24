package com.egon.inventoryfailover.controllers;

import com.egon.inventoryfailover.dtos.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class InventoryFailOverController {

  @GetMapping("/inventory-fail-over")
  public ResponseEntity<List<BeerInventoryDto>> inventoryFailOver() {
    return ResponseEntity.ok(
      List.of(
        BeerInventoryDto.builder()
          .id(UUID.fromString("00000000-0000-0000-0000-000000000000"))
          .quantityOnHand(999)
          .createdAt(OffsetDateTime.now())
          .updatedAt(OffsetDateTime.now())
          .build()));
  }
}
