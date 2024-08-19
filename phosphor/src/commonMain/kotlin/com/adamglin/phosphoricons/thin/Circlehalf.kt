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

public val ThinGroup.Circlehalf: ImageVector
    get() {
        if (_circlehalf != null) {
            return _circlehalf!!
        }
        _circlehalf = Builder(name = "Circlehalf", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(132.0f, 36.09f)
                arcToRelative(91.58f, 91.58f, 0.0f, false, true, 24.0f, 4.27f)
                lineTo(156.0f, 215.64f)
                arcToRelative(91.58f, 91.58f, 0.0f, false, true, -24.0f, 4.27f)
                close()
                moveTo(164.0f, 43.34f)
                arcToRelative(92.21f, 92.21f, 0.0f, false, true, 24.0f, 15.0f)
                lineTo(188.0f, 197.69f)
                arcToRelative(92.21f, 92.21f, 0.0f, false, true, -24.0f, 15.0f)
                close()
                moveTo(36.0f, 128.0f)
                arcToRelative(92.11f, 92.11f, 0.0f, false, true, 88.0f, -91.91f)
                lineTo(124.0f, 219.91f)
                arcTo(92.11f, 92.11f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(196.0f, 189.9f)
                lineTo(196.0f, 66.1f)
                arcToRelative(91.83f, 91.83f, 0.0f, false, true, 0.0f, 123.8f)
                close()
            }
        }
        .build()
        return _circlehalf!!
    }

private var _circlehalf: ImageVector? = null
