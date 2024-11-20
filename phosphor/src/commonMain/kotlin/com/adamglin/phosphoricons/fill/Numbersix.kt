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

public val FillGroup.NumberSix: ImageVector
    get() {
        if (_numberSix != null) {
            return _numberSix!!
        }
        _numberSix = Builder(name = "NumberSix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -38.3f, -65.62f)
                lineTo(123.38f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.86f, 8.0f)
                lineToRelative(-16.52f, 28.61f)
                arcTo(44.79f, 44.79f, 0.0f, false, true, 128.0f, 104.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, 88.0f)
                close()
                moveTo(156.0f, 148.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 156.0f, 148.0f)
                close()
            }
        }
        .build()
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
