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

public val BoldGroup.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) {
            return _numberCircleSeven!!
        }
        _numberCircleSeven = Builder(name = "NumberCircleSeven", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(161.83f, 81.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.45f, 11.0f)
                lineToRelative(-32.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.56f, -8.2f)
                lineTo(134.87f, 100.0f)
                lineTo(104.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 161.83f, 81.12f)
                close()
            }
        }
        .build()
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
