package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) {
            return _bluetoothSlash!!
        }
        _bluetoothSlash = Builder(name = "BluetoothSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                lineToRelative(64.0f, 48.0f)
                lineToRelative(-64.0f, 48.0f)
                close()
                moveTo(128.0f, 32.0f)
                verticalLineToRelative(96.0f)
                lineToRelative(64.0f, -48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.92f, 210.62f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 50.08f, 45.38f)
                lineToRelative(70.84f, 77.93f)
                lineTo(59.2f, 169.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.6f, 12.8f)
                lineTo(120.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, 6.4f)
                lineToRelative(50.83f, -38.12f)
                lineToRelative(26.45f, 29.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(136.0f, 208.0f)
                verticalLineTo(144.0f)
                lineToRelative(11.73f, 8.8f)
                lineToRelative(25.08f, 27.59f)
                close()
                moveTo(120.0f, 71.63f)
                verticalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 12.8f)
                lineToRelative(-33.53f, 25.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.6f, -12.8f)
                lineToRelative(25.0f, -18.75f)
                lineTo(136.0f, 48.0f)
                verticalLineTo(71.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
