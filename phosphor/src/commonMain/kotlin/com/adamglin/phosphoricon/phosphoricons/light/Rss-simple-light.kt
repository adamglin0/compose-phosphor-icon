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

public val LightGroup.`Rss-simple-light`: ImageVector
    get() {
        if (`_rss-simple-light` != null) {
            return `_rss-simple-light`!!
        }
        `_rss-simple-light` = Builder(name = "Rss-simple-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                curveToRelative(0.0f, -80.5f, -65.5f, -146.0f, -146.0f, -146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                curveTo(151.12f, 34.0f, 222.0f, 104.88f, 222.0f, 192.0f)
                close()
                moveTo(64.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, 74.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(86.1f, 86.1f, 0.0f, false, false, 64.0f, 106.0f)
                close()
                moveTo(68.0f, 178.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 68.0f, 178.0f)
                close()
            }
        }
        .build()
        return `_rss-simple-light`!!
    }

private var `_rss-simple-light`: ImageVector? = null
