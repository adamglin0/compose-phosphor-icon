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

public val ThinGroup.`Handbag-simple-thin`: ImageVector
    get() {
        if (`_handbag-simple-thin` != null) {
            return `_handbag-simple-thin`!!
        }
        `_handbag-simple-thin` = Builder(name = "Handbag-simple-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.92f, 198.59f)
                lineToRelative(-14.26f, -120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -10.59f)
                horizontalLineTo(172.0f)
                verticalLineTo(64.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(46.33f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 10.59f)
                lineToRelative(-14.26f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 23.0f, 207.94f)
                arcTo(12.11f, 12.11f, 0.0f, false, false, 32.08f, 212.0f)
                horizontalLineTo(223.92f)
                arcToRelative(12.11f, 12.11f, 0.0f, false, false, 9.06f, -4.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 235.92f, 198.59f)
                close()
                moveTo(92.0f, 64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(92.0f)
                close()
                moveTo(227.0f, 202.63f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, -3.08f, 1.37f)
                horizontalLineTo(32.08f)
                arcTo(4.08f, 4.08f, 0.0f, false, true, 29.0f, 202.63f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.0f, -3.09f)
                lineToRelative(14.25f, -120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -3.54f)
                horizontalLineTo(209.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.05f, 3.54f)
                lineToRelative(14.25f, 120.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 227.0f, 202.63f)
                close()
            }
        }
        .build()
        return `_handbag-simple-thin`!!
    }

private var `_handbag-simple-thin`: ImageVector? = null
