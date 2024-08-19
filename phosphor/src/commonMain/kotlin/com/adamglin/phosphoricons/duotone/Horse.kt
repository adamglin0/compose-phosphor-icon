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

public val DuotoneGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 129.37f)
                curveToRelative(-0.72f, 51.48f, -42.57f, 93.59f, -94.05f, 94.61f)
                arcToRelative(98.08f, 98.08f, 0.0f, false, true, -37.81f, -6.66f)
                lineTo(128.0f, 168.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-26.64f, -16.0f, -57.23f, -11.3f, -74.7f, -8.34f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 29.79f, 150.0f)
                lineTo(16.0f, 128.0f)
                lineTo(120.0f, 64.0f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(8.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 129.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 100.0f)
                close()
                moveTo(232.0f, 129.48f)
                arcTo(104.29f, 104.29f, 0.0f, false, true, 130.1f, 232.0f)
                lineToRelative(-2.17f, 0.0f)
                arcToRelative(103.32f, 103.32f, 0.0f, false, true, -69.26f, -26.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 69.34f, 194.0f)
                arcToRelative(84.71f, 84.71f, 0.0f, false, false, 20.1f, 13.37f)
                lineTo(116.0f, 170.84f)
                curveToRelative(-22.78f, -9.83f, -47.47f, -5.65f, -61.4f, -3.29f)
                arcTo(31.84f, 31.84f, 0.0f, false, true, 23.3f, 154.72f)
                lineToRelative(-0.3f, -0.43f)
                lineToRelative(-13.78f, -22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.59f, -11.05f)
                lineTo(112.0f, 59.53f)
                lineTo(112.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 129.48f)
                close()
                moveTo(216.0f, 129.26f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 128.0f, 40.0f)
                lineTo(128.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.81f, 6.81f)
                lineTo(27.06f, 130.59f)
                lineToRelative(9.36f, 15.0f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 52.0f, 151.77f)
                curveToRelative(16.0f, -2.7f, 48.77f, -8.24f, 78.07f, 8.18f)
                arcTo(40.06f, 40.06f, 0.0f, false, false, 168.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(56.07f, 56.07f, 0.0f, false, true, -51.8f, 55.83f)
                lineToRelative(-27.11f, 37.28f)
                arcTo(90.89f, 90.89f, 0.0f, false, false, 129.78f, 216.0f)
                arcTo(88.29f, 88.29f, 0.0f, false, false, 216.0f, 129.26f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
