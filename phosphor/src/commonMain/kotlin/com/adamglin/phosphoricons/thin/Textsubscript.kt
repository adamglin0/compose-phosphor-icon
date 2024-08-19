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

public val ThinGroup.Textsubscript: ImageVector
    get() {
        if (_textsubscript != null) {
            return _textsubscript!!
        }
        _textsubscript = Builder(name = "Textsubscript", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -6.4f)
                lineTo(232.0f, 148.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 228.0f, 120.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 124.0f)
                arcToRelative(20.23f, 20.23f, 0.0f, false, false, -2.89f, 5.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.55f, -2.66f)
                arcToRelative(28.34f, 28.34f, 0.0f, false, true, 4.0f, -7.52f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 44.72f, 33.7f)
                lineTo(200.0f, 204.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 208.0f)
                close()
                moveTo(146.62f, 53.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.64f, 0.4f)
                lineTo(92.0f, 109.89f)
                lineTo(43.0f, 53.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.24f)
                lineTo(86.71f, 116.0f)
                lineTo(37.0f, 173.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.0f, 5.24f)
                lineToRelative(49.0f, -56.51f)
                lineToRelative(49.0f, 56.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -5.24f)
                lineTo(97.29f, 116.0f)
                lineTo(147.0f, 58.62f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 146.62f, 53.0f)
                close()
            }
        }
        .build()
        return _textsubscript!!
    }

private var _textsubscript: ImageVector? = null
