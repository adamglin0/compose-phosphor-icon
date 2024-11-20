package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) {
            return _bluetoothX!!
        }
        _bluetoothX = Builder(name = "BluetoothX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.6f, 171.2f)
                lineTo(122.0f, 128.0f)
                lineToRelative(25.6f, -19.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.2f, -9.6f)
                lineTo(118.0f, 116.0f)
                verticalLineTo(44.0f)
                lineToRelative(22.4f, 16.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.2f, -9.6f)
                lineToRelative(-32.0f, -24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 106.0f, 32.0f)
                verticalLineToRelative(84.0f)
                lineTo(51.6f, 75.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.2f, 9.6f)
                lineTo(102.0f, 128.0f)
                lineTo(44.4f, 171.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.2f, 9.6f)
                lineTo(106.0f, 140.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 4.8f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.6f)
                close()
                moveTo(118.0f, 212.0f)
                verticalLineTo(140.0f)
                lineToRelative(48.0f, 36.0f)
                close()
                moveTo(236.24f, 99.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(208.0f, 88.49f)
                lineToRelative(-19.76f, 19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(199.51f, 80.0f)
                lineTo(179.76f, 60.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(208.0f, 71.51f)
                lineToRelative(19.76f, -19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(216.49f, 80.0f)
                close()
            }
        }
        .build()
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
