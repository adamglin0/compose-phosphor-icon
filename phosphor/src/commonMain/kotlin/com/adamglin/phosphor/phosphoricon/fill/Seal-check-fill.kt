package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Seal-check-fill`: ImageVector
    get() {
        if (`_seal-check-fill` != null) {
            return `_seal-check-fill`!!
        }
        `_seal-check-fill` = Builder(name = "Seal-check-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.86f, 102.82f)
                curveToRelative(-3.77f, -3.94f, -7.67f, -8.0f, -9.14f, -11.57f)
                curveToRelative(-1.36f, -3.27f, -1.44f, -8.69f, -1.52f, -13.94f)
                curveToRelative(-0.15f, -9.76f, -0.31f, -20.82f, -8.0f, -28.51f)
                reflectiveCurveToRelative(-18.75f, -7.85f, -28.51f, -8.0f)
                curveToRelative(-5.25f, -0.08f, -10.67f, -0.16f, -13.94f, -1.52f)
                curveToRelative(-3.56f, -1.47f, -7.63f, -5.37f, -11.57f, -9.14f)
                curveTo(146.28f, 23.51f, 138.44f, 16.0f, 128.0f, 16.0f)
                reflectiveCurveToRelative(-18.27f, 7.51f, -25.18f, 14.14f)
                curveToRelative(-3.94f, 3.77f, -8.0f, 7.67f, -11.57f, 9.14f)
                curveTo(88.0f, 40.64f, 82.56f, 40.72f, 77.31f, 40.8f)
                curveToRelative(-9.76f, 0.15f, -20.82f, 0.31f, -28.51f, 8.0f)
                reflectiveCurveTo(41.0f, 67.55f, 40.8f, 77.31f)
                curveToRelative(-0.08f, 5.25f, -0.16f, 10.67f, -1.52f, 13.94f)
                curveToRelative(-1.47f, 3.56f, -5.37f, 7.63f, -9.14f, 11.57f)
                curveTo(23.51f, 109.72f, 16.0f, 117.56f, 16.0f, 128.0f)
                reflectiveCurveToRelative(7.51f, 18.27f, 14.14f, 25.18f)
                curveToRelative(3.77f, 3.94f, 7.67f, 8.0f, 9.14f, 11.57f)
                curveToRelative(1.36f, 3.27f, 1.44f, 8.69f, 1.52f, 13.94f)
                curveToRelative(0.15f, 9.76f, 0.31f, 20.82f, 8.0f, 28.51f)
                reflectiveCurveToRelative(18.75f, 7.85f, 28.51f, 8.0f)
                curveToRelative(5.25f, 0.08f, 10.67f, 0.16f, 13.94f, 1.52f)
                curveToRelative(3.56f, 1.47f, 7.63f, 5.37f, 11.57f, 9.14f)
                curveTo(109.72f, 232.49f, 117.56f, 240.0f, 128.0f, 240.0f)
                reflectiveCurveToRelative(18.27f, -7.51f, 25.18f, -14.14f)
                curveToRelative(3.94f, -3.77f, 8.0f, -7.67f, 11.57f, -9.14f)
                curveToRelative(3.27f, -1.36f, 8.69f, -1.44f, 13.94f, -1.52f)
                curveToRelative(9.76f, -0.15f, 20.82f, -0.31f, 28.51f, -8.0f)
                reflectiveCurveToRelative(7.85f, -18.75f, 8.0f, -28.51f)
                curveToRelative(0.08f, -5.25f, 0.16f, -10.67f, 1.52f, -13.94f)
                curveToRelative(1.47f, -3.56f, 5.37f, -7.63f, 9.14f, -11.57f)
                curveTo(232.49f, 146.28f, 240.0f, 138.44f, 240.0f, 128.0f)
                reflectiveCurveTo(232.49f, 109.73f, 225.86f, 102.82f)
                close()
                moveTo(173.66f, 109.66f)
                lineTo(117.66f, 165.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(112.0f, 148.69f)
                lineToRelative(50.34f, -50.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
            }
        }
        .build()
        return `_seal-check-fill`!!
    }

private var `_seal-check-fill`: ImageVector? = null
