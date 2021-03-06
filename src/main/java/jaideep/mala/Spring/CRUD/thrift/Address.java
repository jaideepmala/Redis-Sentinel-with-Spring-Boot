/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-23")
public class Address implements org.apache.thrift.TBase<Address, Address._Fields>, java.io.Serializable, Cloneable, Comparable<Address> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Address");

  private static final org.apache.thrift.protocol.TField ADDRESS_LINE_FIELD_DESC = new org.apache.thrift.protocol.TField("addressLine", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField CITY_FIELD_DESC = new org.apache.thrift.protocol.TField("city", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DIST_FIELD_DESC = new org.apache.thrift.protocol.TField("dist", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PINCODE_FIELD_DESC = new org.apache.thrift.protocol.TField("pincode", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AddressStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AddressTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> addressLine; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String city; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String dist; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String state; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String pincode; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ADDRESS_LINE((short)1, "addressLine"),
    CITY((short)2, "city"),
    DIST((short)3, "dist"),
    STATE((short)4, "state"),
    PINCODE((short)5, "pincode");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ADDRESS_LINE
          return ADDRESS_LINE;
        case 2: // CITY
          return CITY;
        case 3: // DIST
          return DIST;
        case 4: // STATE
          return STATE;
        case 5: // PINCODE
          return PINCODE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADDRESS_LINE, new org.apache.thrift.meta_data.FieldMetaData("addressLine", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "String"))));
    tmpMap.put(_Fields.CITY, new org.apache.thrift.meta_data.FieldMetaData("city", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.DIST, new org.apache.thrift.meta_data.FieldMetaData("dist", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.PINCODE, new org.apache.thrift.meta_data.FieldMetaData("pincode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Address.class, metaDataMap);
  }

  public Address() {
  }

  public Address(
    java.util.List<java.lang.String> addressLine,
    java.lang.String city,
    java.lang.String dist,
    java.lang.String state,
    java.lang.String pincode)
  {
    this();
    this.addressLine = addressLine;
    this.city = city;
    this.dist = dist;
    this.state = state;
    this.pincode = pincode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Address(Address other) {
    if (other.isSetAddressLine()) {
      java.util.List<java.lang.String> __this__addressLine = new java.util.ArrayList<java.lang.String>(other.addressLine.size());
      for (java.lang.String other_element : other.addressLine) {
        __this__addressLine.add(other_element);
      }
      this.addressLine = __this__addressLine;
    }
    if (other.isSetCity()) {
      this.city = other.city;
    }
    if (other.isSetDist()) {
      this.dist = other.dist;
    }
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetPincode()) {
      this.pincode = other.pincode;
    }
  }

  public Address deepCopy() {
    return new Address(this);
  }

  @Override
  public void clear() {
    this.addressLine = null;
    this.city = null;
    this.dist = null;
    this.state = null;
    this.pincode = null;
  }

  public int getAddressLineSize() {
    return (this.addressLine == null) ? 0 : this.addressLine.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getAddressLineIterator() {
    return (this.addressLine == null) ? null : this.addressLine.iterator();
  }

  public void addToAddressLine(java.lang.String elem) {
    if (this.addressLine == null) {
      this.addressLine = new java.util.ArrayList<java.lang.String>();
    }
    this.addressLine.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getAddressLine() {
    return this.addressLine;
  }

  public Address setAddressLine(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public void unsetAddressLine() {
    this.addressLine = null;
  }

  /** Returns true if field addressLine is set (has been assigned a value) and false otherwise */
  public boolean isSetAddressLine() {
    return this.addressLine != null;
  }

  public void setAddressLineIsSet(boolean value) {
    if (!value) {
      this.addressLine = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCity() {
    return this.city;
  }

  public Address setCity(@org.apache.thrift.annotation.Nullable java.lang.String city) {
    this.city = city;
    return this;
  }

  public void unsetCity() {
    this.city = null;
  }

  /** Returns true if field city is set (has been assigned a value) and false otherwise */
  public boolean isSetCity() {
    return this.city != null;
  }

  public void setCityIsSet(boolean value) {
    if (!value) {
      this.city = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDist() {
    return this.dist;
  }

  public Address setDist(@org.apache.thrift.annotation.Nullable java.lang.String dist) {
    this.dist = dist;
    return this;
  }

  public void unsetDist() {
    this.dist = null;
  }

  /** Returns true if field dist is set (has been assigned a value) and false otherwise */
  public boolean isSetDist() {
    return this.dist != null;
  }

  public void setDistIsSet(boolean value) {
    if (!value) {
      this.dist = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getState() {
    return this.state;
  }

  public Address setState(@org.apache.thrift.annotation.Nullable java.lang.String state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPincode() {
    return this.pincode;
  }

  public Address setPincode(@org.apache.thrift.annotation.Nullable java.lang.String pincode) {
    this.pincode = pincode;
    return this;
  }

  public void unsetPincode() {
    this.pincode = null;
  }

  /** Returns true if field pincode is set (has been assigned a value) and false otherwise */
  public boolean isSetPincode() {
    return this.pincode != null;
  }

  public void setPincodeIsSet(boolean value) {
    if (!value) {
      this.pincode = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ADDRESS_LINE:
      if (value == null) {
        unsetAddressLine();
      } else {
        setAddressLine((java.util.List<java.lang.String>)value);
      }
      break;

    case CITY:
      if (value == null) {
        unsetCity();
      } else {
        setCity((java.lang.String)value);
      }
      break;

    case DIST:
      if (value == null) {
        unsetDist();
      } else {
        setDist((java.lang.String)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((java.lang.String)value);
      }
      break;

    case PINCODE:
      if (value == null) {
        unsetPincode();
      } else {
        setPincode((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ADDRESS_LINE:
      return getAddressLine();

    case CITY:
      return getCity();

    case DIST:
      return getDist();

    case STATE:
      return getState();

    case PINCODE:
      return getPincode();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ADDRESS_LINE:
      return isSetAddressLine();
    case CITY:
      return isSetCity();
    case DIST:
      return isSetDist();
    case STATE:
      return isSetState();
    case PINCODE:
      return isSetPincode();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Address)
      return this.equals((Address)that);
    return false;
  }

  public boolean equals(Address that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_addressLine = true && this.isSetAddressLine();
    boolean that_present_addressLine = true && that.isSetAddressLine();
    if (this_present_addressLine || that_present_addressLine) {
      if (!(this_present_addressLine && that_present_addressLine))
        return false;
      if (!this.addressLine.equals(that.addressLine))
        return false;
    }

    boolean this_present_city = true && this.isSetCity();
    boolean that_present_city = true && that.isSetCity();
    if (this_present_city || that_present_city) {
      if (!(this_present_city && that_present_city))
        return false;
      if (!this.city.equals(that.city))
        return false;
    }

    boolean this_present_dist = true && this.isSetDist();
    boolean that_present_dist = true && that.isSetDist();
    if (this_present_dist || that_present_dist) {
      if (!(this_present_dist && that_present_dist))
        return false;
      if (!this.dist.equals(that.dist))
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_pincode = true && this.isSetPincode();
    boolean that_present_pincode = true && that.isSetPincode();
    if (this_present_pincode || that_present_pincode) {
      if (!(this_present_pincode && that_present_pincode))
        return false;
      if (!this.pincode.equals(that.pincode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAddressLine()) ? 131071 : 524287);
    if (isSetAddressLine())
      hashCode = hashCode * 8191 + addressLine.hashCode();

    hashCode = hashCode * 8191 + ((isSetCity()) ? 131071 : 524287);
    if (isSetCity())
      hashCode = hashCode * 8191 + city.hashCode();

    hashCode = hashCode * 8191 + ((isSetDist()) ? 131071 : 524287);
    if (isSetDist())
      hashCode = hashCode * 8191 + dist.hashCode();

    hashCode = hashCode * 8191 + ((isSetState()) ? 131071 : 524287);
    if (isSetState())
      hashCode = hashCode * 8191 + state.hashCode();

    hashCode = hashCode * 8191 + ((isSetPincode()) ? 131071 : 524287);
    if (isSetPincode())
      hashCode = hashCode * 8191 + pincode.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Address other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAddressLine()).compareTo(other.isSetAddressLine());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddressLine()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.addressLine, other.addressLine);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCity()).compareTo(other.isSetCity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.city, other.city);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDist()).compareTo(other.isSetDist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDist()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dist, other.dist);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPincode()).compareTo(other.isSetPincode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPincode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pincode, other.pincode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(");
    boolean first = true;

    sb.append("addressLine:");
    if (this.addressLine == null) {
      sb.append("null");
    } else {
      sb.append(this.addressLine);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("city:");
    if (this.city == null) {
      sb.append("null");
    } else {
      sb.append(this.city);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dist:");
    if (this.dist == null) {
      sb.append("null");
    } else {
      sb.append(this.dist);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pincode:");
    if (this.pincode == null) {
      sb.append("null");
    } else {
      sb.append(this.pincode);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AddressStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddressStandardScheme getScheme() {
      return new AddressStandardScheme();
    }
  }

  private static class AddressStandardScheme extends org.apache.thrift.scheme.StandardScheme<Address> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Address struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ADDRESS_LINE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.addressLine = new java.util.ArrayList<java.lang.String>(_list0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.addressLine.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setAddressLineIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.city = iprot.readString();
              struct.setCityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DIST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dist = iprot.readString();
              struct.setDistIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.state = iprot.readString();
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PINCODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pincode = iprot.readString();
              struct.setPincodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Address struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.addressLine != null) {
        oprot.writeFieldBegin(ADDRESS_LINE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.addressLine.size()));
          for (java.lang.String _iter3 : struct.addressLine)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.city != null) {
        oprot.writeFieldBegin(CITY_FIELD_DESC);
        oprot.writeString(struct.city);
        oprot.writeFieldEnd();
      }
      if (struct.dist != null) {
        oprot.writeFieldBegin(DIST_FIELD_DESC);
        oprot.writeString(struct.dist);
        oprot.writeFieldEnd();
      }
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeString(struct.state);
        oprot.writeFieldEnd();
      }
      if (struct.pincode != null) {
        oprot.writeFieldBegin(PINCODE_FIELD_DESC);
        oprot.writeString(struct.pincode);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddressTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddressTupleScheme getScheme() {
      return new AddressTupleScheme();
    }
  }

  private static class AddressTupleScheme extends org.apache.thrift.scheme.TupleScheme<Address> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Address struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAddressLine()) {
        optionals.set(0);
      }
      if (struct.isSetCity()) {
        optionals.set(1);
      }
      if (struct.isSetDist()) {
        optionals.set(2);
      }
      if (struct.isSetState()) {
        optionals.set(3);
      }
      if (struct.isSetPincode()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetAddressLine()) {
        {
          oprot.writeI32(struct.addressLine.size());
          for (java.lang.String _iter4 : struct.addressLine)
          {
            oprot.writeString(_iter4);
          }
        }
      }
      if (struct.isSetCity()) {
        oprot.writeString(struct.city);
      }
      if (struct.isSetDist()) {
        oprot.writeString(struct.dist);
      }
      if (struct.isSetState()) {
        oprot.writeString(struct.state);
      }
      if (struct.isSetPincode()) {
        oprot.writeString(struct.pincode);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Address struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.addressLine = new java.util.ArrayList<java.lang.String>(_list5.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.addressLine.add(_elem6);
          }
        }
        struct.setAddressLineIsSet(true);
      }
      if (incoming.get(1)) {
        struct.city = iprot.readString();
        struct.setCityIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dist = iprot.readString();
        struct.setDistIsSet(true);
      }
      if (incoming.get(3)) {
        struct.state = iprot.readString();
        struct.setStateIsSet(true);
      }
      if (incoming.get(4)) {
        struct.pincode = iprot.readString();
        struct.setPincodeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

