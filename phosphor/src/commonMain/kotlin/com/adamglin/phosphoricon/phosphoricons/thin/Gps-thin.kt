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

public val ThinGroup.`Gps-thin`: ImageVector
    get() {
        if (`_gps-thin` != null) {
            return `_gps-thin`!!
        }
        `_gps-thin` = Builder(name = "Gps-thin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 124.0f)
                horizontalLineTo(211.9f)
                arcTo(84.11f, 84.11f, 0.0f, false, false, 132.0f, 44.1f)
                verticalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(44.1f)
                arcTo(84.11f, 84.11f, 0.0f, false, false, 44.1f, 124.0f)
                horizontalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(44.1f)
                arcTo(84.11f, 84.11f, 0.0f, false, false, 124.0f, 211.9f)
                verticalLineTo(240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(211.9f)
                arcTo(84.11f, 84.11f, 0.0f, false, false, 211.9f, 132.0f)
                horizontalLineTo(240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(128.0f, 204.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, -76.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 204.0f)
                close()
            }
        }
        .build()
        return `_gps-thin`!!
    }

private var `_gps-thin`: ImageVector? = null
