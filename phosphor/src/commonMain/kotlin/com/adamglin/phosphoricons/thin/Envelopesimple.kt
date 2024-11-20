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

public val ThinGroup.EnvelopeSimple: ImageVector
    get() {
        if (_envelopeSimple != null) {
            return _envelopeSimple!!
        }
        _envelopeSimple = Builder(name = "EnvelopeSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 52.0f)
                lineTo(32.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
                moveTo(213.72f, 60.0f)
                lineTo(128.0f, 138.57f)
                lineTo(42.28f, 60.0f)
                close()
                moveTo(216.0f, 196.0f)
                lineTo(40.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 65.09f)
                lineTo(125.3f, 147.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.4f, 0.0f)
                lineTo(220.0f, 65.09f)
                lineTo(220.0f, 192.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 196.0f)
                close()
            }
        }
        .build()
        return _envelopeSimple!!
    }

private var _envelopeSimple: ImageVector? = null
