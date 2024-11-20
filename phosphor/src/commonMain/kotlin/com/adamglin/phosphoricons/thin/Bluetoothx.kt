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

public val ThinGroup.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) {
            return _bluetoothX!!
        }
        _bluetoothX = Builder(name = "BluetoothX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.4f, 172.8f)
                lineTo(118.67f, 128.0f)
                lineToRelative(27.73f, -20.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.8f, -6.4f)
                lineTo(116.0f, 120.0f)
                verticalLineTo(40.0f)
                lineToRelative(25.6f, 19.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.8f, -6.4f)
                lineToRelative(-32.0f, -24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 32.0f)
                verticalLineToRelative(88.0f)
                lineTo(50.4f, 76.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.8f, 6.4f)
                lineTo(105.33f, 128.0f)
                lineTo(45.6f, 172.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.8f, 6.4f)
                lineTo(108.0f, 136.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.21f, 3.58f)
                arcTo(4.05f, 4.05f, 0.0f, false, false, 112.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, -0.8f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.4f)
                close()
                moveTo(116.0f, 216.0f)
                verticalLineTo(136.0f)
                lineToRelative(53.33f, 40.0f)
                close()
                moveTo(234.83f, 101.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(208.0f, 85.66f)
                lineToRelative(-21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(202.34f, 80.0f)
                lineTo(181.17f, 58.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(208.0f, 74.34f)
                lineToRelative(21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineTo(213.66f, 80.0f)
                close()
            }
        }
        .build()
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
