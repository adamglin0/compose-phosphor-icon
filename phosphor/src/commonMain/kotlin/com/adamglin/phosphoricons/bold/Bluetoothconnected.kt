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

public val BoldGroup.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) {
            return _bluetoothConnected!!
        }
        _bluetoothConnected = Builder(name = "BluetoothConnected", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.2f, 166.4f)
                lineTo(148.0f, 128.0f)
                lineToRelative(51.2f, -38.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -19.2f)
                lineToRelative(-64.0f, -48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 32.0f)
                verticalLineToRelative(72.0f)
                lineTo(71.2f, 70.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.8f, 89.6f)
                lineTo(108.0f, 128.0f)
                lineTo(56.8f, 166.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.4f, 19.2f)
                lineTo(116.0f, 152.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.2f, 9.6f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -19.2f)
                close()
                moveTo(140.0f, 56.0f)
                lineToRelative(32.0f, 24.0f)
                lineToRelative(-32.0f, 24.0f)
                close()
                moveTo(140.0f, 200.0f)
                lineTo(140.0f, 152.0f)
                lineToRelative(32.0f, 24.0f)
                close()
                moveTo(56.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 144.0f)
                close()
                moveTo(224.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
        }
        .build()
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
