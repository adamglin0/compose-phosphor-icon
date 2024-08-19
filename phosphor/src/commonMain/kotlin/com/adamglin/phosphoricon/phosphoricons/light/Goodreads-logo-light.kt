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

public val LightGroup.`Goodreads-logo-light`: ImageVector
    get() {
        if (`_goodreads-logo-light` != null) {
            return `_goodreads-logo-light`!!
        }
        `_goodreads-logo-light` = Builder(name = "Goodreads-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineTo(51.4f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 66.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 112.0f, 36.6f)
                verticalLineTo(168.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, 50.0f)
                curveToRelative(-17.09f, 0.0f, -34.0f, -8.41f, -43.08f, -21.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.84f, 6.86f)
                curveTo(86.34f, 219.57f, 107.11f, 230.0f, 128.0f, 230.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, 62.0f, -62.0f)
                verticalLineTo(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 184.0f, 26.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, -50.0f)
                verticalLineTo(88.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 100.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 128.0f, 162.0f)
                close()
            }
        }
        .build()
        return `_goodreads-logo-light`!!
    }

private var `_goodreads-logo-light`: ImageVector? = null
