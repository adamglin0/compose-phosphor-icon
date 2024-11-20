package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) {
            return _bluetoothX!!
        }
        _bluetoothX = Builder(name = "BluetoothX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.8f, 169.6f)
                lineTo(125.33f, 128.0f)
                lineToRelative(23.47f, -17.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.6f, -12.8f)
                lineTo(120.0f, 112.0f)
                verticalLineTo(48.0f)
                lineToRelative(19.2f, 14.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.6f, -12.8f)
                lineToRelative(-32.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 32.0f)
                verticalLineToRelative(80.0f)
                lineTo(52.8f, 73.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.6f, 12.8f)
                lineTo(98.67f, 128.0f)
                lineTo(43.2f, 169.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.6f, 12.8f)
                lineTo(104.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, 6.4f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.8f)
                close()
                moveTo(120.0f, 208.0f)
                verticalLineTo(144.0f)
                lineToRelative(42.67f, 32.0f)
                close()
                moveTo(237.66f, 98.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(208.0f, 91.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(196.69f, 80.0f)
                lineTo(178.34f, 61.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(208.0f, 68.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(219.31f, 80.0f)
                close()
            }
        }
        .build()
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
