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

public val ThinGroup.`Goodreads-logo-thin`: ImageVector
    get() {
        if (`_goodreads-logo-thin` != null) {
            return `_goodreads-logo-thin`!!
        }
        `_goodreads-logo-thin` = Builder(name = "Goodreads-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(58.13f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 68.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 112.0f, 29.87f)
                verticalLineTo(168.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, 52.0f)
                curveToRelative(-17.72f, 0.0f, -35.28f, -8.75f, -44.72f, -22.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.56f, 4.58f)
                curveTo(87.61f, 217.91f, 107.74f, 228.0f, 128.0f, 228.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, -60.0f)
                verticalLineTo(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 184.0f, 28.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f)
                verticalLineTo(88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 104.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_goodreads-logo-thin`!!
    }

private var `_goodreads-logo-thin`: ImageVector? = null
