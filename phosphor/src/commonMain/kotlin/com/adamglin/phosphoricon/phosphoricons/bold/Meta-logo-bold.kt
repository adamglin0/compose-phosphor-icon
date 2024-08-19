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

public val BoldGroup.`Meta-logo-bold`: ImageVector
    get() {
        if (`_meta-logo-bold` != null) {
            return `_meta-logo-bold`!!
        }
        `_meta-logo-bold` = Builder(name = "Meta-logo-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 149.31f)
                curveToRelative(0.0f, 16.84f, -3.37f, 31.33f, -9.75f, 41.91f)
                curveTo(226.06f, 204.81f, 213.33f, 212.0f, 197.44f, 212.0f)
                curveToRelative(-30.33f, 0.0f, -50.72f, -38.05f, -72.3f, -78.33f)
                curveTo(109.46f, 104.41f, 90.0f, 68.0f, 74.0f, 68.0f)
                curveToRelative(-7.71f, 0.0f, -17.16f, 9.37f, -24.66f, 24.45f)
                arcTo(133.82f, 133.82f, 0.0f, false, false, 36.0f, 149.31f)
                curveToRelative(0.0f, 12.3f, 2.24f, 22.78f, 6.3f, 29.52f)
                curveToRelative(3.77f, 6.26f, 8.94f, 9.17f, 16.26f, 9.17f)
                curveToRelative(13.75f, 0.0f, 30.63f, -29.0f, 36.18f, -38.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.74f, 12.09f)
                curveToRelative(-8.91f, 15.28f, -16.53f, 26.0f, -24.0f, 33.78f)
                curveTo(80.75f, 206.56f, 70.0f, 212.0f, 58.56f, 212.0f)
                curveToRelative(-15.89f, 0.0f, -28.62f, -7.19f, -36.81f, -20.78f)
                curveTo(15.37f, 180.64f, 12.0f, 166.15f, 12.0f, 149.31f)
                curveTo(12.0f, 105.34f, 35.58f, 44.0f, 74.0f, 44.0f)
                curveToRelative(30.33f, 0.0f, 50.72f, 38.05f, 72.3f, 78.33f)
                curveTo(162.0f, 151.59f, 181.47f, 188.0f, 197.44f, 188.0f)
                curveToRelative(7.32f, 0.0f, 12.49f, -2.91f, 16.26f, -9.17f)
                curveToRelative(4.06f, -6.74f, 6.3f, -17.22f, 6.3f, -29.52f)
                arcToRelative(133.82f, 133.82f, 0.0f, false, false, -13.33f, -56.86f)
                curveTo(199.17f, 77.37f, 189.72f, 68.0f, 182.0f, 68.0f)
                curveToRelative(-5.72f, 0.0f, -12.61f, 5.0f, -20.49f, 14.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.74f, -15.0f)
                curveTo(155.62f, 51.8f, 168.45f, 44.0f, 182.0f, 44.0f)
                curveToRelative(17.65f, 0.0f, 34.0f, 13.41f, 46.15f, 37.76f)
                arcTo(159.0f, 159.0f, 0.0f, false, true, 244.0f, 149.31f)
                close()
            }
        }
        .build()
        return `_meta-logo-bold`!!
    }

private var `_meta-logo-bold`: ImageVector? = null
