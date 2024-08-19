package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Texttslash: ImageVector
    get() {
        if (_texttslash != null) {
            return _texttslash!!
        }
        _texttslash = Builder(name = "Texttslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(128.0f, 72.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                lineTo(184.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(168.0f, 88.0f)
                lineTo(128.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
                moveTo(189.27f, 198.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.29f, -0.75f)
                lineToRelative(-42.0f, -48.0f)
                lineTo(135.98f, 176.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(108.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(12.0f)
                lineTo(120.0f, 131.0f)
                lineTo(88.0f, 94.43f)
                lineTo(88.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(72.0f, 80.0f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, 0.63f, -3.13f)
                lineTo(66.0f, 69.27f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 78.0f, 58.73f)
                lineToRelative(112.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 189.27f, 198.0f)
                close()
            }
        }
        .build()
        return _texttslash!!
    }

private var _texttslash: ImageVector? = null
