package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) {
            return _bluetoothConnected!!
        }
        _bluetoothConnected = Builder(name = "BluetoothConnected", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(194.4f, 172.8f)
                lineTo(134.67f, 128.0f)
                lineTo(194.4f, 83.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.4f)
                lineToRelative(-64.0f, -48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 124.0f, 32.0f)
                verticalLineToRelative(88.0f)
                lineTo(66.4f, 76.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.8f, 6.4f)
                lineTo(121.33f, 128.0f)
                lineTo(61.6f, 172.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.8f, 6.4f)
                lineTo(124.0f, 136.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.4f, 3.2f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.4f)
                close()
                moveTo(132.0f, 40.0f)
                lineToRelative(53.33f, 40.0f)
                lineTo(132.0f, 120.0f)
                close()
                moveTo(132.0f, 216.0f)
                lineTo(132.0f, 136.0f)
                lineToRelative(53.33f, 40.0f)
                close()
                moveTo(60.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 60.0f, 136.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 212.0f, 128.0f)
                close()
            }
        }
        .build()
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
