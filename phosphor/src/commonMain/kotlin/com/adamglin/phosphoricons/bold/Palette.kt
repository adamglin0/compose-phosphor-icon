package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.57f, 51.0f)
                arcTo(107.9f, 107.9f, 0.0f, false, false, 20.0f, 128.0f)
                curveToRelative(0.0f, 44.72f, 27.6f, 82.25f, 72.0f, 97.94f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 140.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(46.21f)
                arcToRelative(35.79f, 35.79f, 0.0f, false, false, 35.1f, -28.0f)
                arcTo(108.6f, 108.6f, 0.0f, false, false, 236.0f, 127.09f)
                arcTo(107.23f, 107.23f, 0.0f, false, false, 203.57f, 51.0f)
                close()
                moveTo(209.91f, 146.67f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, true, -11.7f, 9.3f)
                lineTo(152.0f, 155.97f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.0f, 11.3f)
                curveToRelative(-16.65f, -5.88f, -30.65f, -15.76f, -40.48f, -28.56f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 44.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 83.13f, -84.0f)
                lineTo(128.0f, 44.0f)
                arcToRelative(84.35f, 84.35f, 0.0f, false, true, 84.0f, 83.29f)
                arcTo(84.72f, 84.72f, 0.0f, false, true, 209.91f, 146.71f)
                close()
                moveTo(144.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 76.0f)
                close()
                moveTo(100.0f, 100.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 84.0f, 84.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 100.0f)
                close()
                moveTo(100.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 156.0f)
                close()
                moveTo(188.0f, 100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 188.0f, 100.0f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
