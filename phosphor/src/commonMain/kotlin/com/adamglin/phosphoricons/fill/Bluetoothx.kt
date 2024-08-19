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

public val FillGroup.Bluetoothx: ImageVector
    get() {
        if (_bluetoothx != null) {
            return _bluetoothx!!
        }
        _bluetoothx = Builder(name = "Bluetoothx", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.2f, 6.4f)
                lineToRelative(-64.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 232.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.11f, -1.14f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -3.9f, -7.18f)
                lineTo(103.99f, 144.0f)
                lineTo(52.76f, 182.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.16f, -1.55f)
                arcToRelative(8.26f, 8.26f, 0.0f, false, true, 1.8f, -11.43f)
                lineTo(98.66f, 128.0f)
                lineTo(43.38f, 86.57f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, -2.13f, -10.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.51f, -2.0f)
                lineTo(104.0f, 112.0f)
                lineTo(104.0f, 32.24f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, true, 2.83f, -6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, -0.3f)
                lineToRelative(33.62f, 25.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 152.0f, 54.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.6f, 3.2f)
                lineTo(125.34f, 128.0f)
                lineToRelative(55.5f, 41.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 176.0f)
                close()
                moveTo(237.47f, 98.13f)
                lineTo(219.37f, 80.0f)
                lineToRelative(18.11f, -18.11f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, false, 0.41f, -11.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.49f, -0.18f)
                lineTo(208.05f, 68.69f)
                lineTo(189.93f, 50.58f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, -10.83f, -0.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.73f, 12.0f)
                lineTo(196.73f, 80.0f)
                lineTo(178.58f, 98.13f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -0.6f, 11.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, 0.43f)
                lineToRelative(18.36f, -18.35f)
                lineToRelative(18.35f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.72f, -0.43f)
                arcTo(8.21f, 8.21f, 0.0f, false, false, 237.51f, 98.13f)
                close()
            }
        }
        .build()
        return _bluetoothx!!
    }

private var _bluetoothx: ImageVector? = null
