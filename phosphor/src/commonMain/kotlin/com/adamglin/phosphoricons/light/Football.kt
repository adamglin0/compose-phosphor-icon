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

public val LightGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.09f, 54.22f)
                arcToRelative(30.92f, 30.92f, 0.0f, false, false, -25.31f, -25.31f)
                curveToRelative(-32.0f, -5.42f, -92.28f, -7.91f, -136.53f, 36.34f)
                reflectiveCurveTo(23.49f, 169.78f, 28.91f, 201.78f)
                arcToRelative(30.92f, 30.92f, 0.0f, false, false, 25.31f, 25.31f)
                arcToRelative(205.0f, 205.0f, 0.0f, false, false, 34.0f, 2.91f)
                curveToRelative(31.69f, 0.0f, 71.12f, -7.88f, 102.49f, -39.25f)
                curveTo(235.0f, 146.5f, 232.51f, 86.22f, 227.09f, 54.22f)
                close()
                moveTo(167.44f, 37.9f)
                arcToRelative(194.0f, 194.0f, 0.0f, false, true, 32.33f, 2.83f)
                arcToRelative(18.93f, 18.93f, 0.0f, false, true, 15.5f, 15.5f)
                arcToRelative(187.0f, 187.0f, 0.0f, false, true, 2.6f, 41.21f)
                lineToRelative(-59.31f, -59.3f)
                curveTo(161.45f, 38.0f, 164.4f, 37.9f, 167.44f, 37.9f)
                close()
                moveTo(56.23f, 215.27f)
                arcToRelative(18.93f, 18.93f, 0.0f, false, true, -15.5f, -15.5f)
                arcToRelative(187.0f, 187.0f, 0.0f, false, true, -2.6f, -41.21f)
                lineToRelative(59.31f, 59.31f)
                arcTo(187.0f, 187.0f, 0.0f, false, true, 56.23f, 215.27f)
                close()
                moveTo(182.23f, 182.27f)
                curveToRelative(-11.92f, 11.91f, -34.24f, 28.54f, -69.46f, 34.0f)
                lineTo(39.72f, 143.19f)
                curveToRelative(5.47f, -35.22f, 22.1f, -57.54f, 34.0f, -69.46f)
                reflectiveCurveTo(108.0f, 45.2f, 143.2f, 39.73f)
                lineToRelative(73.08f, 73.08f)
                curveTo(210.81f, 148.0f, 194.18f, 170.35f, 182.27f, 182.27f)
                close()
                moveTo(164.22f, 91.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineTo(148.48f, 116.0f)
                lineToRelative(7.75f, 7.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(140.0f, 124.49f)
                lineTo(124.49f, 140.0f)
                lineToRelative(7.75f, 7.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(116.0f, 148.48f)
                lineToRelative(-15.75f, 15.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, -8.48f)
                lineTo(107.52f, 140.0f)
                lineToRelative(-7.75f, -7.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, -8.48f)
                lineToRelative(7.76f, 7.75f)
                lineToRelative(15.5f, -15.5f)
                lineToRelative(-7.75f, -7.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, -8.48f)
                lineToRelative(7.75f, 7.75f)
                lineToRelative(15.75f, -15.74f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 164.22f, 91.78f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
