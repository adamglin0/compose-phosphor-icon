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

public val ThinGroup.EnvelopeSimpleOpen: ImageVector
    get() {
        if (_envelopeSimpleOpen != null) {
            return _envelopeSimpleOpen!!
        }
        _envelopeSimpleOpen = Builder(name = "EnvelopeSimpleOpen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.22f, 92.67f)
                lineToRelative(-96.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.44f, 0.0f)
                lineToRelative(-96.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 96.0f)
                verticalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 226.22f, 92.67f)
                close()
                moveTo(128.0f, 36.81f)
                lineTo(217.0f, 96.11f)
                lineTo(144.17f, 148.0f)
                horizontalLineTo(111.83f)
                lineTo(39.05f, 96.11f)
                close()
                moveTo(216.0f, 204.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(103.76f)
                lineToRelative(72.22f, 51.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.33f, 0.74f)
                horizontalLineToRelative(34.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.33f, -0.74f)
                lineTo(220.0f, 103.76f)
                verticalLineTo(200.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 204.0f)
                close()
            }
        }
        .build()
        return _envelopeSimpleOpen!!
    }

private var _envelopeSimpleOpen: ImageVector? = null
