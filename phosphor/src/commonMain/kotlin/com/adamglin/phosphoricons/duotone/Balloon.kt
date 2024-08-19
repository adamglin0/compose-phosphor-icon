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

public val DuotoneGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(137.89f, 199.13f)
                horizontalLineToRelative(0.0f)
                lineTo(152.0f, 232.0f)
                horizontalLineTo(104.0f)
                lineToRelative(14.09f, -32.87f)
                horizontalLineToRelative(0.0f)
                curveTo(78.59f, 192.18f, 48.0f, 144.83f, 48.0f, 104.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f)
                curveTo(208.0f, 144.83f, 177.41f, 192.18f, 137.89f, 199.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, 88.0f)
                curveToRelative(0.0f, 23.43f, 9.4f, 49.42f, 25.13f, 69.5f)
                curveToRelative(12.08f, 15.41f, 26.5f, 26.0f, 41.91f, 31.09f)
                lineTo(96.65f, 228.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 240.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.35f, -11.15f)
                lineTo(149.0f, 204.59f)
                curveToRelative(15.4f, -5.07f, 29.83f, -15.68f, 41.91f, -31.09f)
                curveTo(206.6f, 153.42f, 216.0f, 127.43f, 216.0f, 104.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 128.0f, 16.0f)
                close()
                moveTo(139.87f, 224.0f)
                lineTo(116.13f, 224.0f)
                lineToRelative(6.94f, -16.19f)
                curveToRelative(1.64f, 0.12f, 3.28f, 0.19f, 4.93f, 0.19f)
                reflectiveCurveToRelative(3.29f, -0.07f, 4.93f, -0.19f)
                close()
                moveTo(178.27f, 163.63f)
                curveTo(163.94f, 181.93f, 146.09f, 192.0f, 128.0f, 192.0f)
                reflectiveCurveToRelative(-35.94f, -10.07f, -50.27f, -28.37f)
                curveTo(64.12f, 146.27f, 56.0f, 124.0f, 56.0f, 104.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                curveTo(200.0f, 124.0f, 191.88f, 146.27f, 178.27f, 163.63f)
                close()
                moveTo(177.27f, 103.89f)
                arcTo(8.52f, 8.52f, 0.0f, false, true, 176.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.88f, -6.68f)
                arcToRelative(41.29f, 41.29f, 0.0f, false, false, -33.43f, -33.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 2.64f, -15.78f)
                arcToRelative(57.5f, 57.5f, 0.0f, false, true, 46.57f, 46.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 177.32f, 103.89f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
