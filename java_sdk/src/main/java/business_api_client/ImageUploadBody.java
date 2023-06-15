/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
/**
 * ImageUploadBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-06-28T14:49:22.099759+05:30[Asia/Kolkata]")
public class ImageUploadBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("image_file")
  private File imageFile = null;

  public ImageUploadBody bcId(String bcId) {
    this.bcId = bcId;
    return this;
  }

   /**
   * Business Center ID
   * @return bcId
  **/
  @Schema(required = true, description = "Business Center ID")
  public String getBcId() {
    return bcId;
  }

  public void setBcId(String bcId) {
    this.bcId = bcId;
  }

  public ImageUploadBody imageFile(File imageFile) {
    this.imageFile = imageFile;
    return this;
  }

   /**
   * The certificate image file to be uploaded. Supported picture format: JPG/JPEG/PNG. The maximum file size is 10 MB
   * @return imageFile
  **/
  @Schema(required = true, description = "The certificate image file to be uploaded. Supported picture format: JPG/JPEG/PNG. The maximum file size is 10 MB")
  public File getImageFile() {
    return imageFile;
  }

  public void setImageFile(File imageFile) {
    this.imageFile = imageFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageUploadBody imageUploadBody = (ImageUploadBody) o;
    return Objects.equals(this.bcId, imageUploadBody.bcId) &&
        Objects.equals(this.imageFile, imageUploadBody.imageFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, Objects.hashCode(imageFile));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageUploadBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
