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

public val LightGroup.`Intersect-light`: ImageVector
    get() {
        if (`_intersect-light` != null) {
            return `_intersect-light`!!
        }
        `_intersect-light` = Builder(name = "Intersect-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.91f, 83.09f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, -89.82f, 89.82f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, 89.82f, -89.82f)
                close()
                moveTo(30.0f, 96.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 160.49f, 82.0f)
                lineTo(160.0f, 82.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, false, -78.0f, 78.0f)
                curveToRelative(0.0f, 0.17f, 0.0f, 0.33f, 0.0f, 0.49f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 30.0f, 96.0f)
                close()
                moveTo(94.0f, 160.0f)
                arcToRelative(65.62f, 65.62f, 0.0f, false, true, 6.0f, -27.49f)
                lineTo(123.49f, 156.0f)
                arcTo(65.62f, 65.62f, 0.0f, false, true, 96.0f, 162.0f)
                curveToRelative(-0.65f, 0.0f, -1.3f, 0.0f, -2.0f, -0.05f)
                curveTo(94.0f, 161.3f, 94.0f, 160.65f, 94.0f, 160.0f)
                close()
                moveTo(134.23f, 149.75f)
                lineTo(106.23f, 121.75f)
                arcToRelative(66.47f, 66.47f, 0.0f, false, true, 15.52f, -15.52f)
                lineToRelative(28.0f, 28.0f)
                arcTo(66.47f, 66.47f, 0.0f, false, true, 134.23f, 149.75f)
                close()
                moveTo(162.0f, 96.0f)
                arcToRelative(65.62f, 65.62f, 0.0f, false, true, -6.0f, 27.49f)
                lineTo(132.51f, 100.0f)
                arcTo(65.62f, 65.62f, 0.0f, false, true, 160.0f, 94.0f)
                curveToRelative(0.65f, 0.0f, 1.3f, 0.0f, 1.95f, 0.0f)
                curveTo(162.0f, 94.7f, 162.0f, 95.35f, 162.0f, 96.0f)
                close()
                moveTo(160.0f, 226.0f)
                arcToRelative(66.1f, 66.1f, 0.0f, false, true, -64.49f, -52.0f)
                lineTo(96.0f, 174.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, false, 78.0f, -78.0f)
                curveToRelative(0.0f, -0.17f, 0.0f, -0.33f, 0.0f, -0.49f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 160.0f, 226.0f)
                close()
            }
        }
        .build()
        return `_intersect-light`!!
    }

private var `_intersect-light`: ImageVector? = null
