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

public val ThinGroup.`Globe-thin`: ImageVector
    get() {
        if (`_globe-thin` != null) {
            return `_globe-thin`!!
        }
        `_globe-thin` = Builder(name = "Globe-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                horizontalLineToRelative(0.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 218.61f)
                curveToRelative(-6.33f, -6.09f, -23.0f, -24.41f, -31.27f, -54.61f)
                horizontalLineToRelative(62.54f)
                curveTo(151.0f, 194.2f, 134.33f, 212.52f, 128.0f, 218.61f)
                close()
                moveTo(94.82f, 156.0f)
                arcToRelative(140.42f, 140.42f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(66.36f)
                arcToRelative(140.42f, 140.42f, 0.0f, false, true, 0.0f, 56.0f)
                close()
                moveTo(128.0f, 37.39f)
                curveToRelative(6.33f, 6.09f, 23.0f, 24.41f, 31.27f, 54.61f)
                lineTo(96.73f, 92.0f)
                curveTo(105.0f, 61.8f, 121.67f, 43.48f, 128.0f, 37.39f)
                close()
                moveTo(169.41f, 100.0f)
                horizontalLineToRelative(46.23f)
                arcToRelative(92.09f, 92.09f, 0.0f, false, true, 0.0f, 56.0f)
                lineTo(169.41f, 156.0f)
                arcToRelative(152.65f, 152.65f, 0.0f, false, false, 0.0f, -56.0f)
                close()
                moveTo(212.66f, 92.0f)
                horizontalLineToRelative(-45.0f)
                arcToRelative(129.39f, 129.39f, 0.0f, false, false, -29.19f, -55.4f)
                arcTo(92.25f, 92.25f, 0.0f, false, true, 212.66f, 92.0f)
                close()
                moveTo(117.54f, 36.6f)
                arcTo(129.39f, 129.39f, 0.0f, false, false, 88.35f, 92.0f)
                horizontalLineToRelative(-45.0f)
                arcTo(92.25f, 92.25f, 0.0f, false, true, 117.54f, 36.6f)
                close()
                moveTo(40.36f, 100.0f)
                lineTo(86.59f, 100.0f)
                arcToRelative(152.65f, 152.65f, 0.0f, false, false, 0.0f, 56.0f)
                lineTo(40.36f, 156.0f)
                arcToRelative(92.09f, 92.09f, 0.0f, false, true, 0.0f, -56.0f)
                close()
                moveTo(43.36f, 164.0f)
                horizontalLineToRelative(45.0f)
                arcToRelative(129.39f, 129.39f, 0.0f, false, false, 29.19f, 55.4f)
                arcTo(92.25f, 92.25f, 0.0f, false, true, 43.34f, 164.0f)
                close()
                moveTo(138.48f, 219.4f)
                arcTo(129.39f, 129.39f, 0.0f, false, false, 167.65f, 164.0f)
                horizontalLineToRelative(45.0f)
                arcTo(92.25f, 92.25f, 0.0f, false, true, 138.46f, 219.4f)
                close()
            }
        }
        .build()
        return `_globe-thin`!!
    }

private var `_globe-thin`: ImageVector? = null
