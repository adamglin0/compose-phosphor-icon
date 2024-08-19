package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Eye-thin`: ImageVector
    get() {
        if (`_eye-thin` != null) {
            return `_eye-thin`!!
        }
        `_eye-thin` = Builder(name = "Eye-thin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.66f, 126.38f)
                curveToRelative(-0.34f, -0.76f, -8.52f, -18.89f, -26.83f, -37.2f)
                curveTo(199.87f, 72.22f, 170.7f, 52.0f, 128.0f, 52.0f)
                reflectiveCurveTo(56.13f, 72.22f, 39.17f, 89.18f)
                curveToRelative(-18.31f, 18.31f, -26.49f, 36.44f, -26.83f, 37.2f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, 0.0f, 3.25f)
                curveToRelative(0.34f, 0.77f, 8.52f, 18.89f, 26.83f, 37.2f)
                curveToRelative(17.0f, 17.0f, 46.14f, 37.17f, 88.83f, 37.17f)
                reflectiveCurveToRelative(71.87f, -20.21f, 88.83f, -37.17f)
                curveToRelative(18.31f, -18.31f, 26.49f, -36.43f, 26.83f, -37.2f)
                arcTo(4.08f, 4.08f, 0.0f, false, false, 243.66f, 126.38f)
                close()
                moveTo(210.96f, 161.38f)
                curveToRelative(-23.07f, 23.0f, -51.0f, 34.62f, -83.0f, 34.62f)
                reflectiveCurveToRelative(-59.89f, -11.65f, -83.0f, -34.62f)
                arcTo(135.71f, 135.71f, 0.0f, false, true, 20.44f, 128.0f)
                arcTo(135.69f, 135.69f, 0.0f, false, true, 45.0f, 94.62f)
                curveTo(68.11f, 71.65f, 96.0f, 60.0f, 128.0f, 60.0f)
                reflectiveCurveToRelative(59.89f, 11.65f, 83.0f, 34.62f)
                arcTo(135.79f, 135.79f, 0.0f, false, true, 235.56f, 128.0f)
                arcTo(135.71f, 135.71f, 0.0f, false, true, 211.0f, 161.38f)
                close()
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_eye-thin`!!
    }

private var `_eye-thin`: ImageVector? = null
