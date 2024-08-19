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

public val FillGroup.Moonstars: ImageVector
    get() {
        if (_moonstars != null) {
            return _moonstars!!
        }
        _moonstars = Builder(name = "Moonstars", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(216.0f, 104.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(200.0f, 104.0f)
                lineTo(184.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(200.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 96.0f)
                close()
                moveTo(144.0f, 56.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(168.0f, 56.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(168.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(209.14f, 150.33f)
                arcTo(88.07f, 88.07f, 0.0f, false, true, 105.67f, 46.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.6f, -9.06f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 218.2f, 160.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.06f, -10.6f)
                close()
            }
        }
        .build()
        return _moonstars!!
    }

private var _moonstars: ImageVector? = null
