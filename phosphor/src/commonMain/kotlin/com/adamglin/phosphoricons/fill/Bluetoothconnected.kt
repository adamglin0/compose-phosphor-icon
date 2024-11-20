package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) {
            return _bluetoothConnected!!
        }
        _bluetoothConnected = Builder(name = "BluetoothConnected", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.2f, 6.4f)
                lineToRelative(-64.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(120.0f, 144.0f)
                lineTo(68.8f, 182.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.6f, -12.8f)
                lineTo(114.67f, 128.0f)
                lineTo(59.2f, 86.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, -12.8f)
                lineTo(120.0f, 112.0f)
                lineTo(120.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 12.8f)
                lineTo(141.33f, 128.0f)
                lineToRelative(55.47f, 41.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 176.0f)
                close()
                moveTo(72.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.0f, 128.0f)
                close()
                moveTo(204.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 204.0f, 116.0f)
                close()
            }
        }
        .build()
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
