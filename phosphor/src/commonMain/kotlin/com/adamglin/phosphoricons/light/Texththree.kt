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

public val LightGroup.TextHThree: ImageVector
    get() {
        if (_textHThree != null) {
            return _textHThree!!
        }
        _textHThree = Builder(name = "TextHThree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 180.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -58.29f, 23.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.58f, -8.39f)
                arcTo(22.0f, 22.0f, 0.0f, true, false, 212.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.92f, -9.44f)
                lineTo(228.48f, 118.0f)
                horizontalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.91f, 9.44f)
                lineToRelative(-22.52f, 32.18f)
                arcTo(34.06f, 34.06f, 0.0f, false, true, 246.0f, 180.0f)
                close()
                moveTo(144.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(54.0f)
                horizontalLineTo(46.0f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(122.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 50.0f)
                close()
            }
        }
        .build()
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
