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

public val ThinGroup.`Wine-thin`: ImageVector
    get() {
        if (`_wine-thin` != null) {
            return `_wine-thin`!!
        }
        `_wine-thin` = Builder(name = "Wine-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.5f, 104.8f)
                lineTo(179.72f, 30.87f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 175.89f, 28.0f)
                lineTo(80.11f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.83f, 2.87f)
                lineTo(54.5f, 104.8f)
                arcToRelative(59.51f, 59.51f, 0.0f, false, false, 16.32f, 60.62f)
                arcTo(83.39f, 83.39f, 0.0f, false, false, 124.0f, 187.91f)
                lineTo(124.0f, 236.0f)
                lineTo(88.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                lineTo(132.0f, 236.0f)
                lineTo(132.0f, 187.91f)
                arcToRelative(83.39f, 83.39f, 0.0f, false, false, 53.18f, -22.49f)
                arcTo(59.51f, 59.51f, 0.0f, false, false, 201.5f, 104.8f)
                close()
                moveTo(83.1f, 36.0f)
                horizontalLineToRelative(89.8f)
                lineToRelative(20.93f, 71.06f)
                curveToRelative(0.43f, 1.49f, 0.8f, 3.0f, 1.1f, 4.47f)
                curveToRelative(-23.64f, 10.47f, -50.76f, 0.18f, -65.12f, -7.1f)
                curveToRelative(-28.22f, -14.29f, -49.48f, -14.1f, -63.88f, -10.14f)
                close()
                moveTo(179.72f, 159.57f)
                arcToRelative(75.68f, 75.68f, 0.0f, false, true, -103.44f, 0.0f)
                arcToRelative(51.53f, 51.53f, 0.0f, false, true, -14.11f, -52.51f)
                lineToRelative(1.0f, -3.46f)
                curveToRelative(12.66f, -4.87f, 33.45f, -7.0f, 63.0f, 8.0f)
                curveTo(137.0f, 117.0f, 154.33f, 124.0f, 172.8f, 124.0f)
                arcTo(62.78f, 62.78f, 0.0f, false, false, 196.0f, 119.78f)
                arcTo(51.26f, 51.26f, 0.0f, false, true, 179.72f, 159.57f)
                close()
            }
        }
        .build()
        return `_wine-thin`!!
    }

private var `_wine-thin`: ImageVector? = null
