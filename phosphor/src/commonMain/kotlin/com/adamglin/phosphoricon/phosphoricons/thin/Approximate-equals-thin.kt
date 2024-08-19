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

public val ThinGroup.`Approximate-equals-thin`: ImageVector
    get() {
        if (`_approximate-equals-thin` != null) {
            return `_approximate-equals-thin`!!
        }
        `_approximate-equals-thin` = Builder(name = "Approximate-equals-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.08f, 155.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.53f, 5.63f)
                curveTo(203.56f, 173.9f, 188.9f, 180.0f, 173.93f, 180.0f)
                arcToRelative(54.84f, 54.84f, 0.0f, false, true, -6.12f, -0.34f)
                curveToRelative(-15.0f, -1.65f, -28.6f, -9.0f, -41.72f, -16.14f)
                curveToRelative(-25.52f, -13.86f, -49.62f, -27.0f, -83.54f, 1.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.1f, -6.16f)
                curveToRelative(17.0f, -14.12f, 33.62f, -20.07f, 50.74f, -18.2f)
                curveToRelative(15.0f, 1.65f, 28.6f, 9.0f, 41.72f, 16.15f)
                curveToRelative(25.52f, 13.86f, 49.62f, 26.94f, 83.54f, -1.18f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.08f, 155.84f)
                close()
                moveTo(42.55f, 100.69f)
                curveToRelative(33.92f, -28.12f, 58.0f, -15.0f, 83.54f, -1.18f)
                curveToRelative(13.12f, 7.13f, 26.69f, 14.5f, 41.72f, 16.15f)
                arcToRelative(57.32f, 57.32f, 0.0f, false, false, 6.12f, 0.33f)
                curveToRelative(15.0f, 0.0f, 29.63f, -6.1f, 44.62f, -18.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.1f, -6.16f)
                curveToRelative(-33.92f, 28.13f, -58.0f, 15.0f, -83.54f, 1.18f)
                curveTo(116.79f, 85.35f, 103.22f, 78.0f, 88.19f, 76.34f)
                curveToRelative(-17.12f, -1.88f, -33.72f, 4.07f, -50.74f, 18.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.1f, 6.16f)
                close()
            }
        }
        .build()
        return `_approximate-equals-thin`!!
    }

private var `_approximate-equals-thin`: ImageVector? = null
