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

public val ThinGroup.`Golf-thin`: ImageVector
    get() {
        if (`_golf-thin` != null) {
            return `_golf-thin`!!
        }
        `_golf-thin` = Builder(name = "Golf-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 100.0f)
                close()
                moveTo(132.0f, 124.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 132.0f, 124.0f)
                close()
                moveTo(212.0f, 96.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, -84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 212.0f, 96.0f)
                close()
                moveTo(204.0f, 96.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -76.0f, 76.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, false, 204.0f, 96.0f)
                close()
                moveTo(166.57f, 196.26f)
                curveTo(153.0f, 201.47f, 140.34f, 204.0f, 128.0f, 204.0f)
                reflectiveCurveToRelative(-25.0f, -2.53f, -38.57f, -7.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -2.86f, 7.48f)
                arcTo(119.31f, 119.31f, 0.0f, false, false, 124.0f, 211.91f)
                lineTo(124.0f, 248.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 211.91f)
                arcToRelative(119.31f, 119.31f, 0.0f, false, false, 37.43f, -8.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.86f, -7.48f)
                close()
            }
        }
        .build()
        return `_golf-thin`!!
    }

private var `_golf-thin`: ImageVector? = null
