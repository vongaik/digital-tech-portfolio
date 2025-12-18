# CSE 3153 Lab 1 - Business Functions and ER Diagram

## Overview

This repository contains my work for CSE 3153 Lab 1, covering both Part 1 and Part 2 of the assignment. The lab focuses on analyzing the Elijay Community Hospital's business functions, identifying related entities, and creating a high-level Entity-Relationship (E/R) diagram.

---

## Part 1: Business Functions and Entities

This section maps the hospital's business functions to their supporting entities. The goal is to establish a clear understanding of operations and data requirements for database design.

### Business Functions

**Patient Care Administration**

* Entities: Patient, Doctor, Staff, Medical Record, Receipt, Admission

**Clinic and Lab Services**

* Entities: Patient, Lab Test, Doctor, Technician, Nurse, Counselor, Rehab Therapist, Equipment, Radiology Procedure, Patient Surgery, Labor/Delivery Service, Intensive Care, Cardiology, Neurology Department, Orthopedics, Oncology

**Patient Care Services**

* Entities: Patient, Doctor, Nurse, Volunteer, Bed, Equipment, Medicine, Pediatric Care, Emergency Department, Neurology Department

**Financial Management**

* Entities: Staff, Payroll, Purchase Order, Invoice, Receipt

**Administrative Services**

* Entities: Social Service Staff, Medical Record, Housekeeping, Laundry, Laboratory, Staff Training, Security, Employee Management

### Purpose

This mapping provides a foundational overview for database schema creation and ensures all critical hospital operations are represented in the entity model.

---

## Part 2: High-Level E/R Diagram

Based on the hospital's business functions and supporting entities, I developed a high-level E/R diagram to capture relationships and attributes for each entity.

### Notes on the Diagram

* **Entities:** All entities listed in Part 1 are included.
* **Relationships:** Key associations among entities are represented.
* **Attributes:** Each entity includes relevant attributes.
* **Diagram Style:** The E/R diagram is designed with the use of the diagramming tool draw.io.
* **Cardinalities:** Cardinalities are intentionally omitted as per the lab guidelines.

### Purpose

The E/R diagram serves as the blueprint for database design, showing how hospital data entities interrelate and supporting future implementation of a relational database schema.

---

## Deliverables

* `Lab1_BusinessFunctions_Entities.docx` – Lists business functions and corresponding entities.
* `ElijayHospital_ER_Diagram.svg` – High-level E/R diagram with entities, relationships, and attributes.

