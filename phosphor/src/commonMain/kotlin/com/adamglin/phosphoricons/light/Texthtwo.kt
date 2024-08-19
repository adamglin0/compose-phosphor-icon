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

public val LightGroup.Texthtwo: ImageVector
    get() {
        if (_texthtwo != null) {
            return _texthtwo!!
        }
        _texthtwo = Builder(name = "Texthtwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.0f, 56.0f)
                lineTo(150.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(138.0f, 122.0f)
                lineTo(46.0f, 122.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(34.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(54.0f)
                horizontalLineToRelative(92.0f)
                lineTo(138.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(240.0f, 202.0f)
                lineTo(204.0f, 202.0f)
                lineTo(240.0f, 154.05f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 187.71f, 126.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 199.0f, 130.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 14.47f, -11.82f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 16.87f, 28.66f)
                lineTo(187.2f, 204.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 192.0f, 214.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _texthtwo!!
    }

private var _texthtwo: ImageVector? = null
