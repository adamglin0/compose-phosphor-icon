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

public val FillGroup.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) {
            return _numberCircleFour!!
        }
        _numberCircleFour = Builder(name = "NumberCircleFour", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.36f, 144.0f)
                lineTo(136.0f, 103.32f)
                lineTo(136.0f, 144.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(168.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(152.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.31f, -4.91f)
                lineToRelative(-56.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 160.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 152.0f)
                close()
            }
        }
        .build()
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
