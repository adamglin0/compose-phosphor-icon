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

public val BoldGroup.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) {
            return _numberSeven!!
        }
        _numberSeven = Builder(name = "NumberSeven", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.49f, 51.45f)
                lineToRelative(-48.0f, 160.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 220.0f)
                arcToRelative(11.82f, 11.82f, 0.0f, false, true, -3.45f, -0.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.0f, -14.94f)
                lineTo(151.87f, 60.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.49f, 15.45f)
                close()
            }
        }
        .build()
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
