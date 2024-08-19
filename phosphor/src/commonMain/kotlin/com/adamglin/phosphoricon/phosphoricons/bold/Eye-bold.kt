package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Eye-bold`: ImageVector
    get() {
        if (`_eye-bold` != null) {
            return `_eye-bold`!!
        }
        `_eye-bold` = Builder(name = "Eye-bold", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.0f, 123.13f)
                curveToRelative(-0.37f, -0.81f, -9.13f, -20.26f, -28.48f, -39.61f)
                curveTo(196.63f, 57.67f, 164.0f, 44.0f, 128.0f, 44.0f)
                reflectiveCurveTo(59.37f, 57.67f, 33.51f, 83.52f)
                curveTo(14.16f, 102.87f, 5.4f, 122.32f, 5.0f, 123.13f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, false, 0.0f, 9.75f)
                curveToRelative(0.37f, 0.82f, 9.13f, 20.26f, 28.49f, 39.61f)
                curveTo(59.37f, 198.34f, 92.0f, 212.0f, 128.0f, 212.0f)
                reflectiveCurveToRelative(68.63f, -13.66f, 94.48f, -39.51f)
                curveToRelative(19.36f, -19.35f, 28.12f, -38.79f, 28.49f, -39.61f)
                arcTo(12.08f, 12.08f, 0.0f, false, false, 251.0f, 123.13f)
                close()
                moveTo(204.94f, 156.13f)
                curveTo(183.47f, 177.27f, 157.59f, 188.0f, 128.0f, 188.0f)
                reflectiveCurveToRelative(-55.47f, -10.73f, -76.91f, -31.88f)
                arcTo(130.36f, 130.36f, 0.0f, false, true, 29.52f, 128.0f)
                arcTo(130.45f, 130.45f, 0.0f, false, true, 51.09f, 99.89f)
                curveTo(72.54f, 78.73f, 98.41f, 68.0f, 128.0f, 68.0f)
                reflectiveCurveToRelative(55.46f, 10.73f, 76.91f, 31.89f)
                arcTo(130.36f, 130.36f, 0.0f, false, true, 226.48f, 128.0f)
                arcTo(130.45f, 130.45f, 0.0f, false, true, 204.91f, 156.12f)
                close()
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
            }
        }
        .build()
        return `_eye-bold`!!
    }

private var `_eye-bold`: ImageVector? = null
