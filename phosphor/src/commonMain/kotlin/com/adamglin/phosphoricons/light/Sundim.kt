package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Sundim: ImageVector
    get() {
        if (_sundim != null) {
            return _sundim!!
        }
        _sundim = Builder(name = "Sundim", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.0f, 40.0f)
                lineTo(122.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(190.0f, 128.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, true, true, -62.0f, -62.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, true, 190.0f, 128.0f)
                close()
                moveTo(178.0f, 128.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, false, -50.0f, 50.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, false, 178.0f, 128.0f)
                close()
                moveTo(59.76f, 68.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, -8.48f)
                lineToRelative(-8.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                close()
                moveTo(59.76f, 187.76f)
                lineTo(51.76f, 195.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, -8.48f)
                close()
                moveTo(195.76f, 51.76f)
                lineTo(187.76f, 59.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                close()
                moveTo(196.24f, 187.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineToRelative(8.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                close()
                moveTo(40.0f, 122.0f)
                lineTo(32.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(128.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 210.0f)
                close()
                moveTo(224.0f, 122.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _sundim!!
    }

private var _sundim: ImageVector? = null
