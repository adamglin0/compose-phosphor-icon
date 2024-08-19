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

public val ThinGroup.Paypallogo: ImageVector
    get() {
        if (_paypallogo != null) {
            return _paypallogo!!
        }
        _paypallogo = Builder(name = "Paypallogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.0f, 96.0f)
                arcToRelative(51.69f, 51.69f, 0.0f, false, false, -21.0f, -16.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -52.0f, -52.0f)
                lineTo(84.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.65f, 9.09f)
                lineToRelative(-36.0f, 144.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 196.0f)
                horizontalLineToRelative(31.5f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, false, 1.14f, -0.06f)
                lineToRelative(-4.29f, 17.15f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 228.0f)
                horizontalLineToRelative(31.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.64f, -9.09f)
                lineToRelative(9.0f, -35.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.88f, -3.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 41.0f, -84.0f)
                close()
                moveTo(48.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.89f, -5.0f)
                lineToRelative(36.0f, -144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 84.0f, 36.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 43.93f, 41.37f)
                arcTo(52.53f, 52.53f, 0.0f, false, false, 176.0f, 76.0f)
                lineTo(120.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.65f, 9.09f)
                lineTo(83.39f, 185.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.88f, 3.0f)
                close()
                moveTo(187.63f, 85.56f)
                arcToRelative(43.0f, 43.0f, 0.0f, false, true, -1.0f, 5.11f)
                arcTo(43.94f, 43.94f, 0.0f, false, true, 144.0f, 124.0f)
                lineTo(108.0f, 124.0f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, false, -1.14f, 0.06f)
                lineToRelative(9.25f, -37.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 120.0f, 84.0f)
                horizontalLineToRelative(56.0f)
                arcTo(44.3f, 44.3f, 0.0f, false, true, 187.63f, 85.56f)
                close()
                moveTo(218.63f, 138.67f)
                arcTo(43.94f, 43.94f, 0.0f, false, true, 176.0f, 172.0f)
                lineTo(144.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.64f, 9.09f)
                lineToRelative(-9.0f, 35.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.88f, 3.0f)
                lineTo(88.0f, 219.97f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.89f, -5.0f)
                lineToRelative(20.0f, -80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.89f, -3.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(51.92f, 51.92f, 0.0f, false, false, 50.44f, -39.39f)
                curveToRelative(0.35f, -1.39f, 0.62f, -2.79f, 0.85f, -4.19f)
                arcToRelative(44.08f, 44.08f, 0.0f, false, true, 23.39f, 50.25f)
                close()
            }
        }
        .build()
        return _paypallogo!!
    }

private var _paypallogo: ImageVector? = null
