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

public val LightGroup.Radical: ImageVector
    get() {
        if (_radical != null) {
            return _radical!!
        }
        _radical = Builder(name = "Radical", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(86.0f)
                horizontalLineTo(132.16f)
                lineTo(85.62f, 210.11f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.24f, 0.0f)
                lineToRelative(-48.0f, -128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.24f, -4.22f)
                lineTo(80.0f, 190.91f)
                lineToRelative(42.38f, -113.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 128.0f, 74.0f)
                horizontalLineTo(240.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 80.0f)
                close()
            }
        }
        .build()
        return _radical!!
    }

private var _radical: ImageVector? = null
