package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Radical: ImageVector
    get() {
        if (_radical != null) {
            return _radical!!
        }
        _radical = Builder(name = "Radical", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(133.55f)
                lineTo(87.49f, 210.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.0f, 0.0f)
                lineToRelative(-48.0f, -128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, -5.62f)
                lineTo(80.0f, 185.22f)
                lineToRelative(40.51f, -108.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 72.0f)
                horizontalLineTo(240.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 80.0f)
                close()
            }
        }
        .build()
        return _radical!!
    }

private var _radical: ImageVector? = null
