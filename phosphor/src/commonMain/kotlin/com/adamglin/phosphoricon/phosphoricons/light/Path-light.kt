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

public val LightGroup.`Path-light`: ImageVector
    get() {
        if (`_path-light` != null) {
            return `_path-light`!!
        }
        `_path-light` = Builder(name = "Path-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 170.0f)
                arcToRelative(30.05f, 30.05f, 0.0f, false, false, -29.4f, 24.0f)
                lineTo(72.0f, 194.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, -68.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, -76.0f)
                lineTo(72.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f)
                lineTo(72.0f, 114.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, 92.0f)
                horizontalLineToRelative(98.6f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 200.0f, 170.0f)
                close()
                moveTo(200.0f, 218.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 218.0f)
                close()
            }
        }
        .build()
        return `_path-light`!!
    }

private var `_path-light`: ImageVector? = null
