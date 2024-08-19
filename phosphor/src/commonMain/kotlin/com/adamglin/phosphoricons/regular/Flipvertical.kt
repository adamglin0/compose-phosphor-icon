package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Flipvertical: ImageVector
    get() {
        if (_flipvertical != null) {
            return _flipvertical!!
        }
        _flipvertical = Builder(name = "Flipvertical", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 120.0f)
                lineTo(216.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 6.23f, -30.74f)
                lineToRelative(-0.14f, -0.06f)
                lineToRelative(-159.93f, -64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 120.0f)
                close()
                moveTo(56.0f, 40.0f)
                lineTo(56.15f, 40.06f)
                lineTo(216.0f, 104.0f)
                lineTo(56.0f, 104.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(216.0f, 136.0f)
                lineTo(56.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.15f, 14.78f)
                lineToRelative(159.93f, -64.0f)
                lineToRelative(0.14f, -0.06f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 136.0f)
                close()
                moveTo(56.15f, 215.93f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 152.0f)
                lineTo(216.0f, 152.0f)
                close()
            }
        }
        .build()
        return _flipvertical!!
    }

private var _flipvertical: ImageVector? = null
