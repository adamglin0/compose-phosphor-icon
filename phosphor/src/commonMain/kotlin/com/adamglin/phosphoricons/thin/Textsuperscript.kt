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

public val ThinGroup.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) {
            return _textSuperscript!!
        }
        _textSuperscript = Builder(name = "TextSuperscript", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -6.4f)
                lineTo(232.0f, 84.05f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 213.22f, 52.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.08f, 13.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.55f, -2.67f)
                arcToRelative(28.34f, 28.34f, 0.0f, false, true, 4.0f, -7.52f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 44.72f, 33.7f)
                lineTo(200.0f, 140.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 144.0f)
                close()
                moveTo(146.62f, 77.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.64f, 0.4f)
                lineTo(92.0f, 133.89f)
                lineTo(43.0f, 77.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, 5.24f)
                lineTo(86.71f, 140.0f)
                lineTo(37.0f, 197.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.0f, 5.24f)
                lineToRelative(49.0f, -56.51f)
                lineToRelative(49.0f, 56.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -5.24f)
                lineTo(97.29f, 140.0f)
                lineTo(147.0f, 82.62f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 146.62f, 77.0f)
                close()
            }
        }
        .build()
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
