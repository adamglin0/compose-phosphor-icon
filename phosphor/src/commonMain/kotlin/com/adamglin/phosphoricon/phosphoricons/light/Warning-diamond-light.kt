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

public val LightGroup.`Warning-diamond-light`: ImageVector
    get() {
        if (`_warning-diamond-light` != null) {
            return `_warning-diamond-light`!!
        }
        `_warning-diamond-light` = Builder(name = "Warning-diamond-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.0f, 136.0f)
                lineTo(122.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 162.0f)
                close()
                moveTo(238.0f, 128.0f)
                arcToRelative(13.82f, 13.82f, 0.0f, false, true, -4.09f, 9.86f)
                lineToRelative(-96.0f, 96.06f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -19.72f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-96.0f, -96.06f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, true, 0.0f, -19.72f)
                lineToRelative(96.05f, -96.06f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 19.72f, 0.0f)
                lineToRelative(96.0f, 96.06f)
                arcTo(13.82f, 13.82f, 0.0f, false, true, 238.0f, 128.0f)
                close()
                moveTo(226.0f, 128.0f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, -0.57f, -1.38f)
                lineTo(129.38f, 30.56f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.76f, 0.0f)
                lineTo(30.57f, 126.62f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.76f)
                lineToRelative(96.05f, 96.06f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.76f, 0.0f)
                lineToRelative(96.05f, -96.06f)
                arcTo(1.94f, 1.94f, 0.0f, false, false, 226.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_warning-diamond-light`!!
    }

private var `_warning-diamond-light`: ImageVector? = null
