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

public val BoldGroup.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) {
            return _smileyAngry!!
        }
        _smileyAngry = Builder(name = "SmileyAngry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 92.0f, 156.0f)
                close()
                moveTo(164.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 164.0f, 124.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -84.0f, 84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 212.0f, 128.0f)
                close()
                moveTo(85.34f, 102.0f)
                lineToRelative(36.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.32f, 0.0f)
                lineToRelative(36.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.32f, -20.0f)
                lineTo(128.0f, 101.58f)
                lineTo(98.66f, 82.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.32f, 20.0f)
                close()
                moveTo(154.0f, 167.12f)
                arcToRelative(51.1f, 51.1f, 0.0f, false, false, -52.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 20.76f)
                arcToRelative(27.13f, 27.13f, 0.0f, false, true, 28.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -20.76f)
                close()
            }
        }
        .build()
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
