package com.aipo.orm.model.portlet;

import java.util.List;

import org.apache.cayenne.ObjectId;

import com.aipo.orm.model.portlet.auto._EipTMessage;

public class EipTMessage extends _EipTMessage {

  private int unreadCount = 0;

  private String loginName = null;

  private String firstName = null;

  private String lastName = null;

  private String hasPhoto = null;

  private Long photoModified = null;

  private Integer roomId = 0;

  private List<String> readMembers = null;

  private List<EipTMessageFile> messageFiles = null;

  public Integer getMessageId() {
    if (getObjectId() != null && !getObjectId().isTemporary()) {
      Object obj = getObjectId().getIdSnapshot().get(MESSAGE_ID_PK_COLUMN);
      if (obj instanceof Long) {
        Long value = (Long) obj;
        return Integer.valueOf(value.intValue());
      } else {
        return (Integer) obj;
      }
    } else {
      return null;
    }
  }

  public void setMessageId(String id) {
    setObjectId(new ObjectId("EipTMessage", MESSAGE_ID_PK_COLUMN, Integer
      .valueOf(id)));
  }

  /**
   * @param intValue
   */
  public void setUnreadCount(int unreadCount) {
    this.unreadCount = unreadCount;
  }

  /**
   * @return unreadCount
   */
  public Integer getUnreadCount() {
    return unreadCount;
  }

  /**
   * @param loginName
   *          セットする loginName
   */
  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  /**
   * @return loginName
   */
  public String getLoginName() {
    return loginName;
  }

  /**
   * @param firstName
   *          セットする firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param lastName
   *          セットする lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param hasPhoto
   *          セットする hasPhoto
   */
  public void setHasPhoto(String hasPhoto) {
    this.hasPhoto = hasPhoto;
  }

  /**
   * @return hasPhoto
   */
  public String getHasPhoto() {
    return hasPhoto;
  }

  /**
   * @param photoModified
   *          セットする photoModified
   */
  public void setPhotoModified(Long photoModified) {
    this.photoModified = photoModified;
  }

  /**
   * @return photoModified
   */
  public Long getPhotoModified() {
    return photoModified;
  }

  /**
   * @param roomId
   *          セットする roomId
   */
  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  /**
   * @return roomId
   */
  public Integer getRoomId() {
    return roomId;
  }

  /**
   *
   * @param readMembers
   */
  public void setReadMembers(List<String> readMembers) {
    this.readMembers = readMembers;
  }

  /**
   *
   * @return
   */
  public List<String> getReadMembers() {
    return readMembers;
  }

  /**
   * @return messageFiles
   */
  public List<EipTMessageFile> getMessageFiles() {
    return messageFiles;
  }

  /**
   *
   * @param messageFiles
   */
  public void setMessageFiles(List<EipTMessageFile> messageFiles) {
    this.messageFiles = messageFiles;
  }

}