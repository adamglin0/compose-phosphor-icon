package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) {
            return _bluetoothSlash!!
        }
        _bluetoothSlash = Builder(name = "BluetoothSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.88f, 207.93f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 47.12f, 48.07f)
                lineTo(115.0f, 122.75f)
                lineTo(56.8f, 166.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.4f, 19.2f)
                lineTo(116.0f, 152.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.2f, 9.6f)
                lineToRelative(47.91f, -35.94f)
                lineToRelative(24.0f, 26.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(140.0f, 200.0f)
                verticalLineTo(152.0f)
                lineToRelative(5.0f, 3.77f)
                lineToRelative(21.87f, 24.06f)
                close()
                moveTo(116.0f, 59.74f)
                verticalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.2f, -9.6f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 19.2f)
                lineToRelative(-27.1f, 20.33f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.4f, -19.2f)
                lineTo(172.0f, 80.0f)
                lineTo(140.0f, 56.0f)
                verticalLineToRelative(3.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
