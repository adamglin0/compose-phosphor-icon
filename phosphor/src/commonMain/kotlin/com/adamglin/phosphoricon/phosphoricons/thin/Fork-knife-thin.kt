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

public val ThinGroup.`Fork-knife-thin`: ImageVector
    get() {
        if (`_fork-knife-thin` != null) {
            return `_fork-knife-thin`!!
        }
        `_fork-knife-thin` = Builder(name = "Fork-knife-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 88.0f)
                lineTo(76.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(84.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(212.0f, 40.0f)
                lineTo(212.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(204.0f, 172.0f)
                lineTo(152.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                arcToRelative(264.27f, 264.27f, 0.0f, false, true, 7.11f, -55.94f)
                curveToRelative(9.47f, -39.22f, 27.21f, -65.41f, 51.31f, -75.74f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 40.0f)
                close()
                moveTo(204.0f, 46.46f)
                curveTo(162.25f, 70.33f, 156.81f, 145.75f, 156.1f, 164.0f)
                lineTo(204.0f, 164.0f)
                close()
                moveTo(116.0f, 39.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.9f, 1.32f)
                lineToRelative(8.0f, 47.66f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -72.0f, 0.0f)
                lineToRelative(8.0f, -47.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.9f, -1.32f)
                lineToRelative(-8.0f, 48.0f)
                arcTo(4.89f, 4.89f, 0.0f, false, false, 36.0f, 88.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, false, 40.0f, 43.81f)
                lineTo(76.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(84.0f, 131.81f)
                arcTo(44.06f, 44.06f, 0.0f, false, false, 124.0f, 88.0f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, false, 0.0f, -0.66f)
                close()
            }
        }
        .build()
        return `_fork-knife-thin`!!
    }

private var `_fork-knife-thin`: ImageVector? = null
