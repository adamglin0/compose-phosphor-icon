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

public val BoldGroup.Bluetoothx: ImageVector
    get() {
        if (_bluetoothx != null) {
            return _bluetoothx!!
        }
        _bluetoothx = Builder(name = "Bluetoothx", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.2f, 166.4f)
                lineTo(132.0f, 128.0f)
                lineToRelative(11.61f, -8.71f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -14.4f, -19.2f)
                lineTo(124.0f, 104.0f)
                verticalLineTo(56.0f)
                lineToRelative(5.21f, 3.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.4f, -19.2f)
                lineTo(119.2f, 22.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 32.0f)
                verticalLineToRelative(72.0f)
                lineTo(55.2f, 70.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.8f, 89.6f)
                lineTo(92.0f, 128.0f)
                lineTo(40.8f, 166.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.4f, 19.2f)
                lineTo(100.0f, 152.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.2f, 9.6f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -19.2f)
                close()
                moveTo(124.0f, 200.0f)
                verticalLineTo(152.0f)
                lineToRelative(32.0f, 24.0f)
                close()
                moveTo(240.49f, 95.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(208.0f, 97.0f)
                lineToRelative(-15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f)
                lineTo(191.0f, 80.0f)
                lineTo(175.52f, 64.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineTo(208.0f, 63.0f)
                lineToRelative(15.51f, -15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(225.0f, 80.0f)
                close()
            }
        }
        .build()
        return _bluetoothx!!
    }

private var _bluetoothx: ImageVector? = null
