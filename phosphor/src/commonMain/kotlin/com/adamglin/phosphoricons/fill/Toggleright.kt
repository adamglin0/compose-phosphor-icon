package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Toggleright: ImageVector
    get() {
        if (_toggleright != null) {
            return _toggleright!!
        }
        _toggleright = Builder(name = "Toggleright", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 56.0f)
                lineTo(80.0f, 56.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, 144.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f)
                close()
                moveTo(176.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 176.0f, 168.0f)
                close()
            }
        }
        .build()
        return _toggleright!!
    }

private var _toggleright: ImageVector? = null
