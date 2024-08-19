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

public val BoldGroup.Musicnotes: ImageVector
    get() {
        if (_musicnotes != null) {
            return _musicnotes!!
        }
        _musicnotes = Builder(name = "Musicnotes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.38f, 14.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.29f, -2.18f)
                lineToRelative(-128.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 56.0f)
                verticalLineTo(159.35f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 92.0f, 196.0f)
                verticalLineTo(113.37f)
                lineToRelative(104.0f, -26.0f)
                verticalLineToRelative(40.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 220.0f, 164.0f)
                verticalLineTo(24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 215.38f, 14.54f)
                close()
                moveTo(52.0f, 212.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 52.0f, 212.0f)
                close()
                moveTo(92.0f, 88.63f)
                verticalLineTo(65.37f)
                lineToRelative(104.0f, -26.0f)
                verticalLineTo(62.63f)
                close()
                moveTo(180.0f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 180.0f)
                close()
            }
        }
        .build()
        return _musicnotes!!
    }

private var _musicnotes: ImageVector? = null
