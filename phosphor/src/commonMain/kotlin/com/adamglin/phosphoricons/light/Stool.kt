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

public val LightGroup.Stool: ImageVector
    get() {
        if (_stool != null) {
            return _stool!!
        }
        _stool = Builder(name = "Stool", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 64.0f)
                lineTo(198.0f, 40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(72.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 58.0f, 40.0f)
                lineTo(58.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 72.0f, 78.0f)
                horizontalLineToRelative(9.0f)
                lineTo(58.07f, 223.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 6.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.86f, -5.0f)
                lineTo(78.0f, 174.0f)
                lineTo(178.0f, 174.0f)
                lineToRelative(8.0f, 50.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.86f, -1.87f)
                lineTo(175.0f, 78.0f)
                horizontalLineToRelative(9.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 198.0f, 64.0f)
                close()
                moveTo(70.0f, 64.0f)
                lineTo(70.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(184.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(186.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(72.0f, 66.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 70.0f, 64.0f)
                close()
                moveTo(176.14f, 162.0f)
                lineTo(79.86f, 162.0f)
                lineTo(93.13f, 78.0f)
                horizontalLineToRelative(69.74f)
                close()
            }
        }
        .build()
        return _stool!!
    }

private var _stool: ImageVector? = null
