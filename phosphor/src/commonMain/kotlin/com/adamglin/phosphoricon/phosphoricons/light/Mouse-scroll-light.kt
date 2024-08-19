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

public val LightGroup.`Mouse-scroll-light`: ImageVector
    get() {
        if (`_mouse-scroll-light` != null) {
            return `_mouse-scroll-light`!!
        }
        `_mouse-scroll-light` = Builder(name = "Mouse-scroll-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 18.0f)
                lineTo(112.0f, 18.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 50.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, 62.0f, 62.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, 62.0f, -62.0f)
                lineTo(206.0f, 80.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 144.0f, 18.0f)
                close()
                moveTo(194.0f, 176.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, 50.0f)
                lineTo(112.0f, 226.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, -50.0f)
                lineTo(62.0f, 80.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, 50.0f, -50.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, 50.0f, 50.0f)
                close()
                moveTo(134.0f, 78.49f)
                verticalLineToRelative(99.0f)
                lineToRelative(13.76f, -13.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(122.0f, 177.51f)
                verticalLineToRelative(-99.0f)
                lineTo(108.24f, 92.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                close()
            }
        }
        .build()
        return `_mouse-scroll-light`!!
    }

private var `_mouse-scroll-light`: ImageVector? = null
