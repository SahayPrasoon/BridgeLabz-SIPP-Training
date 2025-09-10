
interface BackupSerializable {}
interface SensitiveData {}

class UserData implements BackupSerializable, SensitiveData {
    String name;
    String password;
}
