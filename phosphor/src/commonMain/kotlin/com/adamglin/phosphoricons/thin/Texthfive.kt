package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.TextHFive: ImageVector
    get() {
        if (_textHFive != null) {
            return _textHFive!!
        }
        _textHFive = Builder(name = "TextHFive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 180.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                arcToRelative(31.62f, 31.62f, 0.0f, false, true, -22.86f, -9.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.72f, -5.6f)
                arcTo(23.67f, 23.67f, 0.0f, false, false, 212.0f, 204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                arcToRelative(23.67f, 23.67f, 0.0f, false, false, -17.14f, 6.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.81f, -3.46f)
                lineToRelative(8.0f, -48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 108.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(203.39f)
                lineToRelative(-5.87f, 35.21f)
                arcTo(33.26f, 33.26f, 0.0f, false, true, 212.0f, 148.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 244.0f, 180.0f)
                close()
                moveTo(144.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(120.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 144.0f, 52.0f)
                close()
            }
        }
        .build()
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
