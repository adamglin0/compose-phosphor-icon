package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Champagne-light`: ImageVector
    get() {
        if (`_champagne-light` != null) {
            return `_champagne-light`!!
        }
        `_champagne-light` = Builder(name = "Champagne-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.26f, 10.0f)
                lineTo(97.65f, 10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 92.0f, 14.14f)
                curveToRelative(-1.47f, 4.51f, -35.53f, 110.73f, -5.85f, 151.57f)
                curveToRelative(6.75f, 9.28f, 16.1f, 14.62f, 27.86f, 15.95f)
                lineTo(114.01f, 234.0f)
                lineTo(96.0f, 234.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                lineTo(126.0f, 234.0f)
                lineTo(126.0f, 181.66f)
                curveToRelative(11.76f, -1.33f, 21.11f, -6.67f, 27.85f, -15.95f)
                curveToRelative(29.68f, -40.84f, -4.37f, -147.06f, -5.84f, -151.57f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 142.26f, 10.0f)
                close()
                moveTo(102.08f, 22.0f)
                horizontalLineToRelative(35.75f)
                curveToRelative(2.24f, 7.48f, 7.0f, 24.29f, 10.75f, 44.0f)
                lineTo(91.34f, 66.0f)
                curveTo(95.09f, 46.29f, 99.85f, 29.48f, 102.08f, 22.0f)
                close()
                moveTo(144.08f, 158.66f)
                curveTo(138.55f, 166.29f, 130.66f, 170.0f, 120.0f, 170.0f)
                reflectiveCurveToRelative(-18.6f, -3.71f, -24.14f, -11.34f)
                curveTo(85.46f, 144.42f, 83.21f, 116.55f, 89.25f, 78.0f)
                horizontalLineToRelative(61.42f)
                curveTo(156.71f, 116.55f, 154.45f, 144.42f, 144.1f, 158.66f)
                close()
                moveTo(230.0f, 52.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 230.0f, 52.0f)
                close()
                moveTo(206.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 206.0f, 20.0f)
                close()
                moveTo(206.0f, 100.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 206.0f, 100.0f)
                close()
            }
        }
        .build()
        return `_champagne-light`!!
    }

private var `_champagne-light`: ImageVector? = null
