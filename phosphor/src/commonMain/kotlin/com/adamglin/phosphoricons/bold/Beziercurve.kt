package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Beziercurve: ImageVector
    get() {
        if (_beziercurve != null) {
            return _beziercurve!!
        }
        _beziercurve = Builder(name = "Beziercurve", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.28f, 141.0f)
                arcToRelative(100.61f, 100.61f, 0.0f, false, false, -31.4f, -49.0f)
                lineTo(240.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(161.94f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -67.88f, 0.0f)
                lineTo(16.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(63.12f, 92.0f)
                arcToRelative(100.61f, 100.61f, 0.0f, false, false, -31.4f, 49.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 56.0f, 143.74f)
                arcTo(76.66f, 76.66f, 0.0f, false, true, 97.15f, 98.53f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 61.7f, 0.0f)
                arcTo(76.66f, 76.66f, 0.0f, false, true, 200.0f, 143.74f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 224.28f, 141.0f)
                close()
                moveTo(40.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 188.0f)
                close()
                moveTo(128.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 92.0f)
                close()
                moveTo(216.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 188.0f)
                close()
            }
        }
        .build()
        return _beziercurve!!
    }

private var _beziercurve: ImageVector? = null
