/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author Cyrus
 */

public class StatusUser {
    public enum UserStatus {
        REJECTED, PENDING, PROCESSING, APPROVED
    }

    private UserStatus status;

    public StatusUser(int code) {
        setStatus(code);
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(int code) {
        switch (code) {
            case 0:
                status = UserStatus.REJECTED;
                break;
            case 1:
                status = UserStatus.PENDING;
                break;
            case 2:
                status = UserStatus.PROCESSING;
                break;
            case 3:
                status = UserStatus.APPROVED;
                break;
            default:
                throw new IllegalArgumentException("Invalid status code: " + code);
        }
    }

    public void printStatus() {
        System.out.println("User status: " + status);
    }
}
