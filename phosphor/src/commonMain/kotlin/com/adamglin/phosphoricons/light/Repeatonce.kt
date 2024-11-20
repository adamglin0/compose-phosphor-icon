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

public val LightGroup.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) {
            return _repeatOnce!!
        }
        _repeatOnce = Builder(name = "RepeatOnce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 128.0f)
                arcTo(70.08f, 70.08f, 0.0f, false, true, 96.0f, 58.0f)
                lineTo(209.51f, 58.0f)
                lineTo(195.76f, 44.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(209.51f, 70.0f)
                lineTo(96.0f, 70.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(224.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, true, -58.0f, 58.0f)
                lineTo(46.49f, 186.0f)
                lineToRelative(13.75f, -13.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(46.49f, 198.0f)
                lineTo(160.0f, 198.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, false, 70.0f, -70.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 122.0f)
                close()
                moveTo(136.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(142.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.68f, -5.37f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 5.36f, 10.73f)
                lineTo(130.0f, 113.7f)
                lineTo(130.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 136.0f, 158.0f)
                close()
            }
        }
        .build()
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
