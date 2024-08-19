package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(229.67f, 133.62f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, -11.24f, 0.0f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 0.0f, -11.24f)
                lineToRelative(96.05f, -96.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 11.24f, 0.0f)
                lineToRelative(96.0f, 96.05f)
                arcTo(7.94f, 7.94f, 0.0f, false, true, 229.67f, 133.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.33f, 116.72f)
                lineTo(139.28f, 20.66f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.56f, 0.0f)
                lineToRelative(-96.0f, 96.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.56f)
                lineToRelative(96.05f, 96.06f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.56f, 0.0f)
                lineToRelative(96.05f, -96.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.56f)
                close()
                moveTo(128.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                lineTo(32.0f, 128.0f)
                lineTo(128.0f, 32.0f)
                lineTo(224.0f, 128.0f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
