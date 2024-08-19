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

public val LightGroup.Foldersimple: ImageVector
    get() {
        if (_foldersimple != null) {
            return _foldersimple!!
        }
        _foldersimple = Builder(name = "Foldersimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 74.0f)
                lineTo(130.0f, 74.0f)
                lineTo(101.73f, 52.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.4f, -2.8f)
                lineTo(40.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.89f, 214.0f)
                arcTo(13.12f, 13.12f, 0.0f, false, false, 230.0f, 200.89f)
                lineTo(230.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 74.0f)
                close()
                moveTo(218.0f, 200.89f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, true, -1.11f, 1.11f)
                lineTo(40.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(93.33f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.2f, 0.4f)
                lineTo(124.4f, 84.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 86.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _foldersimple!!
    }

private var _foldersimple: ImageVector? = null
